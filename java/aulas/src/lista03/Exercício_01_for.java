package lista03;

import java.util.Scanner;

public class Exercício_01_for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int HAB = 20;
		double salario, mediaSalario=0.0, maiorSalario=0.0, percentual=0.0;
		int filhos, mediaFilhos=0;

		for(int hab=1; hab <= HAB; hab++) {
			System.out.print("\nEntre com o salário do habitante [" +hab+"]: ");
			salario = leia.nextDouble();
			System.out.print("Entre com o número de filhos do habitante ["+hab+"]: ");
			filhos = leia.nextInt();
			mediaSalario = mediaSalario + salario;
			mediaFilhos = mediaFilhos + filhos;
			if(maiorSalario < salario) {
				maiorSalario = salario;
			} if(salario >= 100) {
				percentual++;
			}
			
		}

		System.out.println("\nA média salarial da população é R$"+mediaSalario/HAB);
		System.out.println("\nA média de filhos da população são "+mediaFilhos/HAB+" filho(s).");
		System.out.println("\nO maior salario é R$"+ maiorSalario);
		System.out.println("\nO percentual de habitantes com salario maior que R$100 é de "+((percentual/HAB)*100)+"%");


	}

}
