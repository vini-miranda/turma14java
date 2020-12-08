import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversao_celsius_fah {
	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("##.00");
		Scanner leia = new Scanner(System.in);
		
		double tempFahrenheit;
		System.out.println("Escreva sua temperatura em Fahrenheit(F): ");
		tempFahrenheit = leia.nextDouble();

		double resultado = (tempFahrenheit - 32) * 5/9;
		System.out.println("sua temperatura em Celsius(C) é " + f.format(resultado) + " ºC");
		
		leia.close();
	}

}
