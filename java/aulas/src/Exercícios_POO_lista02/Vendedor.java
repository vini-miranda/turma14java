package Exercícios_POO_lista02;

public class Vendedor extends Pessoa{
	
	private double valorVendas;
	private double comissao;
	
	//encapsulados
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	//construtores
	public Vendedor(double valorVendas, double comissao) {
		super();
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double vencimentoBase() {
		double novoValor = (this.valorVendas + (this.valorVendas*this.comissao));
		return novoValor;
	}
	
	
	
	
}
