package Exercícios_POO_lista02;

import java.util.Scanner;

public class testeFornecedor {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Fornecedor forn1 = new Fornecedor(3.000,10.000);
		
		System.out.print("ENTRE COM O NOME DO ADMINISTRADOR: ");
		forn1.nome = t.nextLine();
		System.out.print("ENTRE COM O ENDEREÇO DO ADMINISTRADOR: ");
		forn1.endereco = t.nextLine();
		System.out.print("ENTRE COM O TELEFONE DO ADMINISTRADOR: ");
		forn1.telefone = t.nextLine();
		
		System.out.println("\n" + forn1.getInfo());
		
		System.out.printf("VALOR DA DIVIDA: %.3f\n", forn1.valorDivida);
		System.out.printf("VALOR DO CREDITO: %.3f\n", forn1.valorCredito);
		System.out.printf("VALOR DO SALDO: %.3f",forn1.valorSaldo());

	}

}
