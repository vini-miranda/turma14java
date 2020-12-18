package bancoFinal_POO;

public class ContaUniversitaria extends ContaCorrente{
	private double emprestimoUniversidade;
	private double saldo;
	
	public ContaUniversitaria ( int  numeroConta , double  emprestimoUniversidade )
	{
		
		this . emprestimoUniversidade = emprestimoUniversidade;
		
	}
	
	public ContaUniversitaria(int numeroConta, String CPF, double emprestimoUniversidade, double saldo) {
		super(numeroConta, CPF);
		this.emprestimoUniversidade = emprestimoUniversidade;
		this.saldo = saldo;
	}



	public  double  getEmprestimoEmpresa () {
		return emprestimoUniversidade;
	}
	public  void  setEmprestimoEmpresa ( double  emprestimoUniversidade ) {
		this . emprestimoUniversidade = emprestimoUniversidade;
	}
	
	public  void  emprestar ( double  valorEmprestimo )
	{
		if (valorEmprestimo <= this . emprestimoUniversidade)
		{
			this . emprestimoUniversidade = this. emprestimoUniversidade - valorEmprestimo;
			this . saldo = this. saldo + valorEmprestimo;
			System.out.println( " Limite disponivel para emprestimo é: " + this . emprestimoUniversidade);
			System.out.println( " O SEU SALDO ATUAL: " + this. saldo);
		}
		else
		{
			System.out.println( " Valor acima do seu limite disponivel " );
		}
		
		
	}
	
}