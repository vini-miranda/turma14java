import java.util.Scanner;

public class Exerc�cio_03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int seg;
		System.out.println("Tempo de dura��o de funcionamento da f�brica em segundos: ");
		seg = leia.nextInt();
		int horas = seg/3600;
		int minutos = (seg%3600)/60;
		int segundos = (seg%3600)%60;

		System.out.println("A f�brica funcionou "+ horas +" horas, \n"+ minutos+ " minutos e \n"+segundos+" segundos.\n\n");
	}
}
