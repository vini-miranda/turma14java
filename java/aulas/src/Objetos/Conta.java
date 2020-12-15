package Objetos;

public abstract class Conta {
	
	protected int numeroConta;
	protected double saldo;
	protected String cpf;
	
	//encapsulamento
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	//construtores
	public Conta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	public Conta(int numeroConta, String cpf)
	{
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	public double debito(double valor) {
		double novoValor = saldo-valor;
		saldo = novoValor;
		return saldo;
	}
	
	public double credito(double valor) {
		double novoValor = saldo+valor;
		saldo = novoValor;
		return saldo;
	}
}
