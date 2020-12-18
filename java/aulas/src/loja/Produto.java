package loja;

public class Produto {
	
	//atributos
	private String nomeProduto;
	private int codigoProduto;
	private double precoUnitario;
	private int estoqueProduto;
	
	//construtores
	public Produto(String nomeProduto, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
	}
	
	
	public Produto(String nomeProduto, int codigoProduto, double precoUnitario, int estoqueProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.estoqueProduto = estoqueProduto;
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
	
	//metodos
	public void tiraEstoque(int unidades) {
		if(testaEstoque(unidades)) {
			this.estoqueProduto = (this.estoqueProduto-unidades);
		}
		
	}
	
	public void colocaEstoque(int unidades) {
		this.estoqueProduto = (this.estoqueProduto+unidades);
	}
	
	public boolean testaEstoque(int unid) 
	{
		if(unid <= this.estoqueProduto) {
			return true;
		}
		else {
			System.out.println("QUANTIDADE A SER REMOVIDA MAIOR QUE O LIMITE DE ESTOQUE!");
			return false;
		}
	}
	
	public double venda(int qtdVendida) {
		double valorFinal=0;
		if(qtdVendida>this.estoqueProduto) {
			System.out.println("ESTOQUE INSUFICIENTE PARA COMPRA!");
		}
		else {
			valorFinal = (this.precoUnitario*qtdVendida);
		}
		return valorFinal;
	}
	
	
	
	
	
	
	
}
