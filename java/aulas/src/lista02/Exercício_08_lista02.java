package lista02;

import java.util.Scanner;

public class Exerc�cio_08_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 double n=0.0;
		 System.out.print("Insira um n�mero maior que cem: ");
		 n = leia.nextDouble();
		 /*if(n<=100) {
		 	System.out.println("\n0\n");
		 } else {
		 	System.out.println(n);
		 }*/
		 
		 System.out.println((n<=100)?"0":n);
	}

}
