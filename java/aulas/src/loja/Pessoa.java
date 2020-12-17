package loja;

public abstract class Pessoa {
	
	//atributos
	private String nome;
	private char genero;
	private int dataNascimento;
	
	//construtor
	public Pessoa(String nome, char genero, int dataNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}
	
	//metodo
	public void voltaIdade() {
		
	}
	
	
}
