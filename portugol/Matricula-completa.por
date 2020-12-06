programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		//G( n grupo - n matricula )
		cadeia alunos [] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira"," Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"}
		caracter sexos [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		cadeia matricula [39]
		real notas [39] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}
		cadeia ALUNO
		caracter tipo = 'S'
		real notaBase = 0.0
		inteiro notaAluno = 0
		inteiro escolher = 0
		inteiro escolherLista
		
		para(inteiro i = 0; i<39; i++){
			se(i<9){
				matricula[i] = "G3-0" + (i+1))
			}senao{
				matricula[i] = "G3-" + (i+1))
			}
			
			notas[i] = u.sorteia(1, 10)
			
		}
		faca{
		
		escreva("----------Grupo 3 ------------\n")
		escreva("[1] - Lista Homens\n")
		escreva("[2] - Lista Mulheres\n")
		escreva("[3] - Aprovados/Aprovadas\n")
		escreva("[4] - Reprovados/Reprovadas\n")
		escreva("[5] - Notas Acima/Abaixo\n")
		
		escreva("------------------------------")
		
		
		//Criando Matrícula
		escreva("\n" )
		leia (escolher)
		se(escolher == 1){
			para(inteiro i = 0; i<39; i++){
			se(sexos[i] == 'M' e notas[i] > 5){
				escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Aprovado\n")
			}
			senao se(sexos[i] == 'M' e notas[i] < 5){
				escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Reprovado\n")
			}
			
		}
		}
		senao se(escolher == 2){
			para(inteiro i = 0; i<39;i++){
				se(sexos[i] == 'F' e notas[i] > 5){
						escreva("Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Aprovada\n")
					
				}
				senao se(sexos[i] == 'F' e notas[i] < 5){
						escreva("Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Reprovada\n")
					
				}
			}
		}
		senao se(escolher == 3){
			para(inteiro i=0 ; i<39 ; i++){
		 	se(notas[i] > 5 e sexos[i] == 'M') {
		 	escreva("\n","Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - APROVADO")
		 	}
		 	senao se(notas[i] > 5 e sexos[i] == 'F') {
		 	escreva("\n","Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ",  notas[i], " - APROVADA")
		 	}
		 }
		}
		senao se(escolher == 4){
			para(inteiro i = 0; i<39; i++)
		{
			
			se(sexos[i] == 'M' e notas[i] <= 5)
			{
			escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - Reprovado\n")	
			}
			senao se (sexos[i] == 'F' e notas[i] <= 5)
			escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - Reprovada\n")
		}
	
		}
		senao se(escolher == 5){
			escreva("\nDeseja ver lista a partir de que nota?\n")
			leia(notaBase)
			escreva("[1]- Acima da nota digitada\n")
			escreva("[2]- Abaixo da nota digitada\n")
			leia(notaAluno)
		
			
			se(notaAluno == 1){
				para(inteiro i=0; i<39; i++){
					se(notas[i] >= notaBase e sexos[i]=='M'){
						escreva("\nNome Aluno: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i])
					}
					se(notas[i] > notaBase e sexos[i]=='F'){
						escreva("\nNome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i])
					}
				
				}
			
			}senao se(notaAluno == 2){
				para(inteiro i=0; i<39; i++){
					se(notas[i] <= notaBase e sexos[i]=='M'){
						escreva("\nNome Aluno: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i])
					}
					senao se(notas[i] < notaBase e sexos[i]=='F'){
						escreva("\nNome Aluno: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i])
			}
			
			}
			
			}
	
		}
		
		escreva("\nDeseja fazer uma nova operação? [S] - Sim [N] - Não :")
		leia(tipo)
		limpa()
		}enquanto(tipo == 'S' ou tipo == 's')
		
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */