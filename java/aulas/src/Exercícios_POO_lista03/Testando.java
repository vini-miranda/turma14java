package Exercícios_POO_lista03;

public class Testando {

	public static void main(String[] args) {
		int num = 4;
		
		System.out.println(fatorial(num));

	}
	
	static int fatorial(int num) {
		if(num==0)
		return 1;
		return num * fatorial(num-1);
		}

}
