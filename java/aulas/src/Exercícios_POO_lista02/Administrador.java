package Exercícios_POO_lista02;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Administrador(double ajudaDeCusto) {
		super();
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
}

