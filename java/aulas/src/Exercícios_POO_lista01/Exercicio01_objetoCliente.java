package Exercícios_POO_lista01;

public class Exercicio01_objetoCliente {
	public static void main(String[] args) {
		Exercicio01_ClasseCliente cliente1 = new Exercicio01_ClasseCliente("VINICIUS ALVES MIRANDA",22,'M');
		
		linha(80);
		System.out.println("\nSEJA BEM VINDO A NOSSA LOJA!!");
		linha(80);
		System.out.println(cliente1.getInfo().toUpperCase());
		linha(80);
	}
	
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}
	
	
}
