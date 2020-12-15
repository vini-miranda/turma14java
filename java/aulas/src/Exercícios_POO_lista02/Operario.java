package Exercícios_POO_lista02;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	//encapsulados
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public Operario(double valorProducao, double comissao) {
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double vencimentoBase() {
		double novoValor = (this.valorProducao + (this.valorProducao*this.comissao));
		return novoValor;
	}
	
}
