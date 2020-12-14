package Exercícios_POO_lista01;

public class Exercicio02_avião {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("Airbus A320",2018,"AZUL",220);
		Aviao aviao2 = new Aviao("Boeing 737",2016,"AZUL",215);
		
		System.out.println("Bem vindos a " + aviao1.compainhaAerea + "!!!");
		linha(80);
		System.out.println("\nInfo dos nossos aviões:");
		System.out.println("MODELO \t\t ANO \t CAPACIDADE DE PASSAGEIROS");
		linha(80);
		System.out.println(aviao1.infoAviao());
		System.out.println(aviao2.infoAviao());
		
		aviao1.planar();
		
		aviao1.acelerar(200);
		
		System.out.println("\nA velocidade atual de" + aviao1.modelo + " é de " + aviao1.velocidadeAtual + " Km/h.");

	}
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}
}
