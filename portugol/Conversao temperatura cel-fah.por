programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real tempCelsius
		escreva("Escreva a temperatura em Celsius(C): ")
		leia (tempCelsius)

		escreva ("\n")

		real tempFahrenheit = (tempCelsius * 9/5) + 32
		tempFahrenheit = Matematica.arredondar(tempFahrenheit, 1)
		
		escreva("A temperatura em Fahrenheit é ", tempFahrenheit, " ºF")

		escreva ("\n")
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */