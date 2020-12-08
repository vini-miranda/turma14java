package lista02;

import java.util.Scanner;

//EXERCICIO 1
/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
 *  deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a 
 *  variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na 
 *  variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

public class Exercicio_01_lista02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double pesoTomates=0.0, variavelM=0.0, excesso=0.0;
		System.out.println("Qual o peso dos tomates em Kgs no dia de hoje? ");
		pesoTomates = leia.nextDouble();
		variavelM = (pesoTomates-50);
		excesso = (variavelM*4);
		
		if (pesoTomates <= 50) {
			System.out.println("Não há valor adicional a pagar.");
		} 
		else 
		{
			System.out.printf("\nVocê excedeu o limite permitido e o custo adicional para pagar é R$%.2f.",excesso);
		}
	}
}
