programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//EXERCICIO 1
		/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
		 *  deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a 
		 *  variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na 
		 *  variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

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
		real N=0.0,E=0.0,salario=0.0,adicional=0.0,salarioBase=500.0
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

		//EXERCÍCIO 6
		/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos*/

		escreva("\n\n EXERCÍCIO 6\n\n")
		inteiro idadeNadador
		escreva("Qual a idade do nadador? ")
		leia(idadeNadador)

		se(idadeNadador<5) {
			escreva("\nVocê é muito novo e não pode fazer natação aqui ainda :(\n")
		} senao se(idadeNadador>=5 e idadeNadador<=7) {
			escreva("\nClassificação: Infantil A\n")
		} senao se(idadeNadador>=8 e idadeNadador<=11) {
			escreva("\nClassificação: Infantil B\n")
		} senao se(idadeNadador>=12 e idadeNadador<=13) {
			escreva("\nClassificação: Juvenil A\n")
		} senao se(idadeNadador>=14 e idadeNadador<=17) {
			escreva("\nClassificação: Juvenil B\n")
		} senao {
			escreva("\nClassificação: Adultos\n")
		}
		

		//EXERCÍCIO 7
		/*Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.*/

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

		//EXERCÍCIO 8
		/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
		 * caso contrário imprimi-la com o valor zero.*/

		 escreva("\n\n EXERCÍCIO 8\n\n")
		 real n=0.0
		 escreva("Insira um número maior que cem: ")
		 leia(n)
		 se(n<=100) {
		 	escreva("\n0\n")
		 } senao {
		 	escreva("\n")
		 	escreva(n)
		 	escreva("\n")
		 }	 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */