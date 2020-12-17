package Objetos;

import java.util.Scanner;

public class bancoTeste {

	public static void main(String[] args) {
		
Scanner t = new Scanner(System.in);
		
		char op;//visivel em todo o programa - escopo
		char saida;
		int numeroConta=0, data;
		double valor; //escopo global
		
		System.out.println("BANCO DO ED!!!");
		do
		{
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = t.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = t.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = t.next();
				switch (opconta)
				{
					case '1':
					{
						System.out.println("Digite a data de aniversario da conta: ");
						int dataAniversario = t.nextInt();
						ContaPoupanca conta1 = new ContaPoupanca(numeroConta,cpfConta,dataAniversario);
						
						do 
						{
						for(int i=0; i<2;i++) {
							System.out.print("\nDESEJA FAZER UM:\n[D]-DÉBITO \n[C]-CRÉDITO: ");
							op = t.next().toUpperCase().charAt(0);
							
							if(op=='D') {	
								System.out.print("\nQUAL O VALOR DO MOVIMENTO? R$");
								valor = t.nextDouble();
								
								if(conta1.getSaldo() > valor ) {
									System.out.println("Debito feito com sucesso");
									conta1.debito(valor);
									System.out.println("Saldo: R$" + conta1.getSaldo());
								}else {
									System.out.println("Saldo insuficiente para saque!!");
									System.out.println("Saldo: R$" + conta1.getSaldo());
								}
								
							}
						
							else if(op=='C') {
								System.out.print("\nQUAL O VALOR DO MOVIMENTO? R$");
								valor = t.nextDouble();
								
								if(valor < 0) {
									System.out.println("Informe um valor acima de 0");
									System.out.println("Saldo: R$" + conta1.getSaldo());
								}
								else {
									System.out.println("Deposito feito com sucesso");
									conta1.credito(valor);
									System.out.println("Saldo: R$" + conta1.getSaldo());
								}
							}
							else {
								System.out.println("Insira um comando válido!! [D]-DÉBITO OU [C]-CRÉDITO");
								System.out.println("Saldo: R$" + conta1.getSaldo());
							}
						}
						
						System.out.print("\nEntre com a data de hoje em formato dd: ");
				    	data = t.nextInt();
				    	conta1.comparacaoData(data);
				    	
						System.out.println("\nDeseja continuar? \n[S]-Sim \n[N]-Não");
						op = t.next().toUpperCase().charAt(0);
							
						}while(op=='S');
					}
					break;
					case '2': {
						
					}
					break;
					case '3': {
						
					}
					break;
					case '4': {
						
					}
					break;
					case '5': {
						
					}
					break;
				}
				
				
			}
			else if (op == '2')
			{
				System.out.println("wip");
			}
			else
			{
				
			}
			System.out.println("Continua S/N");
			saida = t.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}
		
		} while(true);

	}

}
