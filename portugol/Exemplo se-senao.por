programa
{
        funcao inicio()
        {
					  
			inteiro num, par

			escreva ("Digite um número: ")
			leia (num)

			par = num % 2

			se (num < 0 ) {
				escreva("Esse numero é inválido.")
			} senao { 

			se (par == 0) {
				escreva("Esse numero é par.")
			} senao {
				escreva("Esse numero é ímpar.")
			}
			
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */