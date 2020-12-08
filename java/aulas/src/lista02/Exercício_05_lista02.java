package lista02;

import java.util.Scanner;

//EXERCÍCIO 5
/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
 * 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
 * O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 
 * as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.*/

public class Exercício_05_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double indiceDePoluicao=0.0;
		System.out.println("Qual o índice de poluição atual? ");
		indiceDePoluicao = leia.nextDouble();

		if(indiceDePoluicao<0.3) {
			System.out.println("\nO índice de poluição é "+indiceDePoluicao+" e todas as industrias podem continuar operando normalmente.");
		} else if(indiceDePoluicao >= 0.3 && indiceDePoluicao < 0.4) {
			System.out.println("\nO índice de poluição é "+indiceDePoluicao+" e as industrias do grupo 1 devem parar imediatamente de operar.");
		} else if(indiceDePoluicao>=0.4 && indiceDePoluicao < 0.5) {
			System.out.println("\nO índice de poluição é "+indiceDePoluicao+" e as industrias do grupo 1 e grupo 2 devem parar imediatamente de operar.");
		} else {
			System.out.println("\nO índice de poluição é "+indiceDePoluicao+" e todas as industrias devem parar imediatamente de operar.");
		}

	}

}
