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
					System.out.println("1 - Conta Poupança");
					System.out.println("2 - Conta Corrente");
					System.out.println("3 - Conta Especial");
					System.out.println("4 - Conta Empresa");
					System.out.println("5 - conta Universitaria");
					System.out.print("Digite o numero de sua opção: ");
					tipoConta = t.next().charAt(0);

				}

			} while (cpfConta.isEmpty());

			if (op == '2') {

				switch (tipoConta) {
				case '1': {
					System.out.println("CONTA POUPANÇA");
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = t.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							poupanca.debito(valor);
							System.out.println("Saldo Atual: " + poupanca.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							poupanca.credito(valor);

							System.out.println("Saldo Atual: " + poupanca.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

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
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							corrente.debito(valor);
							System.out.println("Saldo Atual: " + corrente.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							corrente.credito(valor);

							System.out.println("Saldo Atual: " + corrente.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

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
							System.out.println("Digite a opção de transação");
							System.out.println("1 - CRÉDITO / DÉBITO ");
							System.out.println("2 - Saldo ");
							System.out.println("0 - Sair");
							opcao = t.nextInt();
							if (opcao == 1) {
								System.out.println("Saldo: R$ " + especial.getSaldo());
								System.out.println("Valor do Limite: R$ " + especial.getValorLimite11());
								System.out.println("Digite a opção de transação");
								System.out.println("1 - Crédito ");
								System.out.println("2 - Débito ");
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
								"Você realizou todas as possíveis transações em Conta Especial, deseja continuar? (S/N)");
						continuar = t.next().toUpperCase().charAt(0);
					} while (continuar == 'S');

				}
					break;

				case '4': {
					ContaEmpresa empresa = new ContaEmpresa(numeroConta, 5000);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							if (valor > empresa.getSaldo()) {
								System.out.println("DÉBITO MAIOR QUE SEU SALDO");
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
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							empresa.credito(valor);

							System.out.println("Saldo Atual: " + empresa.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

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
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						opcao = t.next().toUpperCase().charAt(0);
						if (opcao == 'D') {
							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							if (valor > universitaria.getSaldo()) {
								System.out.println("DESEJA FAZER UM EMPRESTIMO?");
								double valorEmprestimo = t.nextDouble();
								universitaria.emprestar(valorEmprestimo);
							}
							universitaria.debito(valor);
							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							universitaria.credito(valor);
							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");
						}
					}
					System.out.println("Deseja fazer um impréstimo?");
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