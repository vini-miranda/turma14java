import java.util.Scanner;

public class funcao_idade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano;
		System.out.println("Digite a data de nascimento: ");
		ano = leia.nextInt();
		idade(ano);
		
		
		leia.close();
	}


static void idade(int ano) {
	int idade;
	idade = 2020-ano;
	System.out.println("Você tem " + idade + " anos.");
	}
}
