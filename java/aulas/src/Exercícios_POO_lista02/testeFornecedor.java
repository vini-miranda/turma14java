package Exercícios_POO_lista02;

public class testeFornecedor {

	public static void main(String[] args) {
		Fornecedor forn1 = new Fornecedor(3.000,10.000);
		
		System.out.printf("VALOR DA DIVIDA: %.3f\n", forn1.valorDivida);
		System.out.printf("VALOR DO CREDITO: %.3f\n", forn1.valorCredito);
		System.out.printf("VALOR DO SALDO: %.3f",forn1.valorSaldo());

	}

}
