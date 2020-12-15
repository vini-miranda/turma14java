package Exercícios_POO_lista01;

public class Exercicio06_conta {

	public static void main(String[] args) {
		Conta conta1 = new Conta(001,"456.231.789-00");
		conta1.saldo = 0.0;
		
		System.out.println("INFORMAÇÕES DA CONTA");
		System.out.printf("\nNUMERO DA CONTA: %d \nCPF: %s \nSALDO: %.2f",conta1.numConta,conta1.cpf,conta1.saldo);
		
		conta1.deposito(60.5);
		
		System.out.printf("\n\nNOVO SALDO: R$%.2f ",conta1.saldo);
	}

}
