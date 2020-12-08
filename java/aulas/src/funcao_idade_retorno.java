import java.util.Scanner;

public class funcao_idade_retorno {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano;
		System.out.println("Digite a data de nascimento: ");
		ano = leia.nextInt();
		
		
		if(idade(ano) <= 18) {
			System.out.println("Oi, você tem " + idade(ano) + " anos e é considerado infanto-juvenil.");
		}
		else if(idade(ano) > 18 && idade(ano) <= 60) {
			System.out.println("Oi, você tem " + idade(ano) + " anos e é considerado adulto.");
		}
		else {
			System.out.println("Oi, você tem " + idade(ano) + " anos e é considerado idoso.");
		}
		leia.close();
	}

static int idade(int ano) 
{	return (2020-ano);
	}
}


