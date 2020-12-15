package Exercícios_POO_lista02;

import java.util.Scanner;

public class testeVendedor {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Vendedor vend1 = new Vendedor(650,0.25);
		
		System.out.print("ENTRE COM O NOME DO VENDEDOR: ");
		vend1.nome = t.nextLine();
		System.out.print("ENTRE COM O ENDEREÇO DO VENDEDOR: ");
		vend1.endereco = t.nextLine();
		System.out.print("ENTRE COM O TELEFONE DO VENDEDOR: ");
		vend1.telefone = t.nextLine();
		
		System.out.println("\n" + vend1.getInfo());
		System.out.printf("\nVALOR DAS VENDAS: R$%.2f\nCOMISSAO: %.2f porcento\nVENCIMENTO BASE: R$%.2f",vend1.getValorVendas(),vend1.getComissao(),vend1.vencimentoBase());


	}

}
