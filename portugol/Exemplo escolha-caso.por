programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		caracter num 
		escreva("digite '1' para círculo \n")
		escreva("digite '2' para triângulo \n")
		escreva("digite '3' para retângulo \n")
		escreva("\n")
		leia(num)

		escolha(num) {
			caso '1':

					const real pi = 3.14
				real raio = 0.0, areaCirculo = 0.0
				escreva("Entre com o raio do círculo: ")
				leia(raio)
		
				raio = mat.potencia(raio,2.0)
				areaCirculo = pi*raio
				se(raio<0 ou raio == 0) {
					escreva("\nInsira um número válido(positivo e diferente de zero)")
				} senao { escreva("\nA área do círculo é ", areaCirculo)
		
				} pare

			caso '2':
		
					escreva("\n\n")
				real baseTriangulo, alturaTriangulo, areaTriangulo
				escreva("Entre com a base do triângulo: ")
				leia(baseTriangulo)
				escreva("Entre com a altura do triângulo: ")
				leia(alturaTriangulo)
				areaTriangulo = ((baseTriangulo*alturaTriangulo)/2)
				
				se(baseTriangulo<0 ou baseTriangulo == 0) {
					escreva("\nInsira um número válido(positivo e diferente de zero)")
				} senao se(alturaTriangulo<0 ou alturaTriangulo == 0) {
					escreva("\nInsira um número válido(positivo e diferente de zero)")
				} senao {
					escreva("\nA área do triângulo é: ", mat.arredondar(areaTriangulo,2))
				}
				escreva("\n\n")
				pare

			caso '3':
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
				pare
	
				caso contrario:
					escreva("digite um número válido!")
			
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */