package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class lojaPOO {


	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		
		char opcao, genero;
		String nome;
		double total = 0;
		int unidade=0;
		String nomeprod = null;
		lista.add(new Produto("Alimento para peixe Alcon Guppy 20gr","1",19.99,10));
		lista.add(new Produto("Arranhador Pawise Post Fred para Gatos","2",60.50,10));
		lista.add(new Produto("Brinquedo Chalesco para C�es Dental Bone","3",10.99,10));
		lista.add(new Produto("Casa Iglu Furac�o Pet Verde para C�es M�dia","4",169.99,10));
		lista.add(new Produto("Coleira Ferplast Ergocomfort Linear para C�es","5",89.99,10));
		lista.add(new Produto("Fonte Bebedouro Furac�o Pet","6",139.99,10));
		lista.add(new Produto("Gaiola Ferplast Criceti 9 Pirata para Roedores","7",249.99,10));
		lista.add(new Produto("Ra��o Golden F�rmula Light para C�es Adultos - 15kg","8",129.99,10));
		lista.add(new Produto("Ra��o Royal Canin Premium Cat 3kg","9",39.99,10));
		lista.add(new Produto("Shampoo e Condicionador Pet Clean Neutro para C�es e Gatos","10",11.99,10));
		
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
			System.out.print("\nVoc� se considera:\n[M] - Masculino\n[F] - Feminino\n[O] - Outro");
			System.out.print("\nENTRE COM O COMANDO: ");
			genero = leia.next().toUpperCase().charAt(0);
			System.out.print("\nDigite sua data de nascimento: ");
			int dataNasc = leia.nextInt();
			System.out.print("Digite seu CPF: ");
			String cpf = leia.next();
			
			Cliente cliente1 = new Cliente(nome,genero,dataNasc,cpf);
			
			linha(80);
			System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
			
			if(retornaGenero(genero) == "MASCULINO") 
			{
				System.out.println("NOME DO CLIENTE: " + cliente1.getNome());
				System.out.println("IDADE: " + cliente1.voltaIdade(dataNasc) + " ANOS");
				System.out.println("CPF: " + cliente1.getCpf());
				
			}
			else if(retornaGenero(genero) == "FEMININO") 
			{
				System.out.println("NOME DA CLIENTE: " + cliente1.getNome());
				System.out.println("IDADE: " + cliente1.voltaIdade(dataNasc) + " ANOS");
				System.out.println("CPF: " + cliente1.getCpf());
			}
			else if(retornaGenero(genero) == "OUTRO") 
			{
				System.out.println("NOME DX CLIENTX: " + cliente1.getNome());
				System.out.println("IDADE: " + cliente1.voltaIdade(dataNasc) + " ANOS");
				System.out.println("CPF: " + cliente1.getCpf());
			}
			else 
			{
				System.out.println("\nVoc� digitou um comando inv�lido :( mas podemos prosseguir..\n");
			}
			
			do
			{
				linha(80);
				System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				linha(80);
			
			
			
				for(Produto prod: lista) {
					
					System.out.println("\n"+prod.getCodigoProduto() + "\t\t" + prod.getPrecoUnitario() + "\t\t"+ prod.getEstoqueProduto() + "\t"+ prod.getNomeProduto());
				}
				
				System.out.print("\nDigite o c�digo do produto que deseja comprar para adiciona-lo no carrinho: ");
				String escolha = leia.next();
				System.out.print("Quantas unidades deseja: ");
				unidade = leia.nextInt();
				
				for(Produto lt: lista) {
					if(escolha.equals(lt.getCodigoProduto())) {
						lt.tiraEstoque(unidade);
					}
				}
				
				linha(80);
			    System.out.println("\nCARRINHO");
			    System.out.println("\nPRE�O(R$) \tPRODUTO");
			    linha(80);
				
			    
			    for(Produto lt: lista) {
					if(lt.getEstoqueProduto()!=10) {
						
						total = (lt.getPrecoUnitario()*unidade);
						nomeprod = lt.getNomeProduto();
						System.out.println("\n"+ total + "\t\t"+ nomeprod);
					}
				}
				
			    linha(80);
				System.out.println("\nTOTAL A PAGAR: " + total);
				System.out.print("\nDESEJA REALIZAR NOVA COMPRA? S/N: ");
			    opcao = leia.next().toUpperCase().charAt(0);
					
				}while(opcao == 'S');
				
				linha(80);
				System.out.println("\nPAGAMENTO");
				System.out.println("\nPRE�O(R$) \tPRODUTO");
				linha(80);
				for(Produto lt: lista) {
					if(lt.getEstoqueProduto()!=10) {
						
						System.out.println("\n"+ (lt.getPrecoUnitario()*unidade) + "\t\t"+ lt.getNomeProduto());
						
					}
				}
				System.out.println("\nCOMO DESEJA PAGAR:\n[1]A VISTA\n[2]PARCELADO");
				opcao = leia.next().charAt(0);
				if(opcao == '1') {
					System.out.println("SELECIONE A FORMA DE PAGAMENTO:\n[1]DINHEIRO OU CHEQUE\n[2]CART�O DE CR�DITO");
					opcao = leia.next().charAt(0);
					if(opcao == '1') {
						
					}
					else if(opcao == '2') {
						
					}
				}
				else if(opcao == '2') {
					System.out.println("\nESCOLHA A FORMA DE PAGAMENTO: \n[1]PARCELAR EM 2x\n[2]PARCELAR EM 3x ");
					opcao= leia.next().charAt(0);
						if(opcao == '1') {
							
						}
						else if(opcao == '2') {
							
						}
				}
				
				
				System.out.println("\nOBRIGADO PELA COMPRA!! VOLTE SEMPRE!! :)");
				System.out.print("\nDESEJA VOLTAR AO MENU PRINCIPAL? S?N: ");
				opcao = leia.next().toUpperCase().charAt(0);
			}
		
			if(opcao == '2') {
				linha(80);
				System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				linha(80);
			
			
			
				for(Produto prod: lista) {
					
					System.out.println("\n"+prod.getCodigoProduto() + "\t\t" + prod.getPrecoUnitario() + "\t\t"+ prod.getEstoqueProduto() + "\t"+ prod.getNomeProduto());
				}
				System.out.print("\nDESEJA VOLTAR AO MENU PRINCIPAL? S/N: ");
				opcao = leia.next().toUpperCase().charAt(0);
			}
			
			if(opcao == '3') {
				System.out.println("\nOBRIGADO PELA VISITA, ESTAMOS SEMPRE A SUA ESPERA! :)");
				linha(80);
			}
		
		}while(opcao == 'S');
		
		
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
