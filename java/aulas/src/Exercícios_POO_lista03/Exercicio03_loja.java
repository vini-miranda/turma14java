package Exercícios_POO_lista03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03_loja {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		List<ProdutosLoja> lista = new ArrayList<>();
		
		lista.add(new ProdutosLoja("CAMISETA BRANCA",10));
		lista.add(new ProdutosLoja("CALÇA BEGE",4));
		lista.add(new ProdutosLoja("TENIS ST PRETO",3));
		
		System.out.println("PRODUTO \t\tQTD ESTOQUE");
		for(ProdutosLoja lt: lista) {
			System.out.println(lt.getProduto() + "\t\t" + lt.getEstoque());
		}
		
		//adicionando
		lista.add(new ProdutosLoja("BONE VERDE",16));
		lista.add(new ProdutosLoja("BERMUDA MARROM",8));
		
		System.out.println("\nLista Atualizada..");
		System.out.println("PRODUTO \t\tQTD ESTOQUE");
		for(ProdutosLoja lt: lista) {
			System.out.println(lt.getProduto() + "\t\t" + lt.getEstoque());
		}
		
		//removendo
		System.out.print("Digite o item que quer remover: ");
		String nome = t.nextLine();
		System.out.println("\nLista Atualizada..");
		System.out.println("PRODUTO \t\tQTD ESTOQUE");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getProduto() == nome) {
				lista.remove(i);
				
				System.out.println(lista.get(i).getProduto() + "\t\t" + lista.get(i).getEstoque()); 
			     
		    }
			
			
		}
	
	}

}
