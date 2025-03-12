package br.com.engsenai.projeto_calculadora.model;

public class Quadrado {
   
	public double lado;
	
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;	
	}
	
	public void mostrarDados() {
		System.out.println("--------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("--------------");
		System.out.println("LADO: " + lado) ;
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("PERÍMETRO " + calcularPerimetro());
		System.out.println("---------------");
	}
	
	
}
