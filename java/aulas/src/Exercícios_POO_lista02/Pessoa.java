package Exerc�cios_POO_lista02;

public class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	//capsuladores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String endereco) {
		
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getInfo() {
		String info = "NOME: " + this.nome + "\tENDERE�O: " + this.endereco + "\tTELEFONE: " + this.telefone;
		return info;
	}

}
 