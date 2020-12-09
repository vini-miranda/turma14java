package banco;

import java.util.Scanner;

public class Banco_completo {

		static Scanner t = new Scanner(System.in);
		public static void main(String[] args) {
			char opcao = 'S';
			String numConta = "G3-01";
			int transacao = 0;
			int saldo = 0;
			Scanner t = new Scanner(System.in);
			
			do {
			linha(80);
			System.out.println("\nBanco Grupo 3");
			linha(80);
			System.out.println("\nServiços Disponiveis:");
			System.out.println("[1]- Conta Poupança");
			System.out.println("[2]- Conta Corrente");
			System.out.println("[3]- Conta Especial");
			System.out.println("[4]- Conta Empresa");
			System.out.println("[5]- Conta Universitaria");
			System.out.println("[6]- Sair?");
			System.out.print("Digite a Opção Desejada: ");
			opcao = t.next().charAt(0);
			
				linha(80);
				if(opcao == '1') {
					contaPoupanca(numConta, saldo);			
				}else if(opcao == '2') {
					contaCorrente(numConta, saldo);
				}
				
				
				opcao = 'S';
			}while(opcao=='S');
		}
		static void linha(int tam) {
			for (int i = 0; i < tam; i++) {
				System.out.print("-");
			}
		}
		
		static void contaPoupanca (String numConta, double saldo) {
			
			char opcao;
			double valor;
			
			System.out.println("Número de Conta: "+numConta);
			System.out.println("Saldo: R$"+saldo);
			
			do {
				for(int i=0; i<10;i++) {
					System.out.println("Conta "+numConta+" o que deseja fazer? \n[1]-Saque \n[2]-Depósito");
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
						System.out.println("Insira um comando válido!!");
						System.out.println("Saldo: " + saldo);
					}
				}
				System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
				opcao = t.next().toUpperCase().charAt(0);
				
			}while(opcao=='S');
		}
		
			static void contaCorrente (String numConta, double saldo) {
			
			char opcao;
			double valor;
			
			System.out.println("Número de Conta: "+numConta);
			System.out.println("Saldo: R$"+saldo);
			
			do {
				for(int i=0; i<10;i++) {
					System.out.println("Conta "+numConta+" o que deseja fazer? \n[1]-Saque \n[2]-Depósito");
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
						System.out.println("Insira um comando válido!!");
						System.out.println("Saldo: " + saldo);
					}
				}
				System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
				opcao = t.next().toUpperCase().charAt(0);
				
			}while(opcao=='S');
	}
		
}



