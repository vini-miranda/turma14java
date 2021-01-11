package Exercícios_POO_lista02;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("VINI","HSKJHASK");
		Scanner t = new Scanner(System.in);
		
		System.out.print("DIGITE O NOME: ");
		p1.setNome(t.nextLine());
		System.out.println(p1.getNome());
		

	}

}
