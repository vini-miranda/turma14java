package Exercícios_POO_lista02;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	//capsulados
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public Empregado(int codigoSetor, double salarioBase) {
	
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		double salario = (this.salarioBase+ (this.salarioBase*this.imposto));
		return salario;
	}
	
	
	
	
}
