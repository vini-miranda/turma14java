import java.util.Scanner;

public class Exerc�cio_04 {
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
