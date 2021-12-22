/**
 * Class for converting Yen
 * to other types of currency
 */

public class YenConversion {
    
    public double YenToDollar(double yen)
    {
        return yen * 0.0088;
    }

    public double YenToEuro(double yen)
    {
        return yen * 0.0077;
    }

    public double YenToPound(double yen)
    {
        return yen * 0.0066;
    }

    public double YenToWon(double yen)
    {
        return yen * 10.41;
    }

    public double YenToPeso(double yen)
    {
        return yen * 0.18;
    }

    public double YenToRupee(double yen)
    {
        return yen * 0.66;
    }
}
