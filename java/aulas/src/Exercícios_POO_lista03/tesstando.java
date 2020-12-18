package Exercícios_POO_lista03;

import java.util.ArrayList;
import java.util.List;

public class tesstando {

	public static void main(String[] args) {
		List<ProdutosLoja> lista = new ArrayList<>();
		
		lista.add(new ProdutosLoja("hsjh",23));
		lista.add(new ProdutosLoja("hddojs",83));
		
		for(ProdutosLoja v: lista) {
			System.out.println(v.getProduto());
		}
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getProduto() == "hsjh") {
				lista.remove(i);
				System.out.println(lista.get(i).getProduto() + lista.get(i).getEstoque());
				
		}
		
	}


}
}
