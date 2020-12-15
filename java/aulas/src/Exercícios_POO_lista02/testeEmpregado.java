package Exercícios_POO_lista02;

import java.util.Scanner;

public class testeEmpregado {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Empregado empre1 = new Empregado(1,1.500);
		empre1.setImposto(15);
		
		System.out.print("ENTRE COM O NOME DO EMPREGADO: ");
		empre1.nome = t.nextLine();
		System.out.print("ENTRE COM O ENDEREÇO DO EMPREGADO: ");
		empre1.endereco = t.nextLine();
		System.out.print("ENTRE COM O TELEFONE DO EMPREGADO: ");
		empre1.telefone = t.nextLine();
		
		System.out.println("\n" + empre1.getInfo());
	
		
		System.out.printf("CODIGO SETOR: %d\nSALARIO BASE: R$%.3f\n", empre1.getCodigoSetor(),empre1.getSalarioBase());
		System.out.println("IMPOSTOS(%): " + empre1.getImposto() + "%");
		System.out.println("SALARIO COM IMPOSTOS: R$" + empre1.calcularSalario());
		

	}

}
