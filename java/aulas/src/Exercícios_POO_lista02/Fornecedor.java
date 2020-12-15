package Exercícios_POO_lista02;

public class Fornecedor extends Pessoa {
	protected double valorCredito;
	protected double valorDivida;
	
	//capsulados
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	public Fornecedor(double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double valorSaldo() {
		double saldo = this.valorDivida - this.valorCredito;
		return saldo;
	}
	
	
}
