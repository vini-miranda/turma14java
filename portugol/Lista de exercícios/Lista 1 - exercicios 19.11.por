programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//EXERCICIO 1
		escreva("EXERCICIO 1\n\n")
		inteiro anos, meses, dias
		escreva("Que ano você nasceu? ")
		leia(anos)
		escreva("Que mês(em numero) você nasceu? ")
		leia(meses)
		escreva("Que dia você nasceu? ")
		leia(dias)

		inteiro idadeAnos = 2020-anos
		inteiro idadeMeses = 12-meses
		inteiro idadeDias = 30-dias
		inteiro diasVividos = (idadeAnos*365) + (idadeMeses*30) + dias
		escreva("Você tem ", idadeAnos, " anos e já viveu ", diasVividos, " dias.\n\n")

		//EXERCICIO 2
		escreva("EXERCICIO 2\n\n")
		escreva("Quantos dias você já viveu? ")
		leia(dias)
		inteiro anosDistribuidos = (dias/365)
		inteiro mesesDistribuidos = (dias%365)/30
		inteiro diasDistribuidos = (dias%365)%30
		escreva("Você já viveu ", Matematica.arredondar(anosDistribuidos,0), " anos\n", 
		Matematica.arredondar(mesesDistribuidos,0), " meses e \n", diasDistribuidos, " dias.\n\n")

		//EXERCICIO 3
		escreva("EXERCICIO 3\n\n")
		inteiro seg
		escreva("Tempo de duração de funcionamento da fábrica em segundos: ")
		leia(seg)
		inteiro horas = seg/3600
		inteiro minutos = (seg%3600)/60
		inteiro segundos = (seg%3600)%60

		escreva("A fábrica funcionou ", horas," horas, \n", minutos, " minutos e \n",segundos," segundos.\n\n") 
		
		//EXERCICIO 4
		escreva("EXERCICIO 4\n\n")
		inteiro a, b, c
		escreva("primeiro número: ")
		leia(a)
		escreva("segundo número: ")
		leia(b)
		escreva("terceiro número: ")
		leia(c)
		inteiro r = (a+b)*2
		inteiro s = (b+c)*2
		inteiro d = (r+s)/2
		escreva("\n")
		escreva("O resultado é ", d)

		//EXERCÍCIO 5
		escreva("\n\nEXERCICIO 5\n\n")
		real nota1, nota2, nota3
		escreva("Primeira nota: ")
		leia(nota1)
		escreva("Segunda nota: ")
		leia(nota2)
		escreva("Terceira nota: ")
		leia(nota3)

		escreva("\n")

		real media = (((nota1*2)+(nota2*3))+(nota3*5)) / 10
		escreva("Sua média final é: ", media)

		//EXERCÍCIO 6
		escreva("\n\nEXERCICIO 6\n\n")
		real x1=0.0, x2=0.0, y1=0.0, y2=0.0, dist=0.0, p1=0.0, p2=0.0

		escreva("Valor de  X1:")
		leia(x1)
		escreva("Valor de  X2:")
		leia(x2)
		escreva("Valor de  Y1:")
		leia(y1)
		escreva("Valor de  Y2:")
		leia(y2)

		p1 = (Matematica.potencia((x2-x1),2))
		p2 = (Matematica.potencia((y2-y1),2))
		dist = (Matematica.arredondar ((Matematica.raiz((p1 + p2),2)),2))
		escreva("Valor de distância é ", dist)

		//EXERCÍCIO 7
		escreva("\n\nEXERCICIO 7\n\n")
		real A,B,C,D,E,F,X,Y
		escreva("insira o valor de A: ")
		leia(A)
		escreva("insira o valor de B: ")
		leia(B)
		escreva("insira o valor de C: ")
		leia(C)
		escreva("insira o valor de D: ")
		leia(D)
		escreva("insira o valor de E: ")
		leia(E)
		escreva("insira o valor de F: ")
		leia(F)

		X = (((C*E) - (B*F)) / ((A*E) - (B*D)))
		Y = (((A*F) - (C*D)) / ((A*E) - (B*D)))
		escreva("\n")
		escreva("o valor de X é ", Matematica.arredondar(X,2), " e o valor de Y é ", Matematica.arredondar(Y,2))

		//EXERCÍCIO 8
		escreva("\n\nEXERCICIO 8\n\n")
		real custoFabrica
		escreva("Insira o custo de fábrica do veículo: ")
		leia(custoFabrica)

		real custoConsumidor = ((custoFabrica * 0.28) + (custoFabrica* 0.45)) + custoFabrica
		escreva("O valor do fina do consumidor é: ", Matematica.arredondar(custoConsumidor,2))
		escreva("\n")
		                                       

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */