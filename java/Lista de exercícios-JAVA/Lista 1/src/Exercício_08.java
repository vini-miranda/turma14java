import java.util.Scanner;

public class Exerc�cio_08 {
	/*O custo ao consumidor de um carro novo � a soma do custo de f�brica 
	 * com a percentagem do distribuidor e dos impostos (aplicados ao custo 
	 * de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os 
	 * impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro 
	 * e escreva o custo ao consumidor. 
	 */

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double custoFabrica;
		System.out.println("Insira o custo de f�brica do ve�culo: ");
		custoFabrica = leia.nextDouble();

		double custoConsumidor = ((custoFabrica * 0.28) + (custoFabrica* 0.45)) + custoFabrica;
		System.out.println("O valor do final do consumidor �: " + custoConsumidor);

	}

}
