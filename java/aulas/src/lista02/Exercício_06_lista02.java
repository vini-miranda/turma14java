package lista02;

import java.util.Scanner;

//EXERCÍCIO 6
/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

public class Exercício_06_lista02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idadeNadador;
		System.out.println("Qual a idade do nadador? ");
		idadeNadador = leia.nextInt();

		if(idadeNadador<5) {
			System.out.println("\nVocê é muito novo e não pode fazer natação aqui ainda :(\n");
		} else if(idadeNadador>=5 && idadeNadador<=7) {
			System.out.println("\nClassificação: Infantil A\n");
		} else if(idadeNadador>=8 && idadeNadador<=11) {
			System.out.println("\nClassificação: Infantil B\n");
		} else if(idadeNadador>=12 && idadeNadador<=13) {
			System.out.println("\nClassificação: Juvenil A\n");
		} else if(idadeNadador>=14 && idadeNadador<=17) {
			System.out.println("\nClassificação: Juvenil B\n");
		} else{
			System.out.println("\nClassificação: Adultos\n");
		}

	}

}
