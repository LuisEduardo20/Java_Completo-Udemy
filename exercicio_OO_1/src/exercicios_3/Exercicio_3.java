package exercicios_3;

import exercicios_3.Aluno;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno joao = new Aluno();
		
		System.out.printf("Digite a primeira nota: ");
		joao.nota1 = sc.nextDouble();
		System.out.printf("Digite a segunda nota: ");
		joao.nota2 = sc.nextDouble();
		System.out.printf("Digite a terceira nota: ");
		joao.nota3 = sc.nextDouble();
		
		joao.calculaMedia();
		
		sc.close();
	}

}
