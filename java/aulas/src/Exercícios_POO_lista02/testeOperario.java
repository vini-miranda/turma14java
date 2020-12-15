package Exercícios_POO_lista02;

import java.util.Scanner;

public class testeOperario {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Operario opr = new Operario(800,0.10);
		
		System.out.print("ENTRE COM O NOME DO OPERARIO: ");
		opr.nome = t.nextLine();
		System.out.print("ENTRE COM O ENDEREÇO DO OPERARIO: ");
		opr.endereco = t.nextLine();
		System.out.print("ENTRE COM O TELEFONE DO OPERARIO: ");
		opr.telefone = t.nextLine();
		
		System.out.println("\n" + opr.getInfo());
		System.out.printf("\nVALOR DE PRODUÇÃO: R$%.2f\nCOMISSAO: %.2f porcento\nVENCIMENTO BASE: R$%.2f",opr.getValorProducao(),opr.getComissao(),opr.vencimentoBase());

	}

}
