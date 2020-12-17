package loja;

public class Cliente extends Pessoa{
	
	//atributos
	private String cpf;
	
	//construtor
	public Cliente(String nome, char genero, int dataNascimento, String cpf) {
		super(nome, genero, dataNascimento);
		this.cpf = cpf;
	}
	
	//metodos
	public void corrigeCpf() {
		
	}
}
