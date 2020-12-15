package Exercícios_POO_lista01;

public class Patinete {
	String marca;
	String modelo;
	double valor;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	
	public Patinete(String marca, String modelo, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public String info() {
		String infos = "\n" + this.modelo + "\t" + this.marca + "\t\t" + this.valor;
		
		return infos;
		
	}
	
	void acelerar(double valor) {
		double novaVelocidade = this.velocidadeAtual + valor;
		this.velocidadeAtual = novaVelocidade;
	}
	
}
