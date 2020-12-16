package Objetos;

public class Terceiro extends Funcionario{
	
	//ATRIBUTOS
	private double valorTerceiro;

	//encapsulados
	public double getValorTerceiro() {
		return valorTerceiro;
	}

	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}

	
	//construtores
	public Terceiro(String nome, int horasMensais, double valorHora, double valorTerceiro) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}
	
	@Override
	public double pagamentoSalario() {
		
		double pagamento = ((this.horasMensais*this.valorHora)+this.valorTerceiro);
		return pagamento;
	}
	
	
	
}
