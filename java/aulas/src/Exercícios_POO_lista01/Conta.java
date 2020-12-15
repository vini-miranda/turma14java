package Exercícios_POO_lista01;

public class Conta {
	int numConta;
	String cpf;
	double saldo;

	public Conta(int numConta, String cpf)
	{
		this.numConta = numConta;
		this.cpf = cpf;
	}
	
	public double deposito(double entrada) {
		double novoSaldo = this.saldo + entrada;
		this.saldo = novoSaldo;
		return this.saldo;	
	}
}
