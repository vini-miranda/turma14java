import java.util.Scanner;

public class Exercício_03 {
	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int seg;
		System.out.println("Tempo de duração de funcionamento da fábrica em segundos: ");
		seg = leia.nextInt();
		int horas = seg/3600;
		int minutos = (seg%3600)/60;
		int segundos = (seg%3600)%60;

		System.out.println("A fábrica funcionou "+ horas +" horas, \n"+ minutos+ " minutos e \n"+segundos+" segundos.\n\n");
	}
}
