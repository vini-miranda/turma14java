package loja;

public class Produto {
	
	//atributos
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int estoqueProduto;
	
	//construtores
	public Produto(String nomeProduto, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
	}
	
	
	public Produto(String nomeProduto, String codigoProduto, double precoUnitario, int estoqueProduto) {
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

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
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
	
	
	public double venda(int qtdeVendida) {

        if (testaEstoque(qtdeVendida)) {
            //tiraEstoque(qtdeVendida);
            return qtdeVendida * this.precoUnitario;
        } else {
            System.out.println("Venda não autorizada");
            return 0;
            }
        }
        
    public boolean testaEstoque(int valor) {

        if (this.estoqueProduto >= valor) {
            return true;
        } else if (valor == 0) {
            return false;
        } else if (this.estoqueProduto <= 0) {
            return false;
        } else {
            return false;
        }

 }
		
	
	
	
	
	
	
	
}
