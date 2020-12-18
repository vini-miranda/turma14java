package bancoFinal_POO;

import java.util.Scanner;

public class BancoTeste {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		char op;// visivel em todo o programa - escopo
		char saida;
		int numeroConta = 0;
		final int QTDMOVIMENTO = 2;
		String cpfConta = " ";
		char tipoConta = ' ';
		int opcao;
		char continuar;
		// escopo global

		System.out.println("BANCO G3");

		do {
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = t.next().charAt(0);

			do {
				if (op == '1')
				{
					System.out.println("Digite o seu CPF:");
					cpfConta = t.next();
					System.out.println("ESCOLHA UM TIPO DE CONTA");
					System.out.println("1 - Conta Poupan�a");
					System.out.println("2 - Conta Corrente");
					System.out.println("3 - Conta Especial");
					System.out.println("4 - Conta Empresa");
					System.out.println("5 - conta Universitaria");
					System.out.print("Digite o numero de sua op��o: ");
					tipoConta = t.next().charAt(0);

				}

			} while (cpfConta.isEmpty());

			if (op == '2') {

				switch (tipoConta) {
				case '1': {
					System.out.println("CONTA POUPAN�A");
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = t.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERA��O DESEJA FAZER? R$");
						System.out.println("[D]-D�BITO \\ [C]-CR�DITO ");
						opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO D�BITO");
							double valor = t.nextDouble();
							poupanca.debito(valor);
							System.out.println("Saldo Atual: " + poupanca.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CR�DITO");
							double valor = t.nextDouble();
							poupanca.credito(valor);

							System.out.println("Saldo Atual: " + poupanca.getSaldo());
						} else {
							System.out.println("Insira um comando v�lido!! [D]-D�BITO \\\\ [C]-CR�DITO");

						}

					}
					System.out.println("DIGITE O DIA DE HOJE!");
					int dia = t.nextInt();
					poupanca.comparacaoData(dia);

				}
					break;

				case '2': {
					System.out.println("CONTA CORRENTE");
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERA��O DESEJA FAZER? R$");
						System.out.println("[D]-D�BITO \\ [C]-CR�DITO ");
						opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO D�BITO");
							double valor = t.nextDouble();
							corrente.debito(valor);
							System.out.println("Saldo Atual: " + corrente.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CR�DITO");
							double valor = t.nextDouble();
							corrente.credito(valor);

							System.out.println("Saldo Atual: " + corrente.getSaldo());
						} else {
							System.out.println("Insira um comando v�lido!! [D]-D�BITO \\\\ [C]-CR�DITO");

						}

					}

					corrente.talao(numeroConta);

				}
					break;

				case '3': {
					ContaEspecial especial = new ContaEspecial(3, 1000);
					do {
						for (int transacao = 0; transacao < 10; transacao++) {
							System.out.println("Conta Especial");
							System.out.println("Digite a op��o de transa��o");
							System.out.println("1 - CR�DITO / D�BITO ");
							System.out.println("2 - Saldo ");
							System.out.println("0 - Sair");
							opcao = t.nextInt();
							if (opcao == 1) {
								System.out.println("Saldo: R$ " + especial.getSaldo());
								System.out.println("Valor do Limite: R$ " + especial.getValorLimite11());
								System.out.println("Digite a op��o de transa��o");
								System.out.println("1 - Cr�dito ");
								System.out.println("2 - D�bito ");
								System.out.println("0 - Sair");
								opcao = t.nextInt();
								if (opcao == 1) {
									System.out.println("Digite o valor a ser creditado");
									especial.devolverLimite(t.nextDouble());
									System.out.println("Saldo: R$ " + especial.getSaldo());
									System.out.println("Valor do Limite: R$ " + especial.getValorLimite11());
									
								} else if (opcao == 2) {
									System.out.println("Digite o valor a ser debitado");
									especial.debito(t.nextDouble());
									System.out.println("Saldo: R$ " + especial.getSaldo());
									System.out.println("Valor do Limite: R$ " + especial.getValorLimite11());
									
								} else if (opcao == 0) {
									return;
								}
							} else if (opcao == 2) {
								System.out.println("Saldo: R$ " + especial.getSaldo());
								System.out.println("Valor do Limite: R$ " + especial.getValorLimite11());
							} else if (opcao == 0) {
								System.out.println("Encerrando acesso a conta");
								return;
							}
						}
						System.out.println(
								"Voc� realizou todas as poss�veis transa��es em Conta Especial, deseja continuar? (S/N)");
						continuar = t.next().toUpperCase().charAt(0);
					} while (continuar == 'S');

				}
					break;

				case '4': {
					ContaEmpresa empresa = new ContaEmpresa(numeroConta, 5000);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERA��O DESEJA FAZER? R$");
						System.out.println("[D]-D�BITO \\ [C]-CR�DITO ");
						opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO D�BITO");
							double valor = t.nextDouble();
							if (valor > empresa.getSaldo()) {
								System.out.println("D�BITO MAIOR QUE SEU SALDO");
								System.out.println("NECESSARIO FAZER UM EMPRESTIMO");
								System.out.println("QUAL O VALOR??");
								double valorEmprestimo = t.nextDouble();
								empresa.emprestar(valorEmprestimo);
								empresa.debito(valor);
							} else {
								empresa.debito(valor);
							}

							System.out.println("Saldo Atual: " + empresa.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CR�DITO");
							double valor = t.nextDouble();
							empresa.credito(valor);

							System.out.println("Saldo Atual: " + empresa.getSaldo());
						} else {
							System.out.println("Insira um comando v�lido!! [D]-D�BITO \\\\ [C]-CR�DITO");

						}

					}

					System.out.println("DESEJA FAZER UM EMPRESTIMO?");
					double valorEmprestimo = t.nextDouble();
					empresa.emprestar(valorEmprestimo);

				}
					break;

				case '5': {
					
					System.out.println("WIP");
					/*
					ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta, cpfConta, 5000, 1000);
					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERA��O DESEJA FAZER? R$");
						System.out.println("[D]-D�BITO \\ [C]-CR�DITO ");
						opcao = t.next().toUpperCase().charAt(0);
						if (opcao == 'D') {
							System.out.println("INSIRA O VALOR DO D�BITO");
							double valor = t.nextDouble();
							if (valor > universitaria.getSaldo()) {
								System.out.println("DESEJA FAZER UM EMPRESTIMO?");
								double valorEmprestimo = t.nextDouble();
								universitaria.emprestar(valorEmprestimo);
							}
							universitaria.debito(valor);
							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CR�DITO");
							double valor = t.nextDouble();
							universitaria.credito(valor);
							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else {
							System.out.println("Insira um comando v�lido!! [D]-D�BITO \\\\ [C]-CR�DITO");
						}
					}
					System.out.println("Deseja fazer um impr�stimo?");
					double valorEmprestimo = t.nextDouble();
					universitaria.emprestar(valorEmprestimo);
					*/
				}
					break;
				}

			} else if (op == '2') {
				System.out.println("wip");
			} else {

			}
			System.out.println("Continua S/N");
			saida = t.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				System.out.println("PROGRAMA FINALIZADO..");
				break;
			}

		} while (true);

	}
	
	static void linha(int tam) {
		for (int i = 0; i < tam; i++) {
			System.out.print("-");
		}
	}
}