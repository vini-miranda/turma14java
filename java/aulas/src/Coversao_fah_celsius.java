import java.text.DecimalFormat;
import java.util.Scanner;

public class Coversao_fah_celsius {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.00");
		
		double tempCelsius;
		System.out.println("Escreva a temperatura em Celsius(C): ");
		tempCelsius = leia.nextDouble();

		double tempFahrenheit = (tempCelsius * 9/5) + 32;
		System.out.println("A temperatura em Fahrenheit é " + f.format(tempFahrenheit) + " ºF");

		leia.close();
	}

}
