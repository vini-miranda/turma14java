import java.util.Scanner;

public class Exerc�cio_05 {
	/* Fa�a um sistema que leia as 3 notas de um aluno e calcule 
	 * a m�dia final deste aluno. Considerar que a m�dia � ponderada e 
	 * que o peso das notas �: 2,3 e 5, respectivamente. 
	 */
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		double media = (((nota1*2)+(nota2*3))+(nota3*5)) / 10;
		System.out.println("Sua m�dia final �: " + media);

	}

}
