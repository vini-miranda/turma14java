programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		//CALCULO ÁREA CIRCULO
		const real pi = 3.14
		real raio = 0.0, areaCirculo = 0.0
		escreva("Entre com o raio do círculo: ")
		leia(raio)

		raio = mat.potencia(raio,2.0)
		areaCirculo = pi*raio
		se(raio<0 ou raio == 0) {
			escreva("\nInsira um número válido(positivo e diferente de zero)")
		} senao { escreva("\nA área do círculo é ", areaCirculo)

		}


		//CALCULO ÁREA TRIANGULO
		escreva("\n\n")
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
		escreva("\n\n")

		//CALCULO ÁREA RETÂNGULO
		real b, h
		escreva("Entre com a base do retângulo: ")
		leia(b)
		escreva("Entre com a altura do retângulo: ")
		leia(h)

		se(b<0) {
			escreva("\nInsira um número válido(positivo)")
		} senao se(h<0) {
			escreva("\nInsira um número válido(positivo)")
		} senao {
		escreva("\nA área do retângulo é ", b*h)}

		escreva("\n\n")
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 971; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */