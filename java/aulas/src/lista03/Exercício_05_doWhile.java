package lista03;

import java.util.Scanner;

public class Exercício_05_doWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		   int num = 233;

		   do {
		   	num++;
		   	num = num + 2;
		   	if(num >= 300 && num <=400) {
		   	num = num + 2;
		   	}
		   	System.out.print(num +  " ");
		   	
		   } while (num<456);

	}

}
