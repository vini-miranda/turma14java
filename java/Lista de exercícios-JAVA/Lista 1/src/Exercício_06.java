import java.util.Scanner;

public class Exercício_06 {
	/*Construa um programa em c que, tendo como dados de entrada 
	 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
	 * escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	 */
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		double x1=0.0, x2=0.0, y1=0.0, y2=0.0, dist=0.0, p1=0.0, p2=0.0;

				System.out.println("Entre com o valor de  X1: ");
				x1 = leia.nextDouble();
				System.out.println("Entre com o valor de  X2: ");
				x2 = leia.nextDouble();
				System.out.println("Entre com o valor de  Y1: ");
				y1 = leia.nextDouble();
				System.out.println("Entre com o valor de  Y2: ");
				y2 = leia.nextDouble();
				
				p1 = Math.pow((x2-x1),2);
				p2 = Math.pow((y2-y1),2);
				dist = Math.sqrt((p1 + p2));
				
				System.out.println("Valor de distância é: " + dist);
	}

}
