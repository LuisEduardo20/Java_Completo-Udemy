package exercicios;

public class Retangulo {
	public double largura, altura;
	
	public double area()
	{
		return altura * largura;
	}
	
	public double Perimetro() 
	{
		return ((this.largura * 2.0) + (this.altura * 2.0));
	}
	
	public double Diagonal() 
	{
		return (this.altura * this.largura) / 2.0;
	}
}
