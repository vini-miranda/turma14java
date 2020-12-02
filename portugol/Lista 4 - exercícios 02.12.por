programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{	//EXERCÍCIO 1
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de 
		 *uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

		  escreva("\n\nEXERCICIO 1\n\n")
		  inteiro num[5], x, maiorNum=0

		  para(x=0;x<5;x++) {
		  	escreva("Entre com um valor: ")
		  	leia(num[x])

		  	se(maiorNum<num[x]) {
		  		maiorNum = num[x]
		  	} 
		  }
		  escreva("\nO maior valor digitado foi ",maiorNum)
		  //EXERCÍCIO 1
		  /*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		   * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		   * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		   * e apresente também quantas foram as ocorrências da maior pontuação.*/

		  escreva("\n\nEXERCICIO 2\n\n")
		  
		  inteiro lancamento[10] 
		  real media=0.0, maior=0.0, maiorVezes=0.0
		  
		     para(inteiro i=0 ; i<10 ; i++) {
		  	lancamento[i] = util.sorteia(1,6)
		  	escreva("\n",i+1,"º lançamento: ",lancamento[i])
		  	
		  	media = lancamento[i] + media
		  	se(lancamento[i] > maior) {
		  		maior = lancamento[i]
		  	}
		  
		  }  
		  escreva("\n\nA média dos lançamentos é: ", media/10)
		  escreva("\nO maior valor dos lançamentos é: ",maior)

		  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */