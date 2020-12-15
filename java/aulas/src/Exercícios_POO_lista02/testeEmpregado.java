package Exercícios_POO_lista02;

public class testeEmpregado {

	public static void main(String[] args) {
		Empregado empre1 = new Empregado(1,1.500);
		empre1.setImposto(15);
		
		System.out.printf("CODIGO SETOR: %d\nSALARIO BASE: R$%.3f\n", empre1.getCodigoSetor(),empre1.getSalarioBase());
		System.out.println("IMPOSTOS(%): " + empre1.getImposto() + "%");
		System.out.println("SALARIO COM IMPOSTOS: R$" + empre1.calcularSalario());
		

	}

}
