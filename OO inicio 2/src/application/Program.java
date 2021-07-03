package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter a product name");
        System.out.print("Name: ");
        product.name = sc.next();

        System.out.println("Enter a product price");
        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Enter a product quantity");
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        /*System.out.printf("\nName: %s\n", product.name);
        System.out.printf("Price: %.2f\n", product.price);
        System.out.printf("Quantity: %d", product.quantity);*/

        System.out.println(product);

        sc.close();

    }
}
