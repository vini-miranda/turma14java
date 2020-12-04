programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	//EXERCÍCIO 1
		/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
		escreva("EXERCÍCIO 1\n\n")
		real preco, desconto, precoFinal, parcela
		caracter formaPagamento 

		escreva("Entre com o preço do produto: ")
		leia(preco)
		escreva("Escolha a forma de pagamento: \n[1]A vista\n[2]Parcelado ")
		leia(formaPagamento)

		se(formaPagamento == '1') {
			escreva("\nEscolha: \n[1]Dinheiro ou cheque\n[2]Cartão de Crédito ")
			leia(formaPagamento)
			se(formaPagamento == '1') {
				desconto = (preco*0.20)
				precoFinal = (preco-desconto)

				escreva("\nPreço a ser pago: ",mat.arredondar(precoFinal,2))
			} 
			senao se(formaPagamento == '2') {
				desconto = (preco*0.15)
				precoFinal = (preco-desconto)

				escreva("\nPreço a ser pago: ",mat.arredondar(precoFinal,2))
			}
			senao {
				escreva("\nDigite um comando válido")
			}
		}
		senao se(formaPagamento == '2') {
			escreva("\nEscolha: \n[1]Parcelar em 2x\n[2]Parcelar em 3x ")
			leia(formaPagamento)
			se(formaPagamento == '1') {
				precoFinal = preco/2
				escreva("\nPreço total a ser pago ",mat.arredondar(preco,2)," em 2 parcelas de ",precoFinal)
			} 
			senao se(formaPagamento == '2') {
				desconto = (preco*0.10)
				precoFinal = (preco+desconto)
				parcela = precoFinal/3
				escreva("\nPreço total a ser pago ",mat.arredondar(precoFinal,2)," em 3 parcelas de ",mat.arredondar(parcela,2))
			}
			senao {
				escreva("\nDigite um comando válido")
			}
		
		}
		senao {
				escreva("\nDigite um comando válido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */