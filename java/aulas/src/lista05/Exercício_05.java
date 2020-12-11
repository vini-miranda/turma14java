package lista05;

import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		double vetor[] = new double[5];
		double entrada;
		char opcao = ' ';

		for(int i=0 ; i<5 ; i++){
			System.out.print("\nEntre com o valor da posição "+(i+1)+": ");
			entrada = t.nextDouble();
			vetor[i] = entrada;
		}
		System.out.println("\nDigite o modo de exibição:\n[1]Ordem direta\n[2]Ordem inversa\n[0]Finalizar programa ");
		opcao = t.next().charAt(0);
		if(opcao == '0') {
			
		}
		else if(opcao == '1') {
			System.out.println(vetor[0]+" - "+vetor[1]+" - "+vetor[2]+" - "+vetor[3]+" - "+vetor[4]);
		}
		else if(opcao == '2') {
			System.out.println(vetor[4]+" - "+vetor[3]+" - "+vetor[2]+" - "+vetor[1]+" - "+vetor[0]);
		}
		else {
			System.out.println("\nDigite um comando válido!!");
		}

	}

}
