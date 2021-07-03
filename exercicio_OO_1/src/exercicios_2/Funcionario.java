package exercicios_2;

public class Funcionario {
	
	public String name;
	public double grossSalary, tax;
	
	/*public void mostrarDados() {
		System.out.printf("Nome: %s,\n Salário: %f", name, (grossSalary - tax));
	}*/
	
	public double netSalary() {
		return grossSalary -= tax;
	}
	
	public void addWage(double value) {
		double percent = grossSalary / 100;
		grossSalary += percent * value;
		
		System.out.printf("\nUpdate data: %s, $ %.1f", name, grossSalary);
	}
	
	
}
