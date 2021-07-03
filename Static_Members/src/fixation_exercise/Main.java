package fixation_exercise;

import java.util.*;
import utils.Conversor;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conversor myDollar = new Conversor();

        System.out.print("What is the dollar price: ");
        myDollar.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought: ");
        myDollar.dollarBuyed = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", myDollar.convert());

        sc.close();
    }

}
