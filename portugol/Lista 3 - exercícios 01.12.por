programa
{
	
	funcao inicio()
	{	//PARA
		
		//EXERCÍCIO 1
		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.*/ 

		//EXERCÍCIO 2
		/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se 
		 * encontram no conjunto dos números de 1 até 500.*/

		 inteiro multiploTres,soma=0

		 para(multiploTres=1; multiploTres<=500; multiploTres++) {
		 	
		 	se((multiploTres%3 == 0) e (multiploTres%2 != 0)) {
		 		soma += multiploTres
		 	}
		 	
		 }
		 escreva("o resultado da soma dos múltiplos impares de três é: ",soma)

		 escreva("\n\n")
		 //ENQUANTO
		 //EXERCICIO 2
		 /*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
		  * até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte 
		  * sequência: 5 15 45 135.*/

		  inteiro cont, multiplicador
		  escreva("Digite um número: ")
		  leia(cont)

		  enquanto(cont < 100) {
		  	cont = (cont*3)
		  	escreva(cont," ")
		  	
		  	}

		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */