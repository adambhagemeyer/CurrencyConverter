/**
 * Class containing methods to convert Won
 * to other types of currency
 */

public class WonConversion {
    
    public double WonToDollar(double won)
    {
        return won * .0084;
    }

    public double WonToEuro(double won)
    {
        return won * .00074;
    }

    public double WonToYen(double won)
    {
        return won * .096;
    }

    public double WonToPound(double won)
    {
        return won * .00063;
    }

    public double WonToPeso(double won)
    {
        return won * .017;
    }

    public double WonToRupee(double won)
    {
        return won * .063;
    }
}
