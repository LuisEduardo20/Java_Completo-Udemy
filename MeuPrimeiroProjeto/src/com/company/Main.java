package com.company;
import java.util.Locale; // importando biblioteca Locace para alteração de localidaded

public class Main {

    public static void main(String[] args) {
        System.out.print("Olá mundo!"); // print sem quebra de linha
        System.out.println("Bom dia!"); // print com quebra de linha

        /*
        * Tipos de dados primitivos em Java:
        * - byte -> -128 a 127
        * - short -> -32768 a 32767
        * - int ->  -2147483648 a 2147483647
        * - long -> -9223372036854770000 a 9223372036854770000
        * - float -> -1,4024E-37 a 3,4028E+38
        * - double -> -4,94E-307 a 1,79E+308
        * - char -> '\u0000' a '\uFFFF'
        * - boolean -> {false, true}
        * - String -> cadeia de caracteres
        */

        int y = 32;
        System.out.println(y);
        double x = 10.134235;
        System.out.println(x);
        // controlando quantidade da casas decimais
        System.out.printf("%.2f%n", x); // duas casas decimais -> %.(qtd de casas)f(tipo float), %n ou \n(quebra de linha)
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US); // configurando formatação de localidade no programa
        System.out.printf("%.4f\n", x);

        // Concatenação de elementos em uma string
        System.out.println("Resultado = " + x + " METROS");
        // ou com um ou mais valores
        System.out.printf("Resultado = %.2f METROS", x);
    }
}
