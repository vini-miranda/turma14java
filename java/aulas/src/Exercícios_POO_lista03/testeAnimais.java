package Exercícios_POO_lista03;

public class testeAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("LULU",6);
		Cavalo horse = new Cavalo("STEVEN", 10);
		Preguica sloth = new Preguica("DONALD", 4);
		
		Animal[] anm = new Animal[3];
		anm[0] = dog;
		anm[1] = horse;
		anm[2] = sloth;
		
		System.out.println("NOME \tIDADE \tSOM EMITIDO \tSE LOCOMOVE");
		for(Animal listaAnimais: anm) 
		{
			System.out.println(listaAnimais.getNome()+"\t"+listaAnimais.getIdade()+"\t" + listaAnimais.getSom() +"\t"+ listaAnimais.getCorre());
		}

	}

}
