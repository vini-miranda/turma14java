package bancoFinal_POO;

public class ContaEmpresa extends Conta {

	private double emprestimoEmpresa;
	
	public ContaEmpresa(int numeroConta,double emprestimoEmpresa)
	{
		super(numeroConta);
		this.emprestimoEmpresa=emprestimoEmpresa;
		
	}
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void emprestar(double valorEmprestimo)
	{
		if(valorEmprestimo<=this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
			this.saldo=this.saldo+valorEmprestimo;
			System.out.println("O que resta do emprestimo:"+this.emprestimoEmpresa);
			System.out.println("O SEU SALDO ATUAL: "+this.saldo);
		}
		else 
		{
			System.out.println("OPERAÇÃO INVÁLIDA");
		}
		
		
	}
	
	
}