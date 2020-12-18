package Exercícios_POO_lista03;

public class Produto{
	
	private String nome;
	private double preco;
	
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preco;
	}


	public void setPreço(double preço) {
		this.preco = preço;
	}
	
	
	
	
}