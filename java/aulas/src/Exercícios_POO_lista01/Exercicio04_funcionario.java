package Exercícios_POO_lista01;

public class Exercicio04_funcionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("EMERSON DE OLIVEIRA SANTOS",38,"09h00","17h15");
		Funcionario func2 = new Funcionario("EDERNIRSON GEANDRO LOPES",28,"08h00","17h00");
		
		System.out.println("CONTROLE DE FUNCIONARIOS");
		linha(50);
		
		System.out.println(func1.dados());
		System.out.println(func2.dados());
		
		
	}
	
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}

}
