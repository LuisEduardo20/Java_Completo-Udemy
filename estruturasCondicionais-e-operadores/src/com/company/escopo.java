package com.company;

public class escopo {

    public static void main(String[] args) {

        double price;

        //System.out.println(price); -> dá erro pois a variável ainda não foi inicializada

        double x = 20.0;

        if(x < 50.0) {
            double y = 100.0; // ela só existe nesse bloco do if
        }

        //System.out.println(y); -> também dá erro pois 'y' não está no escopo deste comando
    }

}
