package lista05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc�cio_01 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.00");
		
		double preco, desconto, precoFinal, parcela;
		char formaPagamento, novaCompra = ' ';

		do {
			System.out.println("\nEntre com o pre�o do produto: ");
			preco = t.nextDouble();
			System.out.println("Escolha a forma de pagamento: \n[1]A vista\n[2]Parcelado ");
			formaPagamento = t.next().charAt(0);
			
		if(formaPagamento == '1') {
			System.out.println("\nEscolha: \n[1]Dinheiro ou cheque\n[2]Cart�o de Cr�dito ");
			formaPagamento = t.next().charAt(0);
			if(formaPagamento == '1') {
				desconto = (preco*0.20);
				precoFinal = (preco-desconto);

				System.out.println("\nPre�o a ser pago: R$" + Math.round(precoFinal));
			} 
			else if(formaPagamento == '2') {
				desconto = (preco*0.15);
				precoFinal = (preco-desconto);

				System.out.println("\nPre�o a ser pago: R$" + Math.round(precoFinal));
			}
			else {
				System.out.println("\nDigite um comando v�lido");
			}
		}
		else if(formaPagamento == '2') {
			System.out.println("\nEscolha: \n[1]Parcelar em 2x\n[2]Parcelar em 3x ");
			formaPagamento = t.next().charAt(0);
			if(formaPagamento == '1') {
				precoFinal = preco/2;
				System.out.println("\nPre�o total a ser pago R$"+preco+" em 2 parcelas de R$"+precoFinal);
			} 
			else if(formaPagamento == '2') {
				desconto = (preco*0.10);
				precoFinal = (preco+desconto);
				parcela = precoFinal/3;
				System.out.println("\nPre�o total a ser pago R$"+precoFinal+" em 3 parcelas de R$"+f.format(parcela));
			}
			else {
				System.out.println("\nDigite um comando v�lido");
			}
		
		}
		else {
				System.out.println("\nDigite um comando v�lido");
		}
		System.out.println("\n\nDeseja realizar nova compra?\n[S]sim \n[N]n�o ");
	    	novaCompra = t.next().charAt(0);	
		}
		while(novaCompra == 'S' || novaCompra == 's');

	}

}
