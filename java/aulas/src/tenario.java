import java.util.Scanner;

public class tenario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		leia.close();
		System.out.println("Digite um valor positivo inteiro acima de 0");
		int valor = leia.nextInt();
		System.out.println(((valor % 2)==0)?"Valor � par!!!":"Valor � impar!!!");
		//refatora��o
		/*
		if ((valor % 2)==0) {
			System.out.println("Valor � par!!!");
		}
		else
		{
			System.out.println("Valor � impar!!!");
		} */
		
		//() ? verdadeiro : falso
		System.out.println("Sexo M/F:");
		char sexo = leia.next().toUpperCase().charAt(0);
	
		String tipo;
		
		tipo = (sexo=='M')?"Senhor":(sexo=='F')?"Senhora":"Senhorx";
		
		System.out.printf("Voce � %s e o numero digitado antes foi %d", tipo,valor);
		

	}

}
