package lista03;

import java.util.Scanner;

public class Exerc�cio_04_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		  int cont;
		  System.out.print("Digite um n�mero: ");
		  cont = leia.nextInt();

		  while(cont < 100) {
		  	cont = (cont*3);
		  	System.out.print(cont + " ");
		  	
		 }

	}

}
