package Exerc�cios_POO_lista03;

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


	public double getPre�o() {
		return preco;
	}


	public void setPre�o(double pre�o) {
		this.preco = pre�o;
	}
	
	
	
	
}