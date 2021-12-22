/**
 * Class for creating the Frames that are used in the GUI.
 * This is where the majority of the work is done.
 */

import java.awt.Component;
import javax.swing.*;

public class ViewModel {
    public JFrame frame;
    private String[] currencies = {"Dollar", "Euro", "Yen", "Pound", "Won", "Peso", "Rupee"};
    private JComboBox<String> convert_from_dropdown;
    private JComboBox<String> convert_to_dropdown;
    public ViewModel()
    {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(500, 500);
        frame.setVisible(true);

        JPanel from = new JPanel();
        JLabel convert_from = new JLabel("Convert From: ");
        JComboBox<String> convert_from_dropdown = new JComboBox<String>(currencies);
        convert_from_dropdown.setSelectedIndex(-1);

        from.add(convert_from);
        from.add(convert_from_dropdown);

        JPanel to = new JPanel();
        JLabel convert_to = new JLabel("Convert To: ");
        JComboBox<String> convert_to_dropdown = new JComboBox<String>(currencies);
        convert_to_dropdown.setSelectedIndex(-1);

        to.add(convert_to);
        to.add(convert_to_dropdown);

        JPanel buttons = new JPanel();
        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");

        buttons.add(submit);
        buttons.add(reset);

        from.setAlignmentX(Component.CENTER_ALIGNMENT);
        to.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttons.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.getContentPane().add(from);
        frame.getContentPane().add(to);
        frame.getContentPane().add(buttons);

        submit.addActionListener(e ->
        {

            String selected_from = convert_from_dropdown.getItemAt(convert_from_dropdown.getSelectedIndex());
            String selected_to = convert_to_dropdown.getItemAt(convert_to_dropdown.getSelectedIndex());

            frame.dispose();
            JFrame inputFrame = new JFrame("Currency Converter");
            inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            inputFrame.getContentPane().setLayout(new BoxLayout(inputFrame.getContentPane(), BoxLayout.Y_AXIS));
            inputFrame.setSize(500, 500);
            inputFrame.setVisible(true);

            JPanel convert_from_panel = new JPanel();
            JLabel selected_from_label = new JLabel(selected_from+": ");
            JTextField from_text = new JTextField(10);

            convert_from_panel.add(selected_from_label);
            convert_from_panel.add(from_text);

            JPanel convert_buttons = new JPanel();
            JButton convert_submit = new JButton("Convert");
            JButton start_over = new JButton("Start Over");

            convert_buttons.add(convert_submit);
            convert_buttons.add(start_over);

            convert_from_panel.setAlignmentX(Component.CENTER_ALIGNMENT);
            convert_buttons.setAlignmentX(Component.CENTER_ALIGNMENT);

            inputFrame.getContentPane().add(convert_from_panel);
            inputFrame.getContentPane().add(convert_buttons);

            Conversions conv = new Conversions();

            convert_submit.addActionListener(i ->
            {
                Double f = Double.parseDouble(from_text.getText());
                JPanel converted_panel = new JPanel();
                JLabel converted_jlabel_1 = new JLabel
                (
                    f+" "+selected_from+"'s is "+conv.conversions(selected_from, selected_to, f)+" "+selected_to+"'s"
                );

                converted_panel.add(converted_jlabel_1);
                convert_submit.setVisible(false);

                inputFrame.getContentPane().add(converted_panel);
            });

            start_over.addActionListener(i ->
            {
                inputFrame.dispose();
                ViewModel x = new ViewModel();
                x.getFrame();
            });

        });

        reset.addActionListener(e ->
        {
            convert_from_dropdown.setSelectedIndex(-1);
            convert_to_dropdown.setSelectedIndex(-1);
        });
    }

    public JFrame getFrame()
    {
        return frame;
    }

    public String getSelectedFrom()
    {
        return convert_from_dropdown.getItemAt(convert_from_dropdown.getSelectedIndex());
    }

    public String getSelectedTo()
    {
        return convert_to_dropdown.getItemAt(convert_to_dropdown.getSelectedIndex());
    }
}
