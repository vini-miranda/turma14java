import java.util.Scanner;

public class tenario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor positivo inteiro acima de 0");
		int valor = leia.nextInt();
		System.out.println(((valor % 2)==0)?"Valor é par!!!":"Valor é impar!!!");
		//refatoração
		/*
		if ((valor % 2)==0) {
			System.out.println("Valor é par!!!");
		}
		else
		{
			System.out.println("Valor é impar!!!");
		} */
		
		//() ? verdadeiro : falso
		System.out.println("Sexo M/F:");
		char sexo = leia.next().toUpperCase().charAt(0);
	
		String tipo;
		
		tipo = (sexo=='M')?"Senhor":(sexo=='F')?"Senhora":"Senhorx";
		
		System.out.printf("Voce é %s e o numero digitado antes foi %d", tipo,valor);
		

	}

}
