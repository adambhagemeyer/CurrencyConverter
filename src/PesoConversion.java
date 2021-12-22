/**
 * Class containing methods to convert Pesos
 * to other types of currency
 */

public class PesoConversion {
    
    public double PesoToDollar(double peso)
    {
        return peso * 0.048;
    }

    public double PesoToEuro(double peso)
    {
        return peso * .043;
    }

    public double PesoToYen(double peso)
    {
        return peso * 5.51;
    }

    public double PesoToPound(double peso)
    {
        return peso * .036;
    }

    public double PesoToWon(double peso)
    {
        return peso * 23.71;
    }

    public double PesoToRupee(double peso)
    {
        return peso * 3.64;
    }
}
