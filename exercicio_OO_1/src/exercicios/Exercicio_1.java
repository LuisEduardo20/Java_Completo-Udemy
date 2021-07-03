package exercicios;

import java.util.Scanner;
import java.util.Locale;
import exercicios.Retangulo;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Retangulo rectang = new Retangulo();
		
		System.out.print("Digite a altura: ");
		rectang.altura = sc.nextDouble();
		System.out.print("\nDigite a largura: ");
		rectang.largura = sc.nextDouble();
		
		double area = rectang.area();
		System.out.printf("\nArea: %.2f", area);
		
		double perimetro = rectang.Perimetro();				
		System.out.printf("\nPerímetro: %.2f", perimetro);
		
		double diagonal = rectang.Diagonal();
		System.out.printf("\nDiagonal: %.2f", diagonal);
		
		sc.close();
		
	}
	
}
