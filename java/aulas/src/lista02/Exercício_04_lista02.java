package lista02;

import java.util.Scanner;

//EXERCÍCIO 4
/* Faça um sistema que leia um número inteiro e mostre uma mensagem 
 * indicando se este número é par ou ímpar, 
 *  e se é positivo ou negativo.*/

public class Exercício_04_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, par;
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		par = numero%2;

		if (numero > 0 && par == 0) {
			System.out.println("\nEsse é um número positivo e par.");
			} else if (numero>0 && par != 0) {
			System.out.println("\nEsse é um número positivo e ímpar.");
			} else if (numero<0 && par != 0) {
			System.out.println("\nEsse é um número negativo e ímpar.");
			} else {
			System.out.println("\nEsse é um número negativo e par.");	
		}
	}

}
