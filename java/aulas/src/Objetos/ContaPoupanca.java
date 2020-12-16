package Objetos;

public class ContaPoupanca extends Conta{
	private int dataAniversarioConta;

	//construtores
	public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
		super(numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	//encapsulamento
	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	public void comparacaoData(int data) {
		if(this.dataAniversarioConta == data) {
    	  	System.out.println("\nHoje é seu aniversário de conta e seu saldo recebeu um acrescimo!");
    	  	this.saldo = this.saldo*1.005;
    	  	System.out.printf("\nSALDO ATUAL R$%.2f \n",this.saldo);
    	  }
    		else {
    			System.out.println("Que pena! hoje não é sua data aniversário...");
    		}
	}
	
}
