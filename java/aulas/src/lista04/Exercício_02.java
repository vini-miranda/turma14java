package lista04;

import java.util.Random;

public class Exercício_02 {
	public static void main(String[] args) {
		  
		Random aleatorio = new Random();
		  int lancamento[] = new int[10];
		  int maisVezes=0, maior=0;
		  double media=0.0;
		  
		     for(int i=0 ; i<10 ; i++) {
		  	lancamento[i] = aleatorio.nextInt(6)+1;
		  	System.out.println("\n" + (i+1) + "º lançamento: " + lancamento[i]);
		  	
		  		media = lancamento[i] + media;
		  		if(lancamento[i] > maior) {
		  		maior = lancamento[i];
		  	}
		  	}
		  	for(int i=0 ; i<10 ; i++)
		  	{
		  		if(maior == lancamento[i]) {
		  		maisVezes = maisVezes + 1;
		  	}
		  
		  }  
		  System.out.println("\n\nA média dos lançamentos é: " + media/10);
		  System.out.println("\nO maior valor dos lançamentos é: "+maior+" e foi repetido "+maisVezes+" vez(es)");

	}

}
