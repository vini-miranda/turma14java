package exeTestes;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		int num;
		int soma = 0;
		
		do {
			System.out.print("\nInsira um n�mero inteiro: ");
			num = t.nextInt();
			
			if(num <= 21) {
				System.out.println("\nSOMA = " + soma + "+" + num);
				soma = num + soma;
				System.out.println("TOTAL = " + soma);
			}
			else {
				System.out.println("\ninsira um n�mero menor que 21!");
			}
			
		} while(soma < 21);
		
		if(soma >= 21) {
			System.out.println("ESTOUROU!! 21!!");
		}
	}
}
