package Objetos;

import java.util.Scanner;

public class contaPoupancaPOO {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		ContaPoupanca conta1 = new ContaPoupanca(1,"123.456.789-00",23);
		conta1.setSaldo(0);
		double valor;
		char opcao;
		int data;
		
		
		System.out.println("BEM VINDO AO BANCO!!");
		linha(40);
		System.out.println("\nDETALHES DA SUA CONTA\n");
		System.out.println("NUMERO DA CONTA: " + conta1.getNumeroConta() + "\nCPF: "+ conta1.getCpf()+"\nDATA ANIVERSÁRIO: "+ conta1.getDataAniversarioConta()+"\nSALDO: R$" +conta1.getSaldo());
		
		do 
		{
			for(int i=0; i<2;i++) {
				System.out.print("\nDESEJA FAZER UM:\n[D]-DÉBITO \n[C]-CRÉDITO: ");
				opcao = t.next().toUpperCase().charAt(0);
				
				if(opcao=='D') {	
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
			
				else if(opcao=='C') {
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
			opcao = t.next().toUpperCase().charAt(0);
			
		}while(opcao=='S');
	}
	
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}

}
