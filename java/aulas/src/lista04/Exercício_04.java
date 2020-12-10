package lista04;

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int mat[][] = new int[3][3];
		int valor, somaDiagonal=0, somaTotal=0;

		for(int linha=0 ; linha<3 ; linha++) {
			for(int coluna=0 ; coluna<3 ; coluna++) {
				
				System.out.println("entre com o valor linha/coluna "+(linha+1)+"/"+(coluna+1)+": ");
				mat[linha][coluna] = leia.nextInt();
				if(linha == coluna) {
					somaDiagonal = mat[linha][coluna] + somaDiagonal;
					}
					somaTotal = mat[linha][coluna] + somaTotal;

			} System.out.println("\n");
		}
		for(int linha=0 ; linha<3 ; linha++) {
			for(int coluna=0 ; coluna<3 ; coluna++){
				
				System.out.print(mat[linha][coluna]+"\t");
				
			} System.out.println("\n");
		}
		System.out.println("\nA soma da diagonal principal é "+somaDiagonal);
		System.out.println("\nA soma total dos valores é "+somaTotal);

	}

}
