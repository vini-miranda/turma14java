package lista04;

import java.util.Random;
import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		
		System.out.println("-MATRIZ N1-\n");
		for(int linha=0;linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{N1[linha][coluna]= aleatorio.nextInt(4);
				System.out.printf("%d \t", N1[linha][coluna]);
			}
			System.out.println("\n");
		}
		System.out.println("\n-MATRIZ N2-\n");
		for(int linha=0;linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{N2[linha][coluna]= aleatorio.nextInt(4);
				System.out.printf("%d \t", N2[linha][coluna]);
			}
			System.out.println("\n");
		}
		
		System.out.println("\n-MATRIZ M1-\n");
		for(int linha=0;linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				M1[linha][coluna] = N1[linha][coluna]+N2[linha][coluna];
				System.out.printf("%d \t", M1[linha][coluna]);
			}
			System.out.println("\n");
		}
		
		System.out.println("\n-MATRIZ M2-\n");
		for(int linha=0;linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				M1[linha][coluna] = N1[linha][coluna]-N2[linha][coluna];
				System.out.printf("%d \t", M1[linha][coluna]);
			}
			System.out.println("\n");
		}

	}

}
