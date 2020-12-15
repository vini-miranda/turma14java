package banco;

import java.util.Random;
import java.util.Scanner;

public class Conta_poupança_funcao {

	public static void main(String[] args) {
		linha(80);
	}

	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("-");
		}
	}
	
	static void contaPoupanca (double saldo, double movimento[], char tipoMovimento[]) {
		Scanner t = new Scanner(System.in);
		Random randomico = new Random();
		
		
		char opcao;
		double valor;
		int aniversario[] = new int[40];
		int data,dataNiver=0;
		
		
		System.out.println("\nSaldo: R$"+saldo);
		
		do {
			for(int i=0; i<10;i++) {
				System.out.print("\nQUAL O VALOR DO MOVIMENTO? R$");
				valor = t.nextDouble();
				System.out.print("[D]-DÉBITO OU [C]-CRÉDITO: ");
				opcao = t.next().toUpperCase().charAt(0);
				
				if(opcao=='D') {	
					
					if(saldo > valor) {
						System.out.println("Debito feito com sucesso");
						saldo -= valor;
						movimento[i] = valor * (-1);
						tipoMovimento[i] = opcao;
						System.out.println("Saldo R$: " + saldo);
					}else {
						System.out.println("Saldo insuficiente para saque!!");
						System.out.println("Saldo R$: " + saldo);
					}
					
				}
				else if(opcao=='C') {
					if(valor < 0) {
						System.out.println("Informe um valor acima de 0");
						System.out.println("Saldo R$: " + saldo);
					}
					else {
						System.out.println("Deposito feito com sucesso");
						saldo += valor;
						movimento[i] = valor;
						tipoMovimento[i] = opcao;
						System.out.println("Saldo R$: " + saldo);
					}
				}
				else {
					System.out.println("Insira um comando válido!! [D]-DÉBITO OU [C]-CRÉDITO");
					System.out.println("Saldo R$: " + saldo);
				}
			}
			
			for(int i=0;i<40;i++) {
				aniversario[i]=randomico.nextInt(31)+1;
				dataNiver = aniversario[i];
			}
			
			System.out.println(dataNiver);
			System.out.print("\nEntre com a data de hoje em formato dd: ");
	    	data = t.nextInt();
	    	
	    		if(dataNiver == data) {
	    	  	System.out.println("\nHoje é seu aniversário de conta e seu saldo recebeu um acrescimo!");
	    	  	saldo = saldo*1.005;
	    	  	System.out.printf("\nSALDO ATUAL R$%.2f",saldo);
	    	  }
	    		else {
	    			System.out.println("Que pena! hoje não é sua data aniversário...");
	    		}
			System.out.println("\nDeseja continuar? \n[S]-Sim \n[N]-Não");
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');
	}
}


