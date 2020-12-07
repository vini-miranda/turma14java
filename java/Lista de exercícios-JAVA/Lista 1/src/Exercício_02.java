import java.util.Scanner;

public class Exercício_02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int dias;
		System.out.println("Quantos dias você já viveu? ");
		dias = leia.nextInt();
		int anosDistribuidos = (dias/365);
		int mesesDistribuidos = (dias%365)/30;
		int diasDistribuidos = (dias%365)%30;
		
		System.out.println("Você já viveu " + anosDistribuidos + " anos\n" + 
				mesesDistribuidos + " meses e \n" + diasDistribuidos + " dias.\n\n");

	}
}
