package Exerc�cios_POO_lista01;

public class Exercicio05_patinete {

	public static void main(String[] args) {
		Patinete pat1 = new Patinete("Atrio","Patinete Street Juvenil",502.90);
		pat1.velocidadeMaxima = 50;
		
		System.out.println("PATINETES");
		linha(60);
		System.out.println("\nMODELO\t\t\tMARCA\t\tPRE�O");
		linha(60);
		System.out.println(pat1.info());
		
		pat1.acelerar(15);
		
		System.out.printf("\n\nA velocidade atual do patinete � %.0f km/h e sua velocidade m�xima � %.0f km/h. ",pat1.velocidadeAtual,pat1.velocidadeMaxima);
		

	}
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}
}
