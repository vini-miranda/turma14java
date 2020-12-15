package Exercícios_POO_lista02;

import java.util.Scanner;

public class testeAdministrador {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Administrador adm = new Administrador(550.99);
		
		System.out.print("ENTRE COM O NOME DO ADMINISTRADOR: ");
		adm.nome = t.nextLine();
		System.out.print("ENTRE COM O ENDEREÇO DO ADMINISTRADOR: ");
		adm.endereco = t.nextLine();
		System.out.print("ENTRE COM O TELEFONE DO ADMINISTRADOR: ");
		adm.telefone = t.nextLine();
		
		System.out.println("\n" + adm.getInfo());
		System.out.println("AJUDA DE CUSTO: R$" + adm.getAjudaDeCusto());

	}

}
