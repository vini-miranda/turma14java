import java.util.Scanner;

public class Exerc�cio_04 {
	/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
	 * e calcule a seguinte express�o: d=r+s/2 onde r = (a+b)*2 e s = (b+c)*2
	 */ 

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("insira o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.println("insira o segundo n�mero: ");
		b = leia.nextInt();
		System.out.println("insira o terceiro n�mero: ");
		c = leia.nextInt();
		
		int r = (a+b)*2;
		int s = (b+c)*2;
		int d = (r+s)/2;
		
		System.out.println("O resultado � " + d);
	}
}
