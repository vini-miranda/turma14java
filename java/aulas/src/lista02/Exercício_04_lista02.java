package lista02;

import java.util.Scanner;

//EXERC�CIO 4
/* Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem 
 * indicando se este n�mero � par ou �mpar, 
 *  e se � positivo ou negativo.*/

public class Exerc�cio_04_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, par;
		System.out.println("Digite um n�mero inteiro: ");
		numero = leia.nextInt();
		par = numero%2;

		if (numero > 0 && par == 0) {
			System.out.println("\nEsse � um n�mero positivo e par.");
			} else if (numero>0 && par != 0) {
			System.out.println("\nEsse � um n�mero positivo e �mpar.");
			} else if (numero<0 && par != 0) {
			System.out.println("\nEsse � um n�mero negativo e �mpar.");
			} else {
			System.out.println("\nEsse � um n�mero negativo e par.");	
		}
	}

}
