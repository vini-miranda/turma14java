package Exercícios_POO_lista01;

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
		
		String info = "\nOlá "+ this.nome + ", você tem " + this.idade + " anos e seu gênero é " + this.genero + "(MASCULINO).";
		return info;
		
	}
	
	
	
}
