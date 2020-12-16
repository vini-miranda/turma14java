package Exercícios_POO_lista03;

public class Cachorro extends Animal{
		

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override
	public String getSom() {
		this.somEmitido = "Latido";
		return somEmitido;
	}
	
}
