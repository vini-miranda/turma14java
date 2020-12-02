programa
{
	
	funcao inicio()
	{	caracter cor, pal, san, sao
		inteiro somaCor=0, somaPal=0, somaSan=0, somaSao=0

		para(inteiro rodadas=1; rodadas <=4; rodadas++) {

			escreva("\nDigite se CORINTHIANS ganhou[G], empatou[E] ou perdeu[P] na rodada ",rodadas,": ") 
			leia(cor)
			escreva("\nDigite se PALMEIRAS ganhou[G], empatou[E] ou perdeu[P] na rodada ",rodadas,": ") 
			leia(pal)
			escreva("\nDigite se SANTOS ganhou[G], empatou[E] ou perdeu[P] na rodada ",rodadas,": ") 
			leia(san)
			escreva("\nDigite se SÃO PAULO ganhou[G], empatou[E] ou perdeu[P] na rodada ",rodadas,": ") 
			leia(sao)
			
				se(cor == 'G' ou cor == 'g') {
				somaCor = somaCor + 3
			}	senao se(cor == 'E' ou cor == 'e') {
				somaCor = somaCor + 1
			}	senao se(cor == 'P' ou cor == 'p'){
				somaCor = somaCor + 0
			}	senao {
				escreva("\ninsira um caracter válido\n")
			}	

					se(pal == 'G' ou pal == 'g') {
				somaPal = somaPal + 3
			}	senao se(pal == 'E' ou pal == 'e') {
				somaPal = somaPal + 1
			}	senao se(pal == 'P' ou pal == 'p'){
				somaPal = somaPal + 0
			}	senao {
				escreva("\ninsira um caracter válido\n")
			}

				se(san == 'G' ou san == 'g') {
				somaSan = somaSan + 3
			}	senao se(san == 'E' ou san == 'e') {
				somaSan = somaSan + 1
			}	senao se(san == 'P' ou san == 'p'){
				somaSan = somaSan + 0
			}	senao {
				escreva("\ninsira um caracter válido\n")
			}

				se(sao == 'G' ou sao == 'g') {
				somaSao = somaSao + 3
			}	senao se(sao == 'E' ou sao == 'e') {
				somaSao = somaSao + 1
			}	senao se(sao == 'P' ou sao == 'p'){
				somaSao = somaSao + 0
			}	senao {
				escreva("\ninsira um caracter válido\n")
			}
			
			
		}

			escreva(somaCor)
			escreva(somaPal)
			escreva(somaSan)
			escreva(somaSao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */