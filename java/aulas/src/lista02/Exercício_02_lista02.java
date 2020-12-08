package lista02;

import java.util.Scanner;

//EXERCICIO 2
/* Elabore um sistema que leia as variáveis C e N, 
 *  respectivamente código e número de horas trabalhadas de um operário. 
 *  E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 *  Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 *  caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 *  No final do processamento imprimir o salário total e o salário excedente.*/
 
public class Exercício_02_lista02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double N=0.0,E=0.0,salario=0.0,adicional=0.0,salarioBase=500.0;
		System.out.println("Número de horas trabalhadas: ");
		N = leia.nextDouble();
		salario = N*10;
		E = (((N-50)*20)+salarioBase);
		adicional = E-500;

		if (salario <= 500) {
			System.out.printf("\nSeu salário é R$%.2f e não existem horas excedidas.",salario);
		}
		else {
			 System.out.printf("\nSeu salário é R$%.2f e R$%.2f é o seu valor adicional.",E,adicional);
		}
	}
}
