package Exercícios_POO_lista03;

public class Animal {
	
	//atributos
	private String nome;
	private int idade;
	protected String somEmitido;
	protected boolean correr;
	
	//encapsulamentos
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSomEmitido() {
		return somEmitido;
	}
	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}
	
	//construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getSom() {
		return null;
	}
	
	public String getCorre() {
		return null;
	}

}
