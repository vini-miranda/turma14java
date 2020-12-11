package lista05;

import java.util.Scanner;

public class Exercício_06 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int vet[] = new int[3];
		int entrada2=0, multiplicacao=0;
		int matriz[][] = new int[3][3];

		for(int i=0 ; i<3 ; i++){
			System.out.print("Entre com o valor da posição "+(i+1)+": ");
			entrada2 = t.nextInt();
			vet[i] = entrada2;
		}

		System.out.println("\nVALORES MATRIZ\n");
		for(int linha=0 ; linha<3 ; linha++){
			for(int coluna=0 ; coluna<3 ; coluna++) {
				System.out.print("entre com o valor linha/coluna "+linha+"/"+coluna+": ");
				matriz[linha][coluna] = t.nextInt();
				
			} 
			System.out.println("\n");
			
		}
		System.out.println("\n-----CÁLCULO------\n");
		for(int linha=0 ; linha<3 ; linha++){
			for(int coluna=0 ; coluna<3 ; coluna++) {
				matriz[linha][coluna] = vet[coluna]*matriz[linha][coluna];
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println("\n");
				
		}

	}

}
