package exeTestes;

public class Exe3 {

	public static void main(String[] args) {
		
		int maxDigit=6,valor=0, soma=0, resto=0;
		
		for(int i=1000; i<=9999; i++) {
			valor = i;
			
			while(valor > 0) {
				resto = valor % 10;
				if(valor>maxDigit) {
					break;
				}
				
				valor = valor/10;
				soma = soma + resto;
			}
			
			if(soma == 21 && valor<maxDigit){
				System.out.println(i);
			}
			soma = 0;
		}
	}
}
