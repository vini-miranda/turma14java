package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exercícios_POO_lista03.ProdutosLoja;

public class lojaPOO {


	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		
		char opcao, genero;
		String nome;
		lista.add(new Produto("Alimento para peixe Alcon Guppy 20gr","1",19.99,10));
		lista.add(new Produto("Arranhador Pawise Post Fred para Gatos","2",60.50,10));
		lista.add(new Produto("Brinquedo Chalesco para Cães Dental Bone","3",10.99,10));
		lista.add(new Produto("Casa Iglu Furacão Pet Verde para Cães Média","4",169.99,10));
		lista.add(new Produto("Coleira Ferplast Ergocomfort Linear para Cães","5",89.99,10));
		lista.add(new Produto("Fonte Bebedouro Furacão Pet","6",139.99,10));
		lista.add(new Produto("Gaiola Ferplast Criceti 9 Pirata para Roedores","7",249.99,10));
		lista.add(new Produto("Ração Golden Fórmula Light para Cães Adultos - 15kg","8",129.99,10));
		lista.add(new Produto("Ração Royal Canin Premium Cat 3kg","9",39.99,10));
		lista.add(new Produto("Shampoo e Condicionador Pet Clean Neutro para Cães e Gatos","10",11.99,10));
		
		
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
				System.out.println("\nVocê digitou um comando inválido :( mas podemos prosseguir..\n");
			}
			
			linha(80);
			System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
			linha(80);
			
			
			do
			{
				for(Produto prod: lista) {
					
					System.out.println("\n"+prod.getCodigoProduto() + "\t\t" + prod.getPrecoUnitario() + "\t\t"+ prod.getEstoqueProduto() + "\t"+ prod.getNomeProduto());
				}
				
				System.out.print("\nDigite o código do produto que deseja comprar para adiciona-lo no carrinho: ");
				String escolha = leia.next();
				System.out.print("Quantas unidades deseja: ");
				int unidade = leia.nextInt();
				
				for(Produto lt: lista) {
					if(escolha.equals(lt.getCodigoProduto())) {
						lt.venda(unidade);
					}
				}
				
				linha(80);
			    System.out.println("\nCARRINHO");
			    System.out.println("\nPREÇO(R$) \tPRODUTO");
			    linha(80);
				for(Produto lt: lista) {
					if(lt.getEstoqueProduto()!=10) {
						
						System.out.println("\n"+ (lt.getPrecoUnitario()*unidade) + "\t\t"+ lt.getNomeProduto());
					}
				}
				
				
			System.out.print("\nDESEJA REALIZAR NOVA COMPRA? S/N: ");
		    opcao = leia.next().toUpperCase().charAt(0);
				
			}while(opcao == 'S');
			
			
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
