package utils;

public class Calculator {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * (radius * radius * radius) / 3.0;
    }

    // Sem a utilização do static pra o programa principal acessar elas é preciso instanciar um novo objeto Calculator
    /*public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * (radius * radius * radius) / 3.0;
    }*/

}
