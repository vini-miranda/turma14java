package banco;

import java.util.Random;
import java.util.Scanner;

public class banco_funções {
	static Scanner t = new Scanner(System.in);
	static Random randomico = new Random();
	public static void main(String[] args) {
		
		//vetores
		int numConta[] = new int[40];
		int tipoConta[] = new int[40];
		String nomeCliente[] = new String[] {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"};
		char sexo[] = new char[] {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'};
		double movimento[] = new double[10];
		char tipoMovimento[] = new char[10];
		double[] saldos = new double[40];
		
		//Vetores do talão
		int talao[] = new int[40];
		int totalTalao[] = new int[40];
		
		//Variáveis globais
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
		System.out.println("\nDIGITE O NÚMERO DA CONTA");
		conta = t.nextInt();
		
		//-- BEM VINDO / BEM VINDA 
		for(int i=0;i<40;i++) {
			if(numConta[i] == conta && sexo[i] == 'M') {
				System.out.println("\nSEJA BEM VINDO: " + nomeCliente[i]);
			}else if(numConta[i] == conta && sexo[i] == 'F'){
				System.out.println("\nSEJA BEM VINDA: " + nomeCliente[i]);
			}else if(conta>40 || conta<1){
				System.out.println("VOCÊ AINDA NÃO POSSUI CONTA NESSE BANCO");
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
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA POUPANÇA");
				 
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
				System.out.println("CONTA: " + numConta[i] + " TIPO DE CONTA: CONTA UNIVERSITÁRIA");
				
			}
			
			
		}
		
		
		
		
		do {
		System.out.println("\nServiços Disponiveis:");
		System.out.println("[1]- MOVIMENTAÇÃO");
		System.out.println("[2]- SALDO");
		System.out.println("[3]- SAIR?");
		System.out.print("Digite a Opção Desejada: ");
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
					System.out.println("\nOLÁ " + nomeCliente[i]);
					System.out.println("SEU SALDO É: R$" + saldos[conta]);
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
	
	//FUNÇÕES DO BANCO
	
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
				System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
				System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
				opcao = t.next().toUpperCase().charAt(0);
				
				if(opcao=='D') {	
					
					System.out.println("INSIRA O VALOR DO DÉBITO");
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
					System.out.println("INSIRA O VALOR DO CRÉDITO");
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
					System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");
					System.out.println("Saldo: " + saldo);
				}
					saldos[conta] = saldo;
				
			}
			
			System.out.println("Você deseja imprimir talão? S/N ");
			opcao = t.next().toUpperCase().charAt(0);
			while (opcao != 'S' && opcao != 'N') {
				System.out.println("\nOpção inválida. Deseja continuar? ");
				opcao = t.next().toUpperCase().charAt(0);
			}
			
			if(opcao == 'S') {
			System.out.println("Digite a quantidade que deseja:");
			qtdTalao = t.nextInt();
			while (qtdTalao < 0 || qtdTalao > 3) {
				System.out.println("Quantidade inválida. Digite a quantidade:");
				qtdTalao = t.nextInt();
			}
			
			while (qtdTalao > talao[conta]) {
				System.out.printf("Erro! Quantidade disponível: %d. Digite a quantidade:", talao[conta]);
				qtdTalao = t.nextInt();
			}
			
			talao[conta] = talao[conta] - qtdTalao;
			totalTalao[conta] = totalTalao[conta] + qtdTalao;
			if (talao[conta] == 0) {
				talao[conta] = 3;
			}
			System.out.printf("Quantidade diária imprimida: %d\n", qtdTalao);
			System.out.printf("Quantidade total imprimida: %d\n", totalTalao[conta]);
		}

			System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
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
			System.out.print("[D]-DÉBITO OU [C]-CRÉDITO: ");
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
				System.out.println("Você ultrapassou o limite disponível");
				}
				
				else if (saldo < valor)
				{
						System.out.println("Saldo insuficiente para saque, você esta usando o Crédito especial");
						limiteCredito = limiteCredito - valor;
						System.out.println("Limite de Crédito Especial: "+ limiteCredito);
						saldo = valor;
						System.out.println("Saldo: " + saldo);
						if (limiteCredito <0)
						{
							System.out.println("Você ultrapassou o limite disponível");
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
				System.out.println("Insira um comando válido!!");
				System.out.println("Saldo: " + saldo);
			}
	}
		System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
		opcao = t.next().toUpperCase().charAt(0);
		
	}while(opcao=='S');
	
    }
	
	static void contaUniversitaria ( double saldo, double movimento[], char tipoMovimento[]) {
		char opcao;
		double valor;
		double limite=1000;
		
		System.out.println("Número de Conta: ");
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
					System.out.println("Insira um comando válido!!");
					System.out.println("Saldo: " + saldo);
				}
			}
			System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
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
	    		System.out.println("\nServiços Disponiveis:");
	    		System.out.println("[1]- SAQUE");
	    		System.out.println("[2]- DEPOSITO");
	    		System.out.println("[3]- EMPRESTIMO?");
	    		System.out.print("Digite a Opção Desejada: ");
	    		opcao = t.next().charAt(0);
	    		if(opcao == '1') {
	    			System.out.println("Entre com o valor do saque: ");
	    			valor = t .nextDouble();
					if(saldo>=valor) {
						saldo = saldo-valor;
								System.out.println("operação realizada com sucesso\n SALDO ATUAL: "+saldo);
											
					} else {
						System.out.println("Saldo insuficiente para saque.\n SALDO ATUAL: "+saldo);
					}
	    			
	    		}
	    		else if(opcao == '2') {
	    			System.out.println("Entre com o valor do depósito: ");
	    			valor = t.nextDouble();
				if(valor<0) {
	    			System.out.println("Digite um número válido");
				}
				else {
					saldo = saldo+valor;
					System.out.println("operação realizada com sucesso.\n SALDO ATUAL: "+saldo);
					
				}
	    		}
	    			if(opcao == '3') {
	    			int x = 0;
					limiteEmprestimo = limite[x];
					
					System.out.println("O valor do seu emprestimo é: " + limiteEmprestimo);
	    			
	    	 		System.out.println("Entre com o valor do emprestimo: ");
	    			valor = t.nextDouble();
				if(valor >limiteEmprestimo || valor<0) {
	    			System.out.println("Valor informado é maior que o saldo do emprestimo atual digite um número válido");
				}else {
					limiteEmprestimo = limiteEmprestimo-valor;
					valorAtual = limiteEmprestimo;
					saldo = saldo + valor;
					System.out.println("operação realizada com sucesso.\n SALDO ATUAL: "+saldo+ " seu limite emprestimo é: "+ valorAtual);
					
				if(limiteEmprestimo > valorAtual) {
						System.out.println("Valor menor que o valor do Limite atual");
					}
				}
	    	}
	    		
	    		
	  	}
	    	System.out.println("\nDeseja continuar? \n[S]-Sim \n[N]-Não");
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');
	}
}
