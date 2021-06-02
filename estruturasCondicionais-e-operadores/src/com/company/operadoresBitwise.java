package com.company;

import java.util.Scanner;

public class operadoresBitwise {

    public static void main(String[] args) {
        // Operadores que operam bit a bit

        /*
        * Operadores:
        * & -> E
        * | -> OU
        * ^ -> OU Exclusivo
        */

        // Ex:
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }

}
