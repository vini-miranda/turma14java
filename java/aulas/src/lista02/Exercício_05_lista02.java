package lista02;

import java.util.Scanner;

//EXERC�CIO 5
/*A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 
 * 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
 * O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 
 * as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, 
 * se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
 * se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

public class Exerc�cio_05_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double indiceDePoluicao=0.0;
		System.out.println("Qual o �ndice de polui��o atual? ");
		indiceDePoluicao = leia.nextDouble();

		if(indiceDePoluicao<0.3) {
			System.out.println("\nO �ndice de polui��o � "+indiceDePoluicao+" e todas as industrias podem continuar operando normalmente.");
		} else if(indiceDePoluicao >= 0.3 && indiceDePoluicao < 0.4) {
			System.out.println("\nO �ndice de polui��o � "+indiceDePoluicao+" e as industrias do grupo 1 devem parar imediatamente de operar.");
		} else if(indiceDePoluicao>=0.4 && indiceDePoluicao < 0.5) {
			System.out.println("\nO �ndice de polui��o � "+indiceDePoluicao+" e as industrias do grupo 1 e grupo 2 devem parar imediatamente de operar.");
		} else {
			System.out.println("\nO �ndice de polui��o � "+indiceDePoluicao+" e todas as industrias devem parar imediatamente de operar.");
		}

	}

}
