package lista04;

import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		int num[] = new int[5];
		 int  x, maiorNum=0;
			  for(x=0;x<5;x++) {
			  	System.out.print("Entre com um valor: ");
			  	num[x] = leia.nextInt();
	
			  	if(maiorNum<num[x]) {
			  		maiorNum = num[x];
			  	} 
			  }
			  System.out.println("\nO maior valor digitado foi " + maiorNum);
		 }

}
