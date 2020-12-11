package banco;

import java.util.Random;
import java.util.Scanner;


public class Banco_completo {
	static Scanner t = new Scanner(System.in);
	static Random randomico = new Random();
	
	public static void main(String[] args) {
		
		//vetores
		int numConta[] = new int[40];
		int tipoConta[] = new int[40];
		String nomeCliente[] = new String[] {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel Enrique Cabral Silva","Gabriel S�rgio Nascimento Santos Gon�alves","Gide�o da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros","Lucas Gon�alves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almenara","Vinicius Alves Miranda"};
		char sexo[] = new char[] {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'};
		double movimento[] = new double[10];
		char tipoMovimento[] = new char[10];
		double saldos[] = new double[40];
		
		//Vari�veis globais
		int conta = 0;
		int transacao = 0;
		int saldo = 0;
		char opcao = 'S';
		
		
		
		for(int i=0; i<40; i++) {
			numConta[i] = (i+1);
		}
		
		
		linha(80);
		System.out.println("\nBanco Grupo 3");
		linha(80);
		System.out.print("\nDIGITE O N�MERO DA CONTA: ");
		conta = t.nextInt();
		
		//-- BEM VINDO / BEM VINDA
		for(int i=0;i<40;i++) {
			if(numConta[i] == conta && sexo[i] == 'M') {
				System.out.println("SEJA BEM VINDO: " + nomeCliente[i]);
			}else if(numConta[i] == conta && sexo[i] == 'F'){
				System.out.println("SEJA BEM VINDA: " + nomeCliente[i]);
			}else if(conta>40 || conta<1){
				System.out.println("VOC� AINDA N�O POSSUI CONTA NESSE BANCO");
				break;
			}
		}
		
		
		for (int i=0; i<40; i++)
		{
			tipoConta[i]=1;
					//randomico.nextInt(5)+1;
		}
			
		
		//NUMERO DA CONTA - TIPO DE CONTA
		for(int i=0;i<40;i++) {
			if(tipoConta[i] == 1 && numConta[i] == conta) {
				System.out.println("\nCONTA: " + numConta[i] + " TIPO DE CONTA: CONTA POUPAN�A");
				contaPoupanca(saldos[i]);
				
			}
			else if(tipoConta[i] == 2 && numConta[i] == conta) {
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA CORRENTE");
				
			}
			else if(tipoConta[i] == 3 && numConta[i] == conta) {
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA ESPECIAL");
				
			}
			else if(tipoConta[i] == 4 && numConta[i] == conta) {
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA EMPRESA");
				
			}
			else if(tipoConta[i] == 5 && numConta[i] == conta) {
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA UNIVERSIT�RIA");
				
			}
		}
		
		
		
		
		do {
		System.out.println("\nServi�os Disponiveis:");
		System.out.println("[1]- MOVIMENTA��O");
		System.out.println("[2]- SALDO");
		System.out.println("[3]- Sair?");
		System.out.print("Digite a Op��o Desejada: ");
		opcao = t.next().charAt(0);
		
			linha(80);
			if(opcao == '1' && conta == 1) {
					
			}
			else if(opcao == '2') {
				
			}
			else if(opcao == '3') {
				
			}
			
			
			opcao = 'S';
		}while(opcao=='S');
	}
	static void linha(int tam) {
		for (int i = 0; i < tam; i++) {
			System.out.print("-");
		}
	}
	
	static void contaPoupanca (double saldo) {
		
		char opcao;
		double valor;
		int aniversario[] = new int[40];
		int data,dataNiver=0;
		
		
		System.out.println("Saldo: R$"+saldo);
		
		do {
			for(int i=0; i<10;i++) {
				System.out.print("\nQUAL O VALOR DO MOVIMENTO? R$");
				valor = t.nextDouble();
				System.out.print("[D]-D�BITO OU [C]-CR�DITO: ");
				opcao = t.next().toUpperCase().charAt(0);
				
				if(opcao=='D') {	
					
					if(saldo > valor) {
						System.out.println("Debito feito com sucesso");
						saldo -= valor;
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
						System.out.println("Saldo R$: " + saldo);
					}
				}
				else {
					System.out.println("Insira um comando v�lido!! [D]-D�BITO OU [C]-CR�DITO");
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
	    	  	System.out.println("\nHoje � seu anivers�rio de conta e seu saldo recebeu um acrescimo!");
	    	  	saldo = saldo*1.005;
	    	  	System.out.printf("\nSALDO ATUAL R$%.2f",saldo);
	    	  }
	    		else {
	    			System.out.println("Que pena! hoje n�o � sua data anivers�rio...");
	    		}
			System.out.println("\nDeseja continuar? \n[S]-Sim \n[N]-N�o");
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');
	}
	
		static void contaCorrente (int numConta, double saldo) {
		
		char opcao;
		double valor;
		
		System.out.println("N�mero de Conta: "+numConta);
		System.out.println("Saldo: R$"+saldo);
		
		do {
			for(int i=0; i<3;i++) {
				System.out.println("Conta "+numConta+" o que deseja fazer? \n[1]-Credito \n[2]-Debito");
				opcao = t.next().charAt(0);
				
				if(opcao=='1') {
					System.out.println("Informe o valor do saque: ");
					valor = t.nextDouble();
					
					if(saldo > valor) {
						System.out.println("Saque feito com sucesso");
						saldo -= valor;
						System.out.println("Saldo: " + saldo);
					}else {
						System.out.println("Saldo insuficiente para saque");
						System.out.println("Saldo: " + saldo);
					}
					
				}
				else if(opcao=='2') {
					System.out.println("Informe o valor do deposito: ");
					valor = t.nextDouble();
					if(valor < 0) {
						System.out.println("Informe um valor acima de 0");
						System.out.println("Saldo: " + saldo);
					}
					else {
						System.out.println("Deposito feito com sucesso");
						saldo += valor;
						System.out.println("Saldo: " + saldo);
					}
				}
				else {
					System.out.println("Insira um comando v�lido!!");
					System.out.println("Saldo: " + saldo);
				}
			}
			System.out.println("Deseja continuar? \n[S]-Sim \n[N]-N�o");
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');

	}

}
