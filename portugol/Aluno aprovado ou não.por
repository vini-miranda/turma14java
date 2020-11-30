programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro nota=0
		escreva("Qual o nome do aluno(a): ")
		leia(nome)
		escreva("Entre com a nota do aluno(a): ")
		leia(nota)

		se(nota <= 5) {
			escreva("\nOlá, ",nome," sua nota foi ",nota," e infelizmente você foi reprovado(a)(de).\n")
		} senao se (nota > 5 e nota < 11){
			escreva("\nParabéns ",nome," sua nota foi ",nota," e você foi aprovado(a)(de)!!!\n")
		} senao {
			escreva("\nDigite uma nota válida.\n")
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */