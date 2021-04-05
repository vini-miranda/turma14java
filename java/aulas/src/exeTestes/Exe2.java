package exeTestes;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		System.out.println("=================21===================");
		System.out.println("Pressione ENTER para sortear um número.");
		Scanner scanner = new Scanner(System.in);
	    String readString = scanner.nextLine();
	    int soma = 0;
	    int enter = 1;
	    
	    
	    while(readString!=null) {
	        System.out.println(readString);

	        if (readString.isEmpty()) {
	            int random = (int)(Math.random() * 10 + 1);
	            System.out.println("Número sorteado: " + random);
	            
	            if(random <= 21) {
					System.out.println("\nSOMA = " + soma + "+" + random);
					soma = random + soma;
					System.out.println("TOTAL = " + soma);
				}
	            
	            if(soma >= 21) {
	    			System.out.println("\nESTOUROU!! 21!!");
	    			System.out.println("Vezes sorteado: " + enter);
	    			if(enter == 1) {
	    				System.out.println("NUNCA JOGUE NA MEGA!!");
	    			}
	    			else if(enter == 2) {
	    				System.out.println("AZARADO VIU!!");
	    			}
	    			else if(enter == 3) {
	    				System.out.println("FOI ATÉ BEM MEU CHEGADO!!");
	    			}
	    			else if(enter >= 4) {
	    				System.out.println("TU É PIKA MERMO!!");
	    			}
	    			break;
	    		}
	        }

	        if (scanner.hasNextLine()) {
	        	enter = enter + 1;
	            readString = scanner.nextLine();
	        } else {
	            readString = null;
	        }
	    }
	}
}
