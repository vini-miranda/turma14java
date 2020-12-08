package lista02;

import java.util.Scanner;

//EXERCÍCIO 3
/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

public class Exercício_03_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1,num2,num3,num4,quadrado1,quadrado2,quadrado3,quadrado4;
		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextDouble();
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextDouble();
		System.out.println("Entre com o terceiro número: ");
		num3 = leia.nextDouble();
		System.out.println("Entre com o quarto número: ");
		num4 = leia.nextDouble();
		
		
		quadrado1 = Math.pow(num1, 2.0);
		quadrado2 = Math.pow(num2, 2.0);
		quadrado3 = Math.pow(num3, 2.0);
		quadrado4 = Math.pow(num4, 2.0);
		
		if (quadrado3 >= 1000) {
			System.out.printf("\nO resultado da terceira operação é %.2f e sendo maior que mil, o programa se encerra aqui.",quadrado3);
		} 
		else {
			System.out.printf("\nO quadrado de %.1f é %.1f."
							+ "\nO quadrado de %.1f é %.1f. "
			        		+ "\nO quadrado de %.1f é %.1f. "
			        		+ "\nO quadrado de %.1f é %.1f. "
			        		,num1,quadrado1,num2,quadrado2,num3,quadrado3,num4,quadrado4);
		}

	}

}
