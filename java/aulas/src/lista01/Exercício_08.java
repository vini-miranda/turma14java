import java.util.Scanner;

public class Exercício_08 {
	/*O custo ao consumidor de um carro novo é a soma do custo de fábrica 
	 * com a percentagem do distribuidor e dos impostos (aplicados ao custo 
	 * de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os 
	 * impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro 
	 * e escreva o custo ao consumidor. 
	 */

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double custoFabrica;
		System.out.println("Insira o custo de fábrica do veículo: ");
		custoFabrica = leia.nextDouble();

		double custoConsumidor = ((custoFabrica * 0.28) + (custoFabrica* 0.45)) + custoFabrica;
		System.out.println("O valor do final do consumidor é: " + custoConsumidor);

	}

}
