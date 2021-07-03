package exercicios_3;

public class Aluno {
	public double nota1, nota2, nota3;
	
	public void calculaMedia() {
		double media = nota1 + nota2 + nota3;
		System.out.printf("FINAL GRADE = %.2f\n", media);
		
		if(media >= 60.0) {
			System.out.println("PASS");
		}
		else {
			double falta = 60.0 - media;
			
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", falta);
		}
		
	}
}
