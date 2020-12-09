package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	char opcao, genero, continuar='S';
	String nome;
	
	do 
	{
			linha(80);
			System.out.println("\n\n-----------------------------------PET CARE------------------------------------");
			System.out.println("O lugar ideal para os pais de pet:)");
			linha(80);
			System.out.println("\n[1] - COMPRAR PRODUTOS\n[2] - GERENCIAR ESTOQUE\n[3] - SAIR");
			System.out.print("\nENTRE COM O COMANDO: ");
			opcao = leia.next().toUpperCase().charAt(0);
			linha(80);
			
			if(opcao == '1')
			{
				System.out.print("\nEntre com seu nome: ");
				leia.nextLine();
				nome = leia.nextLine();
				System.out.print("\nVoc� se considera:\n[M] - Masculino\n[F] - Feminino\n[O] - Outro");
				System.out.print("\nENTRE COM O COMANDO: ");
				genero = leia.next().toUpperCase().charAt(0);
				if(retornaGenero(genero) == "MASCULINO") 
				{
					System.out.println("\nSeja bem vindo Sr. " + nome + "! :)");
				}
				else if(retornaGenero(genero) == "FEMININO") 
				{
					System.out.println("\nSeja bem vinda Sra. " + nome + "! :)");
				}
				else if(retornaGenero(genero) == "OUTRO") 
				{
					System.out.println("\nSeja bem vindx Srx. " + nome + "! :)");
				}
				else 
				{
					System.out.println("\nVoc� digitou um comando inv�lido :( mas podemos prosseguir..");
				}
				System.out.println("\nDeseja continuar? Digite S/N: ");
				continuar = leia.next().toUpperCase().charAt(0);
				
			}
			else if(opcao == '2') 
			{
				System.out.println("\nWIP");
				System.out.println("\nDeseja continuar? Digite S/N: ");
				continuar = leia.next().toUpperCase().charAt(0);
				
			}
			else if(opcao == '3') 
			{
				continuar = 'N';
				break;
			}
			
			
	} while(continuar == 'S'); 
	System.out.println("\nAgradecemos sua visita!! Volte Sempre!! :)");
			
			
			
}	
	

	static void pulaLinha(int tam) {
		System.out.println("\n");
		for(int i=0;i<tam;i++) {
			System.out.print("-");
		}
	}
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("-");
		}
	}
	public static String retornaGenero(char genero){
		String volta = null;
		if(genero == 'M') {
			volta = "MASCULINO";
		}
		else if(genero == 'F') {
			volta = "FEMININO";
		}
		else if(genero == 'O') {
			volta = "OUTRO";
		}
		else {
			volta = "N/D";
		}
		return volta;
	}
}	
