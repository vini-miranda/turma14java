programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter genero
		cadeia disciplinas[4] = {"PORTUGUÊS","MATEMÁTICA","CIÊNCIAS","ARTES"}
		inteiro nota[10]

		para(inteiro boletim=0 ; boletim<4 ; boletim++) {
			escreva("\nDigite a nota da matéria ",disciplinas[boletim],": ")
			leia(nota[boletim])

			escreva(disciplinas[boletim]," - ",nota[boletim]) 
		
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */