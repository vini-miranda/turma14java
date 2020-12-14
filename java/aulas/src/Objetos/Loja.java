package Objetos;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Produto vestido = new Produto("VESTIDO",3,100.00);
		Produto blusa = new Produto("BLUSA",1,50.00);
		Produto camisa = new Produto("CAMISA",20,20.00);
		char codigo;
		
		linha(80);
		System.out.println("\nPRODUTOS DISPONÍVEIS");
		System.out.println("CÓDIGO \t PRODUTO \t VALOR \t\t ESTOQUE");
		linha(80);
		System.out.printf("\n01 \t %s \t %.2f \t %d",vestido.nomeProduto,vestido.valorUnitario,vestido.qtdEstoque);
		System.out.printf("\n02 \t %s \t\t %.2f \t\t %d",blusa.nomeProduto,blusa.valorUnitario,blusa.qtdEstoque);
		System.out.printf("\n03 \t %s \t %.2f \t\t %d",camisa.nomeProduto,camisa.valorUnitario,camisa.qtdEstoque);
		
		System.out.print("\n\nENTRE COM O CÓDIGO DO PRODUTO PARA ADICIONA-LO AO CARRINHO: ");
		codigo = t.next().charAt(0);
		
		
		
		

	}
	
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}

}
