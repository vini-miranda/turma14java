package loja;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Pessoa {
	
	//atributos
	private String nome;
	private char genero;
	private int dataNascimento;
	
	//construtor
	public Pessoa(String nome, char genero, int dataNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}
	
	//encapsulamentos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	//metodo
	public int voltaIdade(int dataNascimento) {
		return 2020 - dataNascimento;
	}
	
	public int voltaIdadeAtual(int anoAtual) {
		return anoAtual - dataNascimento;
	}

	Calendar ano = GregorianCalendar.getInstance();
	int anoAtual=ano.get(Calendar.YEAR);

	
}
