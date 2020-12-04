programa
{

    funcao inicio()
    {   cadeia clientes[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira"," Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"}
    	   cadeia cliente = " "
    	   caracter sexos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
        cadeia numeroConta[39]
        cadeia numConta
        real saldo=0.00, valor=0.0
        cadeia CPF
        cadeia movimentacoes[10]
	   inteiro DATA = 0
	   caracter opcao, dia
	    
        
        //nome, conta, cpf, saldo 
	   para(inteiro i = 0; i<39; i++){
			se(i<9){
				numeroConta[i] = "G3-000" + (i+1))
			}senao{
				numeroConta[i] = "G3-00" + (i+1))
			}
		}

	    
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá! Bem vindo ao Banco Grupo 3\n")
	    escreva("Entre com o número da conta: ")
	    leia(numConta)
	    escreva("Entre com o número o CPF: ")
	    leia(CPF)

	    	 	
         para(inteiro i = 0; i<39; i++) {
             se(numeroConta[i] == numConta) {
             	 cliente = clientes[i]	
             }
         }
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ",cliente, "\n")
	    escreva("NÚMERO DA CONTA: ",numConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("=================================\n")

	    
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Escolha o tipo de conta que deseja abrir: \n[1]Conta Poupança\n[2]Conta Corrente\n[3]Conta Empresa\n[4]Conta Universitária\n[5]Conta Especial\n")
	    escreva("=================================\n")

	    leia(opcao)
	    
	    se(opcao == '1') {

	    escreva("\nCONTA POUPANÇA\n")
	    faca 
	    {
	    	para(inteiro i=0 ; i<10 ; i++)
	    	{
	    		escreva("\n",cliente," deseja fazer um [1]saque ou um [2]depósito? ")
	    		leia(opcao)
	    		se(opcao == '1') {

	    			escreva("Entre com o valor do saque: ")
	    			leia(valor)

					se(saldo>valor) {
						saldo = saldo-valor
						escreva("operação realizada com sucesso\nSALDO ATUAL: ",saldo)
											
					} senao {
						escreva("Saldo insuficiente para saque.\nSALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2') {

				escreva("Entre com o valor do depósito: ")
	    			leia(valor)

				se(valor<0) {
					escreva("Digite um número válido")
				}
				senao {
					saldo = saldo+valor	
					escreva("operação realizada com sucesso.\nSALDO ATUAL: ",saldo)
					
				}
	    		}
	    		senao {
	    		escreva("\nDigite um número válido")
	    		}
	    	  }
	    	  escreva("\nEntre com a data de hoje em formato dd: ")
	    	  leia(DATA)
	    	  se(DATA == 23) {
	    	  	escreva("\nHoje é seu aniversário de conta e seu saldo recebeu um acrescimo!")
	    	  	saldo = saldo*1.005
	    	  	escreva(saldo)
	    	  }
	    	  escreva("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ")
	    	  leia(dia)
	    }
	     
	    enquanto(dia == 'S' ou dia == 's')
	    escreva("\nSaldo atual: ",saldo)
	   }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2716; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */