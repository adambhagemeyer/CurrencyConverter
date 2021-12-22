/**
 * Class implementing the other Conversion classes.
 * compares input strings in order to decide which method
 * to use and then returns the converted amount to be used
 * in ViewModel
 */

public class Conversions {
    public double conversions(String from, String to, double value)
    {
        if(from == "Dollar")
        {
            DollarConversions dollar = new DollarConversions();
            if(to == "Euro")
                return dollar.DollarToEuro(value);
            else if(to == "Yen")
                return dollar.DollarToYen(value);
            else if(to == "Pound")
                return dollar.DollarToPound(value);
            else if(to == "Won")
                return dollar.DollarToWon(value);
            else if(to == "Peso")
                return dollar.DollarToPeso(value);
            else
                return dollar.DollarToRupee(value);
        }

        if(from == "Euro")
        {
            EuroConversion dollar = new EuroConversion();
            if(to == "Dollar")
                return dollar.EuroToDollar(value);
            else if(to == "Yen")
                return dollar.EuroToYen(value);
            else if(to == "Pound")
                return dollar.EuroToPound(value);
            else if(to == "Won")
                return dollar.EuroToWon(value);
            else if(to == "Peso")
                return dollar.EuroToPeso(value);
            else
                return dollar.EuroToRupee(value);
        }

        if(from == "Yen")
        {
            YenConversion dollar = new YenConversion();
            if(to == "Dollar")
                return dollar.YenToDollar(value);
            else if(to == "Euro")
                return dollar.YenToEuro(value);
            else if(to == "Pound")
                return dollar.YenToPound(value);
            else if(to == "Won")
                return dollar.YenToWon(value);
            else if(to == "Peso")
                return dollar.YenToPeso(value);
            else
                return dollar.YenToRupee(value);
        }

        if(from == "Pound")
        {
            PoundConversion dollar = new PoundConversion();
            if(to == "Dollar")
                return dollar.PoundToDollar(value);
            else if(to == "Euro")
                return dollar.PoundToEuro(value);
            else if(to == "Yen")
                return dollar.PoundToYen(value);
            else if(to == "Won")
                return dollar.PoundToWon(value);
            else if(to == "Peso")
                return dollar.PoundToPeso(value);
            else
                return dollar.PoundToRupee(value);
        }

        if(from == "Won")
        {
            WonConversion dollar = new WonConversion();
            if(to == "Dollar")
                return dollar.WonToDollar(value);
            else if(to == "Euro")
                return dollar.WonToEuro(value);
            else if(to == "Yen")
                return dollar.WonToYen(value);
            else if(to == "Pound")
                return dollar.WonToPound(value);
            else if(to == "Peso")
                return dollar.WonToPeso(value);
            else
                return dollar.WonToRupee(value);
        }

        if(from == "Peso")
        {
            PesoConversion dollar = new PesoConversion();
            if(to == "Dollar")
                return dollar.PesoToDollar(value);
            else if(to == "Euro")
                return dollar.PesoToEuro(value);
            else if(to == "Yen")
                return dollar.PesoToYen(value);
            else if(to == "Pound")
                return dollar.PesoToPound(value);
            else if(to == "Won")
                return dollar.PesoToWon(value);
            else
                return dollar.PesoToRupee(value);
        }

        else
        {
            RupeeConversion dollar = new RupeeConversion();
            if(to == "Dollar")
                return dollar.RupeeToDollar(value);
            else if(to == "Euro")
                return dollar.RupeeToEuro(value);
            else if(to == "Yen")
                return dollar.RupeeToYen(value);
            else if(to == "Pound")
                return dollar.RupeeToPound(value);
            else if(to == "Won")
                return dollar.RupeeToWon(value);
            else
                return dollar.RupeeToPeso(value);
        }
    }
}
