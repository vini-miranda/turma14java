package loja;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		double qtd = 0;
		String nome = null;
		String codigo;
		String op = "s";
		lista.add(new Produto("Alimento para peixe Alcon Guppy 20gr", "1", 19.99, 10));
		lista.add(new Produto("Arranhador Pawise Post Fred para Gatos", "2", 60.50, 10));
		lista.add(new Produto("Brinquedo Chalesco para Cães Dental Bone", "3", 10.99, 10));
		lista.add(new Produto("Casa Iglu Furacão Pet Verde para Cães Média", "4", 169.99, 10));
		lista.add(new Produto("Coleira Ferplast Ergocomfort Linear para Cães", "5", 89.99, 10));

		codigo = JOptionPane.showInputDialog("digite o codigo: ");
		
		do
		{
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigoProduto().equals(codigo)) {
				nome = lista.get(i).getNomeProduto();
				qtd = lista.get(i).getPrecoUnitario();
			}
		}
		
		//for(Produto list: lista) { System.out.println(list.getNomeProduto()); }
		 
		System.out.println(nome);
		System.out.println(qtd++);
		
		op = JOptionPane.showInputDialog("continua?: ");
		}while(op == "s");
		/*
		 * for(int i=0;i<lista.size();i++) {
		 * System.out.println(lista.get(i).getNomeProduto()); }
		 */
	}
}
