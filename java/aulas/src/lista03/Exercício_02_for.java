package lista03;

import java.util.Scanner;

public class Exercício_02_for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 int multiploTres,soma=0;

		 for(multiploTres=1; multiploTres<=500; multiploTres++) {
		 	
		 	if((multiploTres%3 == 0) && (multiploTres%2 != 0)) {
		 		soma += multiploTres;
		 	}
		 	
		 }
		 System.out.println("o resultado da soma dos múltiplos impares de três é: " + soma);

	}

}
