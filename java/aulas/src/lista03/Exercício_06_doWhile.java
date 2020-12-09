package lista03;

import java.util.Scanner;

public class Exercício_06_doWhile {

	public static void main(String[] args) {
	   Scanner leia = new Scanner(System.in);
		
	   int numFat=0, somatorio=0, somaTotal=0;
	   System.out.print("Entre com um número de 0 a 9: ");
	   numFat = leia.nextInt();

	   do {
	   	somatorio++;
	   	somaTotal = somaTotal + somatorio;
	   	
	   }while(somatorio < numFat);
	   	System.out.println(somaTotal);

	}

}
