package Exercícios_POO_lista01;

public class Aviao {
	String modelo;
	String compainhaAerea;
	int ano;
	int capacidadePassageiros;
	double velocidadeAtual;
	
	public Aviao(String modelo,int ano,String compainhaAerea,int capacidadePassageiros) {
		
		this.modelo = modelo;
		this.ano = ano;
		this.compainhaAerea = compainhaAerea;
		this.capacidadePassageiros = capacidadePassageiros;
	}
	
	public String infoAviao() {
		String info = "\n" + this.modelo + " \t" + this.ano + " \t\t" + this.capacidadePassageiros;
		return info;
	}
	
	void planar() {
		System.out.println("\nO avião está iniciando decolagem!");
	}
	
	void acelerar(double valor) {
		double novaVelocidade = this.velocidadeAtual + valor;
		this.velocidadeAtual = novaVelocidade;
	}
	
}
