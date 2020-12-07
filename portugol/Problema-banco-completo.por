programa
{
    funcao inicio()
    {   cadeia clientes[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira"," Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"}
    	   cadeia cliente = " "
    	   caracter sexos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
        cadeia numeroConta[39]
        cadeia numConta
        real saldo=0.00, valor=0.0, saqueEspecial = 0.00
        cadeia CPF
	   inteiro DATA = 0
	   caracter opcao, dia, opcaoCredito
	   cadeia movimento[] = {"","","","","","","","","",""}
	   inteiro talao[10]
	   inteiro qtdTalao = 10, limiteCredito = 1000, limiteEmprestimo = 5000, valorEmprestimo= 0
		
	 
        //nome, conta, cpf, saldo
	   para(inteiro i = 0; i<39; i++){
			se(i<9){
				numeroConta[i] = "G3-00" + (i+1))
			}senao{
				numeroConta[i] = "G3-0" + (i+1))
			}
		}
	 
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá! Bem vindo ao Banco Grupo 3\n")
	    escreva("Entre com o número da conta: ")
	    leia(numConta)
	    escreva("Entre com o número o CPF: ")
	    leia(CPF)
	    	 	
         para(inteiro i = 0; i<39; i++)
         {
             se(numeroConta[i] == numConta)
             {
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
	    escreva("\n CONTA POUPANÇA ABERTA - VAMOS COMEÇAR\n")
	    faca
	    {
	    	para(inteiro i=0 ; i<10 ; i++)
	    	{
	    		
	    		escreva("\n",cliente," deseja fazer um [1]saque ou um [2]depósito? ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Informe o valor do saque: ")
	    			leia(valor)
					se(saldo>valor) {
						saldo = saldo-valor
						escreva("Operação realizada com sucesso\nSALDO ATUAL: ",saldo)
						movimento[i] = "-R$" + valor
											
					} senao {
						escreva("Saldo insuficiente para saque.\nSALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2') {
				escreva("Informe o valor do depósito: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Informe um número válido")
				}
				senao {
					saldo = saldo+valor	
					escreva("Operação realizada com sucesso.\nSALDO ATUAL: ",saldo)
					movimento[i] = "+R$" + valor
					
				}
	    		}
	    		senao {
	    		escreva("\nInforme um número válido")
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
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ",cliente, "\n")
	    escreva("NÚMERO DA CONTA: ",numConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("=================================\n")
	  
	   }
	   senao se(opcao == '2'){
	   	faca
	    {
	    	escreva("\n CONTA CORRENTE ABERTA - VAMOS COMEÇAR\n")
	    	para(inteiro i=0 ; i<10 ; i++)
	    	{
	    		
	    		escreva("\n",cliente," deseja fazer um [1]-Saque  [2]-Depósito  [3]-Solicitar talão? ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Informe o valor do saque: ")
	    			leia(valor)
					se(saldo>=valor e valor>0) {
						
						saldo = saldo-valor
						escreva("Operação realizada com sucesso\n SALDO ATUAL: ",saldo)
						movimento[i] = "-R$" + valor
						
											
					} senao {
						escreva("Saldo insuficiente para saque.\n SALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2') {
				escreva("Informe o valor do depósito: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Informe um número válido")
				}
				senao {
					saldo = saldo+valor	
					escreva("Operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					movimento[i] = "+R$" + valor
					
				}
	    		}
	    		se(opcao == '3') {
				escreva("Talão de cheques concebido ")
	    			
	    			movimento[i] = "Talão Nº" + talao[i]
	    			qtdTalao++
	    			
	    		}
	    		
	    	  }
	    	
	    	  escreva("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ")
	    	  leia(dia)	
	    	
	    }
	    enquanto(dia == 'S' ou dia == 's')
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ",cliente, "\n")
	    escreva("NÚMERO DA CONTA: ",numConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("QTD DE TALÕES RETIRADOS: ", qtdTalao, "\n")
	    escreva("=================================\n")
	   }
	   senao se(opcao == '3')
	   {
	   	escreva("\n CONTA EMPRESA ABERTA - VAMOS COMEÇAR\n")
		para(inteiro i=0 ; i<10 ; i++)
		{
	    		escreva("\n",cliente,": Deseja fazer um [1]saque um [2]depósito ou um [3]emprestimo ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Informe o valor do saque: ")
	    			leia(valor)
					se(saldo>=valor) {
						saldo =-valor
						escreva("operação realizada com sucesso\n SALDO ATUAL: ",saldo)
											
					} senao {
						escreva("Saldo insuficiente para saque.\n SALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2') {
				escreva("Informe o valor do depósito: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Informe um número válido")
				}
				senao {
					saldo = saldo+valor	
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					
				}
	    		}
	
	    	 	se(opcao == '3') {
				escreva("Informe o valor do emprestimo: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Informe um número válido")
				}
				senao {
					limiteEmprestimo -= valor
					saldo += valor
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo, " seu limite emprestimo é: ", limiteEmprestimo)
	    			}
	  		}
	  	}
	    	  escreva("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ")
	    	  leia(dia)
			
		
	    	
	    }
	   senao se(opcao == '4')
	   {
		escreva("\n CONTA UNIVERSITÁRIA ABERTA - VAMOS COMEÇAR\n")
	   	 faca
	    {
	    	para(inteiro i=0 ; i<10 ; i++)
	    	{
	    		escreva("\n",cliente,"deseja fazer um [1]saque ou um [2]depósito? ou [3] emprestimo ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Entre com o valor do saque: ")
	    			leia(valor)
					se(saldo>=valor) {
						saldo = saldo-valor
						escreva("operação realizada com sucesso\n SALDO ATUAL: ",saldo)
											
					} senao {
						escreva("Saldo insuficiente para saque.\n SALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2')
	    		{
				escreva("Entre com o valor do depósito: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Digite um número válido")
				}
				senao
				{
					saldo = saldo+valor	
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					
				}
	    		}
	    		se(opcao == '3')
	    		{
				escreva("Entre com o valor do emprestimo: ")
	    			leia(valorEmprestimo)
				se(valorEmprestimo>0) {
				
					se (valorEmprestimo > limiteEmprestimo)
					{
						escreva("digite um valor entre R$ 1,00 e R$ 5000,00")
					}
					senao
					{
					   saldo = saldo+valorEmprestimo
					   escreva(" Operação realizada com sucesso, seu novo saldo é:", saldo)
					  
					}
				
	    		}senao{
	    			escreva("Digite um valor válido")
	    		}
	    		
	    	  }
	    	 
	    	}
	    	
	    	  escreva("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ")
	    	  leia(dia)
	    }
	    enquanto(dia == 'S' ou dia == 's')
	    escreva("\nSaldo atual: ",saldo)
		
	  
	    }
	  
	   senao se(opcao == '5')
	   {
	   	escreva("\n CONTA ESPECIAL ABERTA - VAMOS COMEÇAR\n")
		para(inteiro i=0 ; i<10 ; i++)
		
	    	{
	    		escreva("\n",cliente, ":O que você deseja fazer ? [1]saque ou [2]depósito? ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Informe o valor que deseja sacar: R$ ")
	    			leia(valor)
					se(saldo>=valor)
					{
						saldo = saldo-valor
						escreva("Operação realizada com sucesso\n SALDO ATUAL: ",saldo)
					}
					
				
					senao
					{
					escreva("\n",cliente, ":O que você deseja fazer ? [1]saque ou [2]depósito? ")
					leia(opcaoCredito)
						se (opcaoCredito == '1')
						{
						escreva("Quanto deseja usar do Crédito especial ? R$ ")
	    				leia(saqueEspecial)
	    				saldo += (saqueEspecial-valor)
	    				limiteCredito -= saqueEspecial
	    				escreva("\nSALDO ATUAL: R$ ",saldo)
	    				escreva("\n")
	    				escreva("LIMITE DE CRÉDITO ESPECIAL: ",limiteCredito)	
						}
						senao
									{
				    escreva("======== Banco Grupo 3 ==========\n")
				    escreva("Olá ", cliente, "\n")
				    escreva("NÚMERO DA CONTA: ", numConta, "\n")
				    escreva("CPF: ", CPF, "\n")
				    escreva("SALDO: ", saldo, "\n")
				    escreva("lIMITE DE CREDITO: R$ ",limiteCredito,"\n")
				    escreva("=================================\n")
						}
				
					}
	    			}
	    			se(opcao == '2')
	    			{
				escreva("Informe o valor do depósito: ")
	    			leia(valor)
				se(valor<0)
				{
				escreva("Informe um número válido")
				}
				senao
					{
					saldo = saldo+valor	
					escreva("Operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					
					}
	    			}
	    	  }
	   	  escreva("\nDeseja ir para o próximo dia?\n[1]sim \n[2]não ")
	    	  leia(dia)
	   
	   }
	   senao
	   {
	   	escreva("Informe uma opção válida")
	   }
    }
}






/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10922; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */