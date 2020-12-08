import java.util.Scanner;

public class Exercício_07 {
	/*Um sistema de equações lineares do tipo: 
	, pode ser resolvido segundo mostrado abaixo : 
	 
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e 
	mostra os valores de x e y. */

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double A,B,C,D,E,F,X,Y;
		System.out.println("insira o valor de A: ");
		A = leia.nextDouble();
		System.out.println("insira o valor de B: ");
		B = leia.nextDouble();
		System.out.println("insira o valor de C: ");
		C = leia.nextDouble();
		System.out.println("insira o valor de D: ");
		D = leia.nextDouble();
		System.out.println("insira o valor de E: ");
		E = leia.nextDouble();
		System.out.println("insira o valor de F: ");
		F = leia.nextDouble();
		

		X = (((C*E) - (B*F)) / ((A*E) - (B*D)));
		Y = (((A*F) - (C*D)) / ((A*E) - (B*D)));
		System.out.println("o valor de X é " + X + " e o valor de Y é " + Y);

	}

}
