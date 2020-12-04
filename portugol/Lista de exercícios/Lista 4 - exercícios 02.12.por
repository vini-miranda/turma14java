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
		  //EXERCÍCIO 2
		  /*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		   * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		   * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		   * e apresente também quantas foram as ocorrências da maior pontuação.*/

		  escreva("\n\nEXERCICIO 2\n\n")
		  
		  inteiro lancamento[10], maisVezes=0, maior=0
		  real media=0.0
		  
		     para(inteiro i=0 ; i<10 ; i++) {
		  	lancamento[i] = util.sorteia(1,6)
		  	escreva("\n",i+1,"º lançamento: ",lancamento[i])
		  	
		  		media = lancamento[i] + media
		  		se(lancamento[i] > maior) {
		  		maior = lancamento[i]
		  	}
		  	}
		  	para(inteiro i=0 ; i<10 ; i++)
		  	{
		  		se(maior == lancamento[i]) {
		  		maisVezes = maisVezes + 1
		  	}
		  
		  }  
		  escreva("\n\nA média dos lançamentos é: ", media/10)
		  escreva("\nO maior valor dos lançamentos é: ",maior," e foi repetido ",maisVezes," vez(es)")
		  
		//EXERCICIO 3
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
		 * mesma posição das matrizes N1 e N2;
		   b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
		   de mesma posição das matrizes N1 e N2.*/
		escreva("\n\nEXERCICIO 3\n\n")
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		
		escreva("MATRIZ N1\n")
		para (inteiro linha=0;linha<4; linha++)
		{
			para (inteiro coluna=0; coluna<6; coluna++)
			{N1[linha][coluna]=Util.sorteia(0, 4)
				escreva(N1[linha][coluna],"\t")
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("MATRIZ N2\n")
		para (inteiro linha=0;linha<4; linha++)
		{
			para (inteiro coluna=0; coluna<6; coluna++)
			{
				N2[linha][coluna]=Util.sorteia(1, 2)
				escreva(N2[linha][coluna],"\t")
		     }
			escreva("\n")
		}
		escreva("\n")
		escreva("MATRIZ M1\n")
		para (inteiro linha=0;linha<4; linha++)
		{
			para (inteiro coluna=0; coluna<6; coluna++)
			{
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna],"\t")
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("MATRIZ M2\n")
		para (inteiro linha=0;linha<4; linha++)
		{
			para (inteiro coluna=0; coluna<6; coluna++)
			{
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
				escreva(M2[linha][coluna],"\t")
			}
			escreva("\n")
		}
		 
		//EXERCICIO 4
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		 * ou seja, diagonal principal.*/
		escreva("\nEXERCICIO 4\n\n")
		inteiro mat[3][3], valor, somaDiagonal=0, somaTotal=0

		para(inteiro linha=0 ; linha<3 ; linha++) {
			para(inteiro coluna=0 ; coluna<3 ; coluna++) {
				
				escreva("entre com o valor linha/coluna ",linha,"/",coluna,": ")
				leia(mat[linha][coluna])
				se(linha == coluna) {
					somaDiagonal = mat[linha][coluna] + somaDiagonal
					}
					somaTotal = mat[linha][coluna] + somaTotal

			} escreva("\n")
		}
		para(inteiro linha=0 ; linha<3 ; linha++) {
			para(inteiro coluna=0 ; coluna<3 ; coluna++){
				
				escreva(mat[linha][coluna],"\t")
				
			} escreva("\n")
		}
		escreva("\nA soma da diagonal principal é ",somaDiagonal)
		escreva("\nA soma total dos valores é ",somaTotal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3862; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 59, 30, 2}-{mat, 109, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */