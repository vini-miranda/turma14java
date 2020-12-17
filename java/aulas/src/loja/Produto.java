package loja;

public class Produto {
	
	//atributos
	private String nomeProduto;
	private int codigoProduto;
	private double precoUnitario;
	private int estoqueProduto;
	
	//construtores
	public Produto(String nomeProduto, int codigoProduto, double precoUnitario, int estoqueProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.estoqueProduto = estoqueProduto;
	}

	public Produto(String nomeProduto, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
	}
	
	//encapsulamento
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getEstoqueProduto() {
		return estoqueProduto;
	}

	public void setEstoqueProduto(int estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
	
	//metodos
	public void tiraEstoque(int unidades) {
		
	}
	
	public void colocaEstoque(int unidade) {
		
	}
	
	public double venda(int qtdVendida) {
		double valorFinal=0;
		return valorFinal;
	}
	
	
	
	
	
	
	
}
