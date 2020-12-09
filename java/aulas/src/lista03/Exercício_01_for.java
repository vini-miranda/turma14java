package lista03;

import java.util.Scanner;

public class Exerc�cio_01_for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int HAB = 20;
		double salario, mediaSalario=0.0, maiorSalario=0.0, percentual=0.0;
		int filhos, mediaFilhos=0;

		for(int hab=1; hab <= HAB; hab++) {
			System.out.print("\nEntre com o sal�rio do habitante [" +hab+"]: ");
			salario = leia.nextDouble();
			System.out.print("Entre com o n�mero de filhos do habitante ["+hab+"]: ");
			filhos = leia.nextInt();
			mediaSalario = mediaSalario + salario;
			mediaFilhos = mediaFilhos + filhos;
			if(maiorSalario < salario) {
				maiorSalario = salario;
			} if(salario >= 100) {
				percentual++;
			}
			
		}

		System.out.println("\nA m�dia salarial da popula��o � R$"+mediaSalario/HAB);
		System.out.println("\nA m�dia de filhos da popula��o s�o "+mediaFilhos/HAB+" filho(s).");
		System.out.println("\nO maior salario � R$"+ maiorSalario);
		System.out.println("\nO percentual de habitantes com salario maior que R$100 � de "+((percentual/HAB)*100)+"%");


	}

}
