programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia disciplinas[4] = {"Português","Matemática","Ciências","Artes"}
		inteiro notas[4]
		cadeia nomeAluno
		cadeia opcao= "x"
		cadeia genero
		cadeia status[4]
		escreva("\nDigite o nome: ")
		leia(nomeAluno)
		escreva("\nVocê se identifica como M (Masculino) ou F (Feminino)? ")
		leia(genero)
		genero = Texto.caixa_alta(genero)
		se(genero ==  "M"){
			opcao = "o"
		}
		senao se(genero ==  "F"){
			opcao = "a"
		}
		para(inteiro i = 0; i < 4; i++){
			escreva("\nDigite a nota na disciplina de ",disciplinas[i],": ")
			leia(notas[i])
			se(notas[i] <= 5){
				status[i] = "reprovad"
			}
			senao{
				status[i] = "aprovad"
			}
		}
		limpa()
		para(inteiro i = 0; i < 4; i++){
			escreva("\n",Texto.caixa_alta(opcao)," alun",opcao," foi ",status[i],opcao," em ",disciplinas[i]," com nota ",notas[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 878; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */