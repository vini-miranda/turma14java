package lista02;

import java.util.Scanner;

public class Exerc�cio_07_lista02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		System.out.print("Entre com a base do tri�ngulo: ");
		base = ler.nextDouble();
		System.out.print("Entre com a altura do tri�ngulo: ");
		altura = ler.nextDouble();
		area = ((base*altura)/2);
		
		if(base<0 || base == 0) {
			System.out.println("\nInsira um n�mero v�lido(positivo e diferente de zero)");
		} else if(altura<0 || altura == 0) {
			System.out.println("\nInsira um n�mero v�lido(positivo e diferente de zero)");
		} else {
			System.out.println("\nA �rea do tri�ngulo �: " + area);
		}

	}

}
