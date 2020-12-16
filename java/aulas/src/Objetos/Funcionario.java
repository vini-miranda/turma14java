package Objetos;

public class Funcionario {
	
	//atributos
	private String nome;
	protected int horasMensais;
	protected double valorHora;
	
	//encapsulados
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasMensais() {
		return horasMensais;
	}
	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//construtores
	public Funcionario(String nome, int horasMensais, double valorHora) {
		super();
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	
	//METODOS
	public double pagamentoSalario() {
		
		double pagamento = this.horasMensais*this.valorHora;
		return pagamento;
	}
	
	
}
