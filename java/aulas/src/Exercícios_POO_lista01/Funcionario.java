package Exercícios_POO_lista01;

public class Funcionario {
	
	String nome;
	int idade;
	String horarioEntrada;
	String horarioSaida;
	
	
	
	public Funcionario(String nome, int idade, String horarioEntrada, String horarioSaida) {
		this.nome = nome;
		this.idade = idade;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}
	
	public String dados() {
		String dadosFuncionario = "\n" + this.nome + " " + this.idade + " anos " + this.horarioEntrada + "  -  " + this.horarioSaida;
		return dadosFuncionario;
	}
}
