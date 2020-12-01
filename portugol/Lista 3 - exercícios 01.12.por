programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	//PARA
		
		//EXERCÍCIO 1
		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.*/ 
		escreva("\n\nPARA - EXERCÍCIO 1\n\n")
		const inteiro HAB = 2
		real salario, mediaSalario=0.0, maiorSalario=0.0, percentual=0.0
		inteiro filhos, mediaFilhos=0

		para(inteiro hab=1; hab <= HAB; hab++) {
			escreva("\nEntre com o salário do habitante [",hab,"]: ")
			leia(salario)
			escreva("Entre com o número de filhos do habitante [",hab,"]: ")
			leia(filhos)
			mediaSalario = mediaSalario + salario
			mediaFilhos = mediaFilhos + filhos
			se(maiorSalario < salario) {
				maiorSalario = salario
			} se(salario >= 100) {
				percentual++
			}
			
		}

		escreva("\nA média salarial da população é R$",mat.arredondar(mediaSalario/HAB,2))
		escreva("\nA média de filhos da população são ",mediaFilhos/HAB," filho(s).")
		escreva("\nO maior salario é R$", maiorSalario)
		escreva("\nO percentual de habitantes com salario maior que R$100 é de ",((percentual/HAB)*100),"%")
		
		
		

		//EXERCÍCIO 2
		/*Desenvolver um sistema que efetue a soma de todos os números ímpares que 
		 * são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/
		escreva("\n\nPARA - EXERCÍCIO 2\n\n")
		 inteiro multiploTres,soma=0

		 para(multiploTres=1; multiploTres<=500; multiploTres++) {
		 	
		 	se((multiploTres%3 == 0) e (multiploTres%2 != 0)) {
		 		soma += multiploTres
		 	}
		 	
		 }
		 escreva("o resultado da soma dos múltiplos impares de três é: ",soma)

		 escreva("\n\n")
		 //ENQUANTO

		 //EXERCÍCIO 1
		 /*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
		  * final o total do somatório, a média e o total de valores lidos. O programa deve fazer as 
		  * leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		  * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
		  escreva("\n\nENQUANTO - EXERCÍCIO 1\n\n")
		  inteiro numero
		  escreva("Digite um número: ")
		  leia(numero)

		 //EXERCICIO 2
		 /*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
		  * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
		  * deveremos observar na tela a seguinte sequência: 5 15 45 135.*/
		escreva("\n\nENQUANTO - EXERCÍCIO 2\n\n")
		  inteiro cont
		  escreva("Digite um número: ")
		  leia(cont)

		  enquanto(cont < 100) {
		  	cont = (cont*3)
		  	escreva(cont," ")
		  	
		  	}

		  //FAÇA ENQUANTO
		  //EXERCÍCIO 1
		  /*Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 
		   * quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
		   escreva("\n\nFAÇA ENQUANTO - EXERCÍCIO 1\n\n")
		   inteiro num = 233

		   faca {
		   	num++
		   	num = num + 2
		   	se(num >= 300 e num <=400) {
		   	num = num + 2
		   	}
		   	escreva(num, " ")
		   	
		   } enquanto (num<456)

		   //EXERCÍCIO 2
		   /*Faça um programa que pegue um número do teclado e calcule a soma de todos os números  
		    * de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, 
		    * pois  1+2+3+4+5+6+7=28.*/
		   escreva("\n\nFAÇA ENQUANTO - EXERCÍCIO 2\n\n")
		   inteiro numFat=0, somatorio=0, somaTotal=0
		   escreva("Entre com um número de 0 a 9: ")
		   leia(numFat)

		   faca {
		   	somatorio++
		   	somaTotal = somaTotal + somatorio
		   	
		   }
		   enquanto(somatorio < numFat)
		   	escreva("\n")
		   	escreva(somaTotal)
		   
		   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3807; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */