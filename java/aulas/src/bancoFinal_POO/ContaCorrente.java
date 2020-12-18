package bancoFinal_POO;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	private int talao = 3;
	private int qtdTalao;
	private int totalTalao;

	
	public ContaCorrente() {

	}

	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}

	public ContaCorrente(int numeroConta, String CPF) {
		super(numeroConta, CPF);
	}
	
	
	public int getQtdTalao() {
		return qtdTalao;
	}
	
	public int getTotalTalao() {
		return totalTalao;
	}

	public void setTotalTalao(int totalTalao) {
		this.totalTalao = totalTalao;
	}

	

	public void talao(int numConta) {
		char opcao;
		do {
			Scanner t = new Scanner(System.in);
			System.out.println("Você deseja imprimir talão? S/N ");
			opcao = t.next().toUpperCase().charAt(0);
			while (opcao != 'S' && opcao != 'N') {
				System.out.println("\nOpção inválida. Deseja continuar? S/N");
				opcao = t.next().toUpperCase().charAt(0);
			}

			if (opcao == 'S') {
				System.out.println("Digite a quantidade que deseja: (Até 3 talões por dia)");
				qtdTalao = t.nextInt();
				while (qtdTalao < 0 || qtdTalao > 3) {
					System.out.printf("\nQuantidade inválida. Você pode resgatar até %d talões\nDigite a quantidade:", talao);
					qtdTalao = t.nextInt();
				}

				while (qtdTalao > talao) {
					System.out.printf("Erro! Quantidade disponível: %d. Digite a quantidade:", talao);
					qtdTalao = t.nextInt();
				}

				talao = talao - qtdTalao;
				totalTalao = totalTalao + qtdTalao;
				if (talao == 0) {
					talao = 3;
				}
				this.totalTalao = totalTalao;
				System.out.printf("Quantidade diária impressa: %d\n", qtdTalao);
				System.out.printf("Quantidade total impressa: %d\n", totalTalao);
				System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
				opcao = t.next().toUpperCase().charAt(0);
			}

		} while (opcao == 'S');

	}

	

}