package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo strings
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        // Lendo inteiros
        int y;
        y = sc.nextInt();
        System.out.println("O inteiro digitado foi: " + y);

        // Lendo ponto flutuante
        double z;
        z = sc.nextDouble(); // Pega a localidade da máquina
        System.out.println(z);

        // Lendo um caractere
        char i;
        i = sc.next().charAt(0);
        System.out.println(i);

        // Lendo texto até a quebra de linha
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
