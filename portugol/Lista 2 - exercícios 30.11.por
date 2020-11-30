programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//EXERCICIO 1
		escreva("\n EXERCÍCIO 1\n\n")

		real pesoTomates=0.0, variavelM=0.0, excesso=0.0
		escreva("Qual o peso dos tomates em Kgs no dia de hoje? ")
		leia(pesoTomates)
		variavelM = (pesoTomates-50)
		excesso = (variavelM*4)
		se (pesoTomates <= 50) {
			escreva("Não há valor adicional a pagar.")
		} senao {
			escreva("\nVocê excedeu o limite permitido e o custo adicional para pagar é ",excesso," reais")
		}

		
		//EXERCICIO 2
		/* Elabore um sistema que leia as variáveis C e N, 
		 *  respectivamente código e número de horas trabalhadas de um operário. 
		 *  E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 *  Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
		 *  caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		 *  No final do processamento imprimir o salário total e o salário excedente.*/
		escreva("\n\n EXERCÍCIO 2\n\n")
		real N=0.0,E=0.0,salario=0.0,adicional=0.0,salarioBase=500 
		escreva("Número de horas trabalhadas: ")
		leia(N)
		salario = N*10
		E = (((N-50)*20)+salarioBase)
		adicional = E-500

		se (salario <= 500) {
			escreva("\nSeu salário é ",salario," reais e não existem horas excedidas.")
		} senao {
			 escreva("\nSeu salário é ",E," reais e ", adicional, " reais é o seu valor adicional.")
		}

		//EXERCÍCIO 3
		/*Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/


		escreva("\n\n EXERCÍCIO 3\n\n")
		real num1,num2,num3,num4,quadrado1,quadrado2,quadrado3,quadrado4
		escreva("Entre com o primeiro número: ")
		leia(num1)
		escreva("Entre com o segundo número: ")
		leia(num2)
		escreva("Entre com o terceiro número: ")
		leia(num3)
		escreva("Entre com o quarto número: ")
		leia(num4)
		quadrado1 = mat.potencia(num1,2.0)
		quadrado2 = mat.potencia(num2,2.0)
		quadrado3 = mat.potencia(num3,2.0)
		quadrado4 = mat.potencia(num4,2.0)
		se (quadrado3 >= 1000) {
			escreva("\nO resultado da terceira operação é ",quadrado3," e sendo maior que mil, o programa se encerra aqui.")
		} senao {
			escreva("\nO quadrado de ",num1," é: ",quadrado1,
			        "\nO quadrado de ",num2," é: ",quadrado2,
			        "\nO quadrado de ",num3," é: ",quadrado3,
			        "\nO quadrado de ",num4," é: ",quadrado4)
		}

		//EXERCÍCIO 4
		/* Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
		 *  e se é positivo ou negativo.*/

		escreva("\n\n EXERCÍCIO 4\n\n")
		inteiro numero, par
		escreva("Digite um número inteiro: ")
		leia(numero)
		par = numero%2

		se(numero > 0 e par == 0) {
			escreva("\nEsse é um número positivo e par.")
			} senao se (numero>0 e par != 0) {
			escreva("\nEsse é um número positivo e ímpar.")	
			} senao se (numero<0 e par != 0) {
			escreva("\nEsse é um número negativo e ímpar.")
			} senao {
			escreva("\nEsse é um número negativo e par.")	
			}

		//EXERCÍCIO 5
		/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
		 * 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
		 * O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 
		 * as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
		 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
		 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
		 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.*/

		 escreva("\n\n EXERCÍCIO 5\n\n")
		real indiceDePoluicao=0.0
		escreva("Qual o índice de poluição atual? ")
		leia(indiceDePoluicao)

		se(indiceDePoluicao<0.3) {
			escreva("\nO índice de poluição é ",indiceDePoluicao," e todas as industrias podem continuar operando normalmente.")
		} senao se(indiceDePoluicao >= 0.3 e indiceDePoluicao < 0.4) {
			escreva("\nO índice de poluição é ",indiceDePoluicao," e as industrias do grupo 1 devem parar imediatamente de operar.")
		} senao se(indiceDePoluicao>=0.4 e indiceDePoluicao < 0.5) {
			escreva("\nO índice de poluição é ",indiceDePoluicao," e as industrias do grupo 1 e grupo 2 devem parar imediatamente de operar.")
		} senao {
			escreva("\nO índice de poluição é ",indiceDePoluicao," e todas as industrias devem parar imediatamente de operar.")
		}

		escreva("\n\n EXERCÍCIO 7\n\n")
		real base, altura, area
		escreva("Entre com a base do triângulo: ")
		leia(base)
		escreva("Entre com a altura do triângulo: ")
		leia(altura)

		area = ((base*altura)/2)
		se(base<0 ou base == 0) {
			escreva("\nInsira um número válido(positivo e diferente de zero)")
		} senao se(altura<0 ou altura == 0) {
			escreva("\nInsira um número válido(positivo e diferente de zero)")
		} senao {
			escreva("\nA área do triângulo é: ", area)
		}
		
		 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */