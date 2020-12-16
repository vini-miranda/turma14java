package Exercícios_POO_lista03;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String getSom() {
		this.somEmitido = "Relincho";
		return somEmitido;
	}
}
