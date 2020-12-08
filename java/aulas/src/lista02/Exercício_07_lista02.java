package lista02;

import java.util.Scanner;

public class Exercício_07_lista02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		System.out.print("Entre com a base do triângulo: ");
		base = ler.nextDouble();
		System.out.print("Entre com a altura do triângulo: ");
		altura = ler.nextDouble();
		area = ((base*altura)/2);
		
		if(base<0 || base == 0) {
			System.out.println("\nInsira um número válido(positivo e diferente de zero)");
		} else if(altura<0 || altura == 0) {
			System.out.println("\nInsira um número válido(positivo e diferente de zero)");
		} else {
			System.out.println("\nA área do triângulo é: " + area);
		}

	}

}
