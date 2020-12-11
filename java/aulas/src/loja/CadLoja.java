package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String codigo[] = new String[10];
	int estoque[] = new int[10];
	String produto[] = {"Alimento para peixe Alcon Guppy 20gr", "Arranhador Pawise Post Fred para Gatos", "Brinquedo Chalesco para Cães Dental Bone", 
						"Casa Iglu Furacão Pet Verde para Cães Média ","Coleira Ferplast Ergocomfort Linear para Cães", "Fonte Bebedouro Furacão Pet", 
						"Gaiola Ferplast Criceti 9 Pirata para Roedores", "Ração Golden Fórmula Light para Cães Adultos - 15kg","Ração Royal Canin Premium Cat 3kg", 
						"Shampoo e Condicionador Pet Clean Neutro para Cães e Gatos"};
	double preco[] = {19,60,10,170,90,170,250,135,37,12};
	char opcao, genero, continuar='S';
	String nome;
	String escolha;
	int escolhido=0;
	
	do 
	{
			linha(80);
			System.out.println("\n\n-----------------------------------PET CARE-------------------------------------");
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
				System.out.print("\nVocê se considera:\n[M] - Masculino\n[F] - Feminino\n[O] - Outro");
				System.out.print("\nENTRE COM O COMANDO: ");
				genero = leia.next().toUpperCase().charAt(0);
				if(retornaGenero(genero) == "MASCULINO") 
				{
					System.out.println("\nSeja bem vindo Sr. " + nome + "! :)\n");
				}
				else if(retornaGenero(genero) == "FEMININO") 
				{
					System.out.println("\nSeja bem vinda Sra. " + nome + "! :)\n");
				}
				else if(retornaGenero(genero) == "OUTRO") 
				{
					System.out.println("\nSeja bem vindx Srx. " + nome + "! :)\n");
				}
				else 
				{
					System.out.println("\nVocê digitou um comando inválido :( mas podemos prosseguir..\n");
				}
				
				linha(80);
				System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				linha(80);
				for (int x=0; x<10; x++)
				{
					estoque[x]=10;
					codigo[x]=(x<9)?"PET-00"+(x+1):"PET-0"+(x+1);
					System.out.printf("\n%s\t\t%.2f\t\t%d\t%s\n",codigo[x],preco[x],estoque[x],produto[x]);
					
				}
				System.out.print("\nDigite o código do produto para adiciona-lo no carrinho: ");
				escolha = leia.next().toUpperCase();
				
				for(int i=0;i<10;i++) {
					if(codigo[i].equals(escolha)) {
						escolhido = i;
					}
				}
				linha(80);
				System.out.println("\nCARRINHO DE COMPRAS");
				linha(80);
				System.out.println("\n" + produto[escolhido]+"\t\tR$"+ preco[escolhido]);
				
				
				
				
				/*System.out.println("\nDeseja continuar? Digite S/N: ");
				continuar = leia.next().toUpperCase().charAt(0);
				break;*/
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
			System.out.print("=");
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
