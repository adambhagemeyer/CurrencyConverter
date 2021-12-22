/**
 * Class containing methods to convert Rupees
 * to other types of currency
 */

public class RupeeConversion {
    
    public double RupeeToDollar(double rupee)
    {
        return rupee * .013;
    }

    public double RupeeToEuro(double rupee)
    {
        return rupee * .012;
    }

    public double RupeeToYen(double rupee)
    {
        return rupee * 1.51;
    }

    public double RupeeToPound(double rupee)
    {
        return rupee * .0099;
    }

    public double RupeeToWon(double rupee)
    {
        return rupee * 15.75;
    }

    public double RupeeToPeso(double rupee)
    {
        return rupee * .66;
    }
}
