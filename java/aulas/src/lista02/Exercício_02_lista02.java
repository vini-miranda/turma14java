package lista02;

import java.util.Scanner;

//EXERCICIO 2
/* Elabore um sistema que leia as vari�veis C e N, 
 *  respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
 *  E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
 *  Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
 *  caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
 *  No final do processamento imprimir o sal�rio total e o sal�rio excedente.*/
 
public class Exerc�cio_02_lista02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double N=0.0,E=0.0,salario=0.0,adicional=0.0,salarioBase=500.0;
		System.out.println("N�mero de horas trabalhadas: ");
		N = leia.nextDouble();
		salario = N*10;
		E = (((N-50)*20)+salarioBase);
		adicional = E-500;

		if (salario <= 500) {
			System.out.printf("\nSeu sal�rio � R$%.2f e n�o existem horas excedidas.",salario);
		}
		else {
			 System.out.printf("\nSeu sal�rio � R$%.2f e R$%.2f � o seu valor adicional.",E,adicional);
		}
	}
}
