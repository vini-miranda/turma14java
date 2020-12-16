package Exercícios_POO_lista03;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String getSom() {
		this.somEmitido = "Grunhido";
		return somEmitido;
	}

}
