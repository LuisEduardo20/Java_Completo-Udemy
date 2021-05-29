package com.company;

public class Main {

    public static void main(String[] args) {
	    // Exemplo 1
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        // Exemplo 2
        int z;
        double k;

        z = 5;

        k = 2 * z; // converte o z em double para a operação

        System.out.println(z);
        System.out.println(k);

        // Exemplo 3
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        // Exemplo 4
        int i, j;
        double resultado;

        i = 5;
        j = 2;

        //resultado = i / j; -> resultado é 2.0, pois os dois valores são inteiros
        resultado = (double) i / j; // com o casting '(double)' o resultado passa a ser um double

        System.out.println(resultado);

        // Exemplo 5
        double p;
        int s;

        p = 5.0;
        //s = p; -> tipos incompatíveis
        s = (int) p;
        System.out.println(s);
    }
}
