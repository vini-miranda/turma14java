import java.util.Scanner;

public class Exercício_05 {
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
		System.out.println("Sua média final é: " + media);

	}

}
