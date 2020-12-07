programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	//EXERCÍCIO 1
		/*Elabore um programa que calcule o que deve ser pago por um produto, 
		* considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
		* Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida 
		* e efetuar o cálculo adequado. 
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
		escreva("EXERCÍCIO 1\n\n")
		real preco, desconto, precoFinal, parcela
		caracter formaPagamento, novaCompra = ' '

		faca {
			escreva("\nEntre com o preço do produto: ")
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
		escreva("\n\nDeseja realizar nova compra?\n[S]sim \n[N]não ")
	    	leia(novaCompra)		
		}
		enquanto(novaCompra == 'S' ou novaCompra == 's')

		//EXERCÍCIO 2
		/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
		* para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
		* A fórmula é IMC = peso / ( altura )2. Elabore um programa que leia o 
		* peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso*/
		escreva("\n\nEXERCÍCIO 2\n\n")

		real peso=0.0, altura=0.0, imc=0.0
		escreva("Entre com o peso(Kgs): ")
		leia(peso)
		escreva("Entre com a altura(Metros): ")
		leia(altura)

		imc = (peso/mat.potencia(altura,2.0))
		
		se(imc<18.5){
			escreva("\nSeu IMC: ",mat.arredondar(imc,2),"\nCondição: Abaixo do peso")
		}
		senao se(imc>=18.5 e imc<25){
			escreva("\nSeu IMC: ",mat.arredondar(imc,2),"\nCondição: Peso Normal")
		}
		senao se(imc>=25 e imc<30){
			escreva("\nSeu IMC: ",mat.arredondar(imc,2),"\nCondição: Acima do peso")
		} senao {
			escreva("\nSeu IMC: ",mat.arredondar(imc,2),"\nCondição: Obesidade")
		}

		//EXERCÍCIO 3
		/*Escrever um programa que leia uma quantidade desconhecida de números e conte 
		 * quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
		 * A entrada de dados deve terminar quando for lido um número negativo.*/

		escreva("\n\nEXERCÍCIO 3\n\n")
		inteiro num, totalizador1=0, totalizador2=0, totalizador3=0, totalizador4=0, totalizador5=0

		faca {
			escreva("Digite um número: ")
			leia(num)
			
			se(num>=0 e num<=25) {
				totalizador1 = (totalizador1 + 1)
				escreva("GRUPO [0-25] = ",totalizador1," membros\n\n")
			}
			senao se(num>=26 e num<=50) {
				totalizador2 = totalizador2 + 1
				escreva("GRUPO [26-50] = ",totalizador2," membros\n\n")
			}
			senao se(num>=51 e num<=75) {
				totalizador3 = totalizador3 + 1
				escreva("GRUPO [50-75] = ",totalizador3," membros\n\n")
			}
			senao se(num>=76 e num<=100) {
				totalizador4 = totalizador4 + 1
				escreva("GRUPO [75-100] = ",totalizador4," membros\n\n")
			} 
			senao se(num>100){
				totalizador5 = totalizador5 + 1
				escreva("GRUPO [100>] = ",totalizador5," membros\n\n")
			}
		}
		enquanto(num>0)
		escreva("\nDigite um número válido!")

		//EXERCÍCIO 4
		/*Faça um programa que calcula e escreve a 
		 * seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50*/
		
		escreva("\n\nEXERCÍCIO 4\n\n")
		inteiro num1=-1
		real res=0.0
		para(inteiro i=1 ; i<=50 ; i++){
			num1 = num1 + 2
			escreva(num1, "/",i," + ")
			res = res + (num1/i)
			
		}
		escreva("\n\nRESULTADO: ", res)

		//EXERCÍCIO 5
		/*Faça um programa que leia um vetor de 5 posições para números reais e, 
		 * depois, um código inteiro. Se o código for zero, finalize o programa; 
		 * se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
		 * Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.*/

		escreva("\n\nEXERCÍCIO 5\n\n")
		real vetor[5], entrada
		caracter opcao = ' '

		para(inteiro i=0 ; i<5 ; i++){
			escreva("\nEntre com o valor da posição ",i+1,": ")
			leia(entrada)
			vetor[i] = entrada
		}
		escreva("\nDigite o modo de exibição:\n[1]Ordem direta\n[2]Ordem inversa\n[0]Finalizar programa ")
		leia(opcao)
		se(opcao == '0') {
			
		}
		senao se(opcao == '1') {
			escreva(vetor[0]," - ",vetor[1]," - ",vetor[2]," - ",vetor[3]," - ",vetor[4])
		}
		senao se(opcao == '2') {
			escreva(vetor[4]," - ",vetor[3]," - ",vetor[2]," - ",vetor[1]," - ",vetor[0])
		}
		senao {
			escreva("\nDigite um comando válido!!")
		}


		//EXERCÍCIO 6
		/*Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
		 * Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.*/

		escreva("\n\nEXERCÍCIO 6\n\n")
		inteiro vet[3], entrada2=0, multiplicacao=0
		inteiro matriz[3][3]

		para(inteiro i=0 ; i<3 ; i++){
			escreva("\nEntre com o valor da posição ",i+1,": ")
			leia(entrada2)
			vet[i] = entrada2
		}

		escreva("\nVALORES MATRIZ\n")
		para(inteiro linha=0 ; linha<3 ; linha++){
			para(inteiro coluna=0 ; coluna<3 ; coluna++) {
				escreva("entre com o valor linha/coluna ",linha,"/",coluna,": ")
				leia(matriz[linha][coluna])
				
			} 
			escreva("\n")
			
		}
		escreva("\n-----CÁLCULO------\n")
		para(inteiro linha=0 ; linha<3 ; linha++){
			para(inteiro coluna=0 ; coluna<3 ; coluna++) {
				matriz[linha][coluna] = vet[coluna]*matriz[linha][coluna]
				escreva(matriz[linha][coluna],"\t")
			}
			escreva("\n")
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4820; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 161, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */