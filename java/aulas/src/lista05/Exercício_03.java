package lista05;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int num, totalizador1=0, totalizador2=0, totalizador3=0, totalizador4=0, totalizador5=0;

		do {
			System.out.print("Digite um número: ");
			num = t.nextInt();
			
			if(num>=0 && num<=25) {
				totalizador1 = (totalizador1 + 1);
				System.out.println("GRUPO [0-25] = "+totalizador1+" membros\n\n");
			}
			else if(num>=26 && num<=50) {
				totalizador2 = totalizador2 + 1;
				System.out.println("GRUPO [26-50] = "+totalizador2+" membros\n\n");
			}
			else if(num>=51 && num<=75) {
				totalizador3 = totalizador3 + 1;
				System.out.println("GRUPO [50-75] = "+totalizador3+" membros\n\n");
			}
			else if(num>=76 && num<=100) {
				totalizador4 = totalizador4 + 1;
				System.out.println("GRUPO [75-100] = "+totalizador4+" membros\n\n");
			} 
			else if(num>100){
				totalizador5 = totalizador5 + 1;
				System.out.println("GRUPO [100>] = "+totalizador5+" membros\n\n");
			}
		}
		while(num>0);
		System.out.println("\nDigite um número válido!");

	}

}
