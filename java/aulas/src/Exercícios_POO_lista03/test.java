package Exercícios_POO_lista03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("produto1", 50.00));
		produtos.add(new Produto("produto2", 80.00));
		char continua = 'S';
		char op;
		do {
			System.out.println("[1] - ADICIONAR PRODUTO");
			System.out.println("[2] - REMOVER PRODUTO");
			System.out.println("[3] - ATUALIZAR PRODUTO");
			System.out.println("[4] - LISTA DE PRODUTOS");
			System.out.print("DIGITE A OPÇÃO:");
			op = t.next().charAt(0);

			while (op != '1' && op != '2' && op != '3' && op != '4') {
				System.out.println("ESCOLHA UMA OPÇÃO CORRETA");
				System.out.print("DIGITE A OPÇÃO:");
				op = t.next().charAt(0);
			}

			if (op == '1') {
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(Produto prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ADICIONAR");
				String nome = t.next();
				System.out.println("DIGITE O PREÇO DO PRODUTO");
				double preco = t.nextDouble();
				Produto produto = new Produto(nome, preco);

				produtos.add(produto);

			} else if (op == '2') {
				linha(80);
				System.out.println("    LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(Produto prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA REMOVER");
				String nome = t.next();

				for (Produto prod : produtos) {
					if (prod.getNome().equals(nome)) {
						produtos.remove(prod);
					}
				}

			} else if (op == '3') {
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(Produto prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}
				
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ATUALIZAR");
				String nome = t.next();
				System.out.println("DIGITE O NOVO NOME DO PRODUTO");
				String nomeNovo = t.next();
				
				Produto produto = new Produto(nome);

				for (Produto prod : produtos) {
					if (prod.getNome().equals(nome)) {
						prod.setNome(nomeNovo);
					}
				}

			} else if (op =='4'){
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(Produto prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}

			}
			
			System.out.println("\n\nDESEJA FAZER OUTRA AÇÃO? S/N");
			continua = t.next().toUpperCase().charAt(0);
			while(continua != 'S' && continua != 'N') {
				System.out.println("Digite uma opção válida");
				System.out.println("[S]-SIM [N]-NÃO");
				continua = t.next().toUpperCase().charAt(0);
			}

		} while (continua == 'S');
	}
	
	public static void linha(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print("═");
		}
		System.out.print("\n");
	}

}


