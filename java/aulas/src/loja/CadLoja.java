package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	char opcao, genero;
	String nome;
	
	
	linha(40);
	System.out.println("\n\n---------------PET CARE-----------------");
	System.out.println("O lugar ideal para os pais de pet:)");
	linha(40);
	System.out.println("\n[1] - COMPRAR PRODUTOS\n[2] - GERENCIAR ESTOQUE\n[3] - SAIR");
	System.out.print("\nENTRE COM O COMANDO: ");
	opcao = leia.next().toUpperCase().charAt(0);
	linha(40);
	
	if(opcao == '1') {
		System.out.print("\nEntre com seu nome: ");
		nome = leia.next();
		System.out.println("\nVocê se considera:\n[M] - Masculino\n[F] - Feminino\n[O] - Outro");
		System.out.print("\nENTRE COM O COMANDO: ");
		genero = leia.next().toUpperCase().charAt(0);
		if(retornaGenero(genero) == "MASCULINO") {
			System.out.println("\nSeja bem vindo Sr. " + nome + "! :)");
		}
		else if(retornaGenero(genero) == "FEMININO") {
			System.out.println("\nSeja bem vinda Sra. " + nome + "! :)");
		}
		else if(retornaGenero(genero) == "OUTRO") {
			System.out.println("\nSeja bem vindx Srx. " + nome + "! :)");
		}
		else {
			System.out.println("\nVocê digitou um comando inválido :( mas podemos prosseguir..");
		}
	}
	else if(opcao == '2') {
		System.out.println("\nWIP");
	}
	else if(opcao == '3') {
		System.out.println("\nAgradecemos sua visita!! Volte Sempre!! :)");
	}
	
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
		else if(genero == 'F') {
			volta = "OUTRO";
		}
		else {
			volta = "N/D";
		}
		return volta;
	}
}	
