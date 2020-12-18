package loja;

public class teste {

	public static void main(String[] args) {
		Produto bb = new Produto("nn",1,10,10);
		
		bb.tiraEstoque(20);
		System.out.println(bb.getEstoqueProduto());
	}

}
