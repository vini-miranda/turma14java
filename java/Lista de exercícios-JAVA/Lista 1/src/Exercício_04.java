import java.util.Scanner;

public class Exercício_04 {
	/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
	 * e calcule a seguinte expressão: d=r+s/2 onde r = (a+b)*2 e s = (b+c)*2
	 */ 

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("insira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("insira o segundo número: ");
		b = leia.nextInt();
		System.out.println("insira o terceiro número: ");
		c = leia.nextInt();
		
		int r = (a+b)*2;
		int s = (b+c)*2;
		int d = (r+s)/2;
		
		System.out.println("O resultado é " + d);
	}
}
