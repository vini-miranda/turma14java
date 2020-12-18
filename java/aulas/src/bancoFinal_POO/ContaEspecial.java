package bancoFinal_POO;

public class ContaEspecial extends ContaCorrente {
	protected double valorLimite11;
	protected double valorCadastroLimite;
	
	

	public ContaEspecial(int numeroConta, double valorCredito) {
		super(numeroConta);
		this.valorLimite11 = valorCredito;
		
	}

	public double getValorLimite11() {
		return valorLimite11;
	}

	public void setValorLimite11(double valorLimite1) 
	{
		this.valorLimite11 = valorLimite1;
	}
	
	
	public double getValorCadastroLimite() 
	{
		return valorCadastroLimite;
	}

	@Override
	public boolean testarSaldo(double debito) 
	{
		
		boolean teste;
		if (debito <= super.getSaldo()) 
		{
			teste = true;	
			
		} 
		else if (debito <= (this.valorLimite11 + super.getSaldo()))
		{
			if(debito > super.getSaldo()) 
			{
				System.out.println("Seu saldo é insuficiente, o valor a ser debitado será retirado do seu limite");
				double valorCredito = debito - super.getSaldo();
				super.credito(valorCredito);
				this.valorLimite11 = this.valorLimite11 - valorCredito;
				teste = true;
			}
			else {
			
				this.valorLimite11 -= (debito - super.getSaldo());
				debito -= super.getSaldo();
				teste = true;
			}
		}
		else{
			teste = false;
		}
		
		return teste;
	}
	
	public void registraLimite(){
		if(valorLimite11<=0){
			 System.out.println("Valor zerado, impossivel realizar");
		}
		else {
			this.valorCadastroLimite = this.valorLimite11;
		}
	}
	
	
	public void devolverLimite(double valorCredito)
	{
		if (this.valorCadastroLimite != this.valorLimite11) 
		{
			if(valorCredito >= this.valorCadastroLimite){
				this.valorLimite11 = this.valorCadastroLimite;
				super.credito(valorCredito - this.valorCadastroLimite);
			}
			else if(valorCredito < (this.valorCadastroLimite - this.valorLimite11))
			{
				this.valorLimite11 +=  valorCredito;
					
			}
			else {
				double diferenca;
				diferenca =  valorCredito- (this.valorCadastroLimite - this.valorLimite11);
				this.valorLimite11 += (this.valorCadastroLimite - this.valorLimite11);
				super.credito(diferenca);
			}
		}
		else {
			super.credito(valorCredito);
		}
		
	}
	
	
	
}