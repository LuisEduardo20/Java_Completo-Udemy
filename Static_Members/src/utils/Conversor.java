package utils;

public class Conversor {

    public double dollarPrice, dollarBuyed;
    public static final double IOF = 6.0/100.0;

    public double convert() {
        double tax = dollarPrice * dollarBuyed * IOF;
        double reais = dollarPrice * dollarBuyed + tax;

        return reais;
    }

}
