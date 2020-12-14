package Objetos;

import java.util.Scanner;

public class BootLoko {
	
static Estudante aluno1 = new Estudante();

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		
		System.out.print("Entre com o nome do estudante: ");
		aluno1.nome = t.nextLine();
		System.out.print("\nDigite seu genero:\n[M]Masculino\n[F]Feminino\n[O]Outros ");
		aluno1.genero = t.next().toUpperCase().charAt(0);
		System.out.print("Digite sua data de Nascimento: ");
		aluno1.anoNascimento = t.nextInt();
		aluno1.anoNascimento = 2020 - aluno1.anoNascimento; 
		
		Mensagem(aluno1.nome,aluno1.genero,aluno1.anoNascimento);
			
	}
	
	
	static void Mensagem(String nome, char genero, int anoNascimento) 
	{
		if(aluno1.genero == 'M' && aluno1.anoNascimento < 18) {
			System.out.println("\nSEJA BEM VINDO " + aluno1.nome+", AO BOOT JOVEM!!");
		}
		else if(aluno1.genero == 'M' && aluno1.anoNascimento < 55) {
			System.out.println("\nSEJA BEM VINDO " + aluno1.nome+", AO BOOT JAVA!!");
		}
		else if(aluno1.genero == 'M' && aluno1.anoNascimento >= 55) {
			System.out.println("\nSEJA BEM VINDO " + aluno1.nome+", AO BOOT DA MAIOR IDADE!!");
		}
		else if(aluno1.genero == 'F' && aluno1.anoNascimento < 18) {
			System.out.println("\nSEJA BEM VINDA " + aluno1.nome+", AO BOOT JOVEM!!");
		}
		else if(aluno1.genero == 'F' && aluno1.anoNascimento < 55) {
			System.out.println("\nSEJA BEM VINDA " + aluno1.nome+", AO BOOT JAVA!!");
		}
		else if(aluno1.genero == 'F' && aluno1.anoNascimento >= 55) {
			System.out.println("\nSEJA BEM VINDA " + aluno1.nome+", AO BOOT DA MAIOR IDADE!!");
		}
		else if(aluno1.genero == 'O' && aluno1.anoNascimento < 18) {
			System.out.println("\nSEJA BEM VINDX " + aluno1.nome+", AO BOOT JOVEM!!");
		}
		else if(aluno1.genero == 'O' && aluno1.anoNascimento < 55) {
			System.out.println("\nSEJA BEM VINDX " + aluno1.nome+", AO BOOT JAVA!!");
		}
		else if(aluno1.genero == 'O' && aluno1.anoNascimento >= 55) {
			System.out.println("\nSEJA BEM VINDX " + aluno1.nome+", AO BOOT DA MAIOR IDADE!!");
		}
		else {
			System.out.println("\nCOMANDO INVÁLIDO :(");
		}
	}

}
