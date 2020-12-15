package Exercícios_POO_lista01;

public class Produto_Eletronico {
	String produto;
	double preco;
	int estoque;
	
	public Produto_Eletronico(String produto, double preco, int estoque) {
		super();
		this.produto = produto;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	void comprar(int qtde) {
		int estoqueAtual = (this.estoque - qtde);
		this.estoque = estoqueAtual;
	}
	
	
	
}
