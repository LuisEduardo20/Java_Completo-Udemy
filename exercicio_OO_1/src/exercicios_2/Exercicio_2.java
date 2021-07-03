package exercicios_2;

import java.util.Scanner;
import java.util.Locale;
import exercicios_2.Funcionario;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario fun_1 = new Funcionario();
		
		System.out.print("Name: ");
		fun_1.name = sc.next();
		
		System.out.print("Gross salary: ");
		fun_1.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		fun_1.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + fun_1.name + " $ " + fun_1.netSalary());
		
		
		System.out.print("\nWich percentage to increase salary: ");
		double increment = sc.nextDouble();
		fun_1.addWage(increment);
		
		sc.close();
	}

}
