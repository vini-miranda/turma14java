package lista05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.00");
		
		double peso=0.0, altura=0.0, imc=0.0;
		System.out.print("Entre com o peso(Kgs): ");
		peso = t.nextDouble();
		System.out.print("Entre com a altura(Metros): ");
		altura = t.nextDouble();
		
		imc = (peso/Math.pow(altura, 2));
		
		if(imc<18.5){
			System.out.println("\nSeu IMC: "+f.format(imc)+"\nCondição: Abaixo do peso");
		}
		else if(imc>=18.5 && imc<25){
			System.out.println("\nSeu IMC: "+f.format(imc)+"\nCondição: Peso Normal");
		}
		else if(imc>=25 && imc<30){
			System.out.println("\nSeu IMC: "+f.format(imc)+"\nCondição: Acima do peso");
		} else {
			System.out.println("\nSeu IMC: "+f.format(imc)+"\nCondição: Obesidade");
		}

	}

}
