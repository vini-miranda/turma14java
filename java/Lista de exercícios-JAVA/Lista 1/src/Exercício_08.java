import java.util.Scanner;

public class Exerc�cio_08 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double custoFabrica;
		System.out.println("Insira o custo de f�brica do ve�culo: ");
		custoFabrica = leia.nextDouble();

		double custoConsumidor = ((custoFabrica * 0.28) + (custoFabrica* 0.45)) + custoFabrica;
		System.out.println("O valor do final do consumidor �: " + custoConsumidor);

	}

}
