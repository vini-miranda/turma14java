package lista02;

import java.util.Scanner;

//EXERCICIO 1
/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
 *  deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a 
 *  vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na 
 *  vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.*/

public class Exercicio_01_lista02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double pesoTomates=0.0, variavelM=0.0, excesso=0.0;
		System.out.println("Qual o peso dos tomates em Kgs no dia de hoje? ");
		pesoTomates = leia.nextDouble();
		variavelM = (pesoTomates-50);
		excesso = (variavelM*4);
		
		if (pesoTomates <= 50) {
			System.out.println("N�o h� valor adicional a pagar.");
		} 
		else 
		{
			System.out.printf("\nVoc� excedeu o limite permitido e o custo adicional para pagar � R$%.2f.",excesso);
		}
	}
}
