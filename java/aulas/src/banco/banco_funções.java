package banco;

import java.util.Random;
import java.util.Scanner;

public class banco_fun��es {
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
		double[] saldos = new double[40];
		
		//Vetores do tal�o
		int talao[] = new int[40];
		int totalTalao[] = new int[40];
		
		//Vari�veis globais
		int conta = 0;
		double saldo = 0;
		char opcao = 'S';
		
		Scanner t = new Scanner(System.in);
		Random randomico = new Random();
		
		for(int i=0; i<40; i++) {
			numConta[i] = (i+1);
		}
		
		
		linha(80);
		System.out.println("\nBanco Grupo 3");
		linha(80);
		System.out.println("\nDIGITE O N�MERO DA CONTA");
		conta = t.nextInt();
		
		//-- BEM VINDO / BEM VINDA 
		for(int i=0;i<40;i++) {
			if(numConta[i] == conta && sexo[i] == 'M') {
				System.out.println("\nSEJA BEM VINDO: " + nomeCliente[i]);
			}else if(numConta[i] == conta && sexo[i] == 'F'){
				System.out.println("\nSEJA BEM VINDA: " + nomeCliente[i]);
			}else if(conta>40 || conta<1){
				System.out.println("VOC� AINDA N�O POSSUI CONTA NESSE BANCO");
				break;
			}
		}
		
		
		for (int i=0; i<40; i++)
		{
			tipoConta[i]=4;//randomico.nextInt(5)+1;
		}
			
		
		
		//NUMERO DA CONTA - TIPO DE CONTA
		for(int i=0;i<40;i++) {
			if(tipoConta[i] == 1 && numConta[i] == conta) {
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA POUPAN�A");
				 
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
		System.out.println("[3]- SAIR?");
		System.out.print("Digite a Op��o Desejada: ");
		opcao = t.next().charAt(0);
		linha(80);
			
			
		
			for(int i=0;i<40;i++) {
				
				if(opcao == '1' && tipoConta[i] == 1 && numConta[i] == conta ) {
					contaPoupanca(saldo, movimento, tipoMovimento);
				}
				else if(opcao == '1' && tipoConta[i] == 2 && numConta[i] == conta ) {
					totalTalao[i] = 0;
					talao[conta] = 3;
					contaCorrente(saldo,saldos, talao, totalTalao, movimento, tipoMovimento,conta);
				}
				else if(opcao == '1' && tipoConta[i] == 3 && numConta[i] == conta ) {
					contaEspecial(saldo, movimento, tipoMovimento);
				}
				else if(opcao == '1' && tipoConta[i] == 4 && numConta[i] == conta ) {
					contaEmpresa(numConta, saldo);
				}
				else if(opcao == '1' && tipoConta[i] == 5 && numConta[i] == conta ) {
					contaUniversitaria(saldo, movimento, tipoMovimento);
				}
				else if(opcao == '2') {
					
						
				if(numConta[i] == conta) {
					System.out.println("\nOL� " + nomeCliente[i]);
					System.out.println("SEU SALDO �: R$" + saldos[conta]);
				}
						
					
				
				}		
				else if(opcao == '3') {
					System.out.println("\nOBRIGADO POR USAR O BANCO G3");
					System.out.println("PROGRAMA FINALIZADO");
					System.exit(0);
				}
			}	
			
			opcao = 'S';
		}while(opcao=='S');
	}

	

	static void linha(int tam) {
		for (int i = 0; i < tam; i++) {
			System.out.print("-");
		}
	}
	
	//FUN��ES DO BANCO
	
	static void contaCorrente (double saldo, double saldos[], int talao[], int totalTalao[], double movimento[], char tipoMovimento[], int conta ) {
	
		char opcao;
		double valor;
		char escolha;
        int qtdTalao;
        
		
		
		System.out.println("\n10 MOVIMENTOS PERMITIDOS");
		System.out.println("INICIAR MOVIMENTOS S/N?");
		opcao = t.next().toUpperCase().charAt(0);
		
		while(opcao == 'S') {
			
		do {
			for(int i=0; i<2;i++) {
				System.out.println("QUAL OPERA��O DESEJA FAZER? R$");
				System.out.println("[D]-D�BITO \\ [C]-CR�DITO ");
				opcao = t.next().toUpperCase().charAt(0);
				
				if(opcao=='D') {	
					
					System.out.println("INSIRA O VALOR DO D�BITO");
					valor = t.nextDouble();
					
					if(saldo >= valor) {
						System.out.println("Debito feito com sucesso");
						saldo -= valor;
						movimento[i] = valor * (-1);
						tipoMovimento[i] = opcao;
						System.out.println("Saldo Atual: " + saldo);
					}else {
						System.out.println("Saldo insuficiente para saque");
						System.out.println("Saldo Atual: " + saldo);
					}
					
				}
				else if(opcao=='C') {
					System.out.println("INSIRA O VALOR DO CR�DITO");
					valor = t.nextDouble();
					if(valor < 0) {
						System.out.println("Informe um valor acima de 0");
						System.out.println("Saldo Atual: " + saldo);
					}
					else {
						System.out.println("Debito feito com sucesso");
						saldo += valor;
						movimento[i] = valor;
						tipoMovimento[i] = opcao;
						
						System.out.println("Saldo Atual: " + saldo);
					}
				}else {
					System.out.println("Insira um comando v�lido!! [D]-D�BITO \\\\ [C]-CR�DITO");
					System.out.println("Saldo: " + saldo);
				}
					saldos[conta] = saldo;
				
			}
			
			System.out.println("Voc� deseja imprimir tal�o? S/N ");
			opcao = t.next().toUpperCase().charAt(0);
			while (opcao != 'S' && opcao != 'N') {
				System.out.println("\nOp��o inv�lida. Deseja continuar? ");
				opcao = t.next().toUpperCase().charAt(0);
			}
			
			if(opcao == 'S') {
			System.out.println("Digite a quantidade que deseja:");
			qtdTalao = t.nextInt();
			while (qtdTalao < 0 || qtdTalao > 3) {
				System.out.println("Quantidade inv�lida. Digite a quantidade:");
				qtdTalao = t.nextInt();
			}
			
			while (qtdTalao > talao[conta]) {
				System.out.printf("Erro! Quantidade dispon�vel: %d. Digite a quantidade:", talao[conta]);
				qtdTalao = t.nextInt();
			}
			
			talao[conta] = talao[conta] - qtdTalao;
			totalTalao[conta] = totalTalao[conta] + qtdTalao;
			if (talao[conta] == 0) {
				talao[conta] = 3;
			}
			System.out.printf("Quantidade di�ria imprimida: %d\n", qtdTalao);
			System.out.printf("Quantidade total imprimida: %d\n", totalTalao[conta]);
		}

			System.out.println("Deseja continuar? \n[S]-Sim \n[N]-N�o");
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');
	  }
		
	}
	
	static void contaEspecial (double saldo,double movimento[], char tipoMovimento[])
	{
	
	char opcaoMenu;	
	char opcao;
	double valor;
	double limiteCredito = 1000;			
	
	

				
	do
		
		
	{
		for(int i=0; i<10;i++)
		{
			
			System.out.print("\nQUAL O VALOR DO MOVIMENTO? R$");
			valor = t.nextDouble();
			System.out.print("[D]-D�BITO OU [C]-CR�DITO: ");
			opcao = t.next().toUpperCase().charAt(0);
			
			if(opcao=='D')
			{	
				if(saldo > valor )
				{
					System.out.println("Debito feito com sucesso");
					saldo -= valor;
					movimento[i] = valor * (-1);
					tipoMovimento[i] = opcao;
					System.out.println("Saldo R$: " + saldo);
					
				}
				else if ( valor >1000)
				{
				System.out.println("Voc� ultrapassou o limite dispon�vel");
				}
				
				else if (saldo < valor)
				{
						System.out.println("Saldo insuficiente para saque, voc� esta usando o Cr�dito especial");
						limiteCredito = limiteCredito - valor;
						System.out.println("Limite de Cr�dito Especial: "+ limiteCredito);
						saldo = valor;
						System.out.println("Saldo: " + saldo);
						if (limiteCredito <0)
						{
							System.out.println("Voc� ultrapassou o limite dispon�vel");
						}
						}
				
			
			}
			
			else if(opcao=='C')
		{
			if(valor < 0)
			{
					System.out.println("Informe um valor acima de 0");
					System.out.println("Saldo R$: " + saldo);
			}
					else
					{
						System.out.println("Deposito feito com sucesso");
						saldo += valor;
						movimento[i] = valor;
						tipoMovimento[i] = opcao;
						System.out.println("Saldo: " + saldo);
					}				
		}
			
			else
			{
				System.out.println("Insira um comando v�lido!!");
				System.out.println("Saldo: " + saldo);
			}
	}
		System.out.println("Deseja continuar? \n[S]-Sim \n[N]-N�o");
		opcao = t.next().toUpperCase().charAt(0);
		
	}while(opcao=='S');
	
    }
	
	static void contaUniversitaria ( double saldo, double movimento[], char tipoMovimento[]) {
		char opcao;
		double valor;
		double limite=1000;
		
		System.out.println("N�mero de Conta: ");
		System.out.println("Saldo: R$"+saldo);
		do {
			for(int i=0; i<3;i++) {
				System.out.println("Conta "+" o que deseja fazer? \n[1]-Debito \n[2]-Credito");
				opcao = t.next().charAt(0);
				
				if(opcao=='1') {
					System.out.println("Informe o valor do saque: ");
					valor = t.nextDouble();
					
					if(valor>=saldo) {
						System.out.println("Saque feito com sucesso");
						saldo -= valor;
						movimento[i] = valor * (-1);
						tipoMovimento[i] = opcao;
						System.out.println("Saldo: " + saldo);
					}else {
						System.out.println("voce utilizou seu limite de cheque especial:");
						System.out.println("Saldo: " + "-"+(limite-saldo));
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
						movimento[i] = valor;
						tipoMovimento[i] = opcao;
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
	
	static void contaPoupanca (double saldo, double movimento[], char tipoMovimento[]) {
	
	char opcao;
	double valor;
	int aniversario[] = new int[40];
	int data,dataNiver=0;
	
	
	System.out.println("\nSaldo: R$"+saldo);
	
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

	static void contaEmpresa(int[] numConta, double saldo) {
			char opcao = 0;
			double valor;
			double limiteEmprestimo;
			double valorAtual = 0;
			double limite []= new double [40];
			
			System.out.println("Saldo: R$"+saldo);
			
			for (int x=0; x<40; x++)
			{
				limite[x]=randomico.nextInt(1000);
			}
			
			Object dia;
			do
		    {
		    	
	    	////////////////////////////////
	    	for(int i=0 ; i<10 ; i++)
	    	{
	    		System.out.println("\nServi�os Disponiveis:");
	    		System.out.println("[1]- SAQUE");
	    		System.out.println("[2]- DEPOSITO");
	    		System.out.println("[3]- EMPRESTIMO?");
	    		System.out.print("Digite a Op��o Desejada: ");
	    		opcao = t.next().charAt(0);
	    		if(opcao == '1') {
	    			System.out.println("Entre com o valor do saque: ");
	    			valor = t .nextDouble();
					if(saldo>=valor) {
						saldo = saldo-valor;
								System.out.println("opera��o realizada com sucesso\n SALDO ATUAL: "+saldo);
											
					} else {
						System.out.println("Saldo insuficiente para saque.\n SALDO ATUAL: "+saldo);
					}
	    			
	    		}
	    		else if(opcao == '2') {
	    			System.out.println("Entre com o valor do dep�sito: ");
	    			valor = t.nextDouble();
				if(valor<0) {
	    			System.out.println("Digite um n�mero v�lido");
				}
				else {
					saldo = saldo+valor;
					System.out.println("opera��o realizada com sucesso.\n SALDO ATUAL: "+saldo);
					
				}
	    		}
	    			if(opcao == '3') {
	    			int x = 0;
					limiteEmprestimo = limite[x];
					
					System.out.println("O valor do seu emprestimo �: " + limiteEmprestimo);
	    			
	    	 		System.out.println("Entre com o valor do emprestimo: ");
	    			valor = t.nextDouble();
				if(valor >limiteEmprestimo || valor<0) {
	    			System.out.println("Valor informado � maior que o saldo do emprestimo atual digite um n�mero v�lido");
				}else {
					limiteEmprestimo = limiteEmprestimo-valor;
					valorAtual = limiteEmprestimo;
					saldo = saldo + valor;
					System.out.println("opera��o realizada com sucesso.\n SALDO ATUAL: "+saldo+ " seu limite emprestimo �: "+ valorAtual);
					
				if(limiteEmprestimo > valorAtual) {
						System.out.println("Valor menor que o valor do Limite atual");
					}
				}
	    	}
	    		
	    		
	  	}
	    	System.out.println("\nDeseja continuar? \n[S]-Sim \n[N]-N�o");
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');
	}
}
