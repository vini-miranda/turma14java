package banco;

public class conta {
	
	public int numConta;
	public double saldo;
	public String cpf;
	
	public conta(int numConta) {
		this.numConta = numConta;
	}
	
	public conta(int numConta, String cpf) {
		this.numConta = numConta;
		this.cpf = cpf;
		
	}
}
