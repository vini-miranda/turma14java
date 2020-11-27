programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real tempFahrenheit
		escreva("Escreva sua temperatura em Fahrenheit(F): ")
		leia(tempFahrenheit)

		real resultado = (tempFahrenheit - 32) * 5/9
		resultado = Matematica.arredondar(resultado, 1)
		escreva("\n")
		escreva("sua temperatura em Celsius(C) é ", resultado, " ºC")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */