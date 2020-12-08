import java.util.Scanner;

public class Exercício_01 {
	
	/*Faça um sistema que leia a idade de uma pessoa 
	 * expressa em anos, meses e dias e mostre-a expressa 
	 * apenas em dias.*/
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int anos, meses, dias;
		System.out.println("Que ano você nasceu? ");
		anos = leia.nextInt();
		System.out.println("Que mês(em numero) você nasceu? ");
		meses = leia.nextInt();
		System.out.println("Que dia você nasceu? ");
		dias = leia.nextInt();
		
		int idadeAnos = 2020-anos;
		int idadeMeses = 12-meses;
		int idadeDias = 30-dias;
		int diasVividos = (idadeAnos*365) + (idadeMeses*30) + dias;
		
		System.out.println("Você tem " + idadeAnos + " anos e já viveu " + diasVividos + " dias.\n\n");
	}

}
