package Exercícios_POO_lista01;

public class Exercício03_Produto_eletronico {

	public static void main(String[] args) {
		Produto_Eletronico celular = new Produto_Eletronico("CELULAR",899.00,10);
		Produto_Eletronico carregador = new Produto_Eletronico("CARREGADOR",50.99,10);
		Produto_Eletronico fone = new Produto_Eletronico("FONE DE OUVIDO",25.50,3);
		
		
		System.out.println("PRODUTO \tPREÇO(R$) \tESTOQUE");
		linha(50);
		System.out.printf("\n%s \t%.2f \t\t%d",carregador.produto,carregador.preco,carregador.estoque);
		System.out.printf("\n%s \t%.2f \t\t%d",celular.produto,celular.preco,celular.estoque);
		System.out.printf("\n%s \t%.2f \t\t%d",fone.produto,fone.preco,fone.estoque);
		
		celular.comprar(1);
		fone.comprar(2);
		carregador.comprar(3);
		
		System.out.println("\n\nCELULAR COMPRADO!! ESTOQUE DISPONÍVEL: " + celular.estoque);
		System.out.println("FONE DE OUVIDO COMPRADO!! ESTOQUE DISPONÍVEL: " + fone.estoque);
		System.out.println("CARREGADOR COMPRADO!! ESTOQUE DISPONÍVEL: " + carregador.estoque);

	}
	
	static void linha(int tam) 
	{
		for(int i=0;i<tam;i++) {
			System.out.print("=");
		}
	}
	
	

}
