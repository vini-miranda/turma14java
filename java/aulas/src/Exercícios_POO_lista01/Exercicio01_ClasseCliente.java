package Exerc�cios_POO_lista01;

public class Exercicio01_ClasseCliente {
	
	String nome;
	int idade;
	char genero;
	
	public Exercicio01_ClasseCliente(String nome, int idade, char genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	
	public String getInfo() {
		
		String info = "\nOl� "+ this.nome + ", voc� tem " + this.idade + " anos e seu g�nero � " + this.genero + "(MASCULINO).";
		return info;
		
	}
	
	
	
}
