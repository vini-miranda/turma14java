package estudos;

public class projetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("VINICIUS",22,'M');
		p[1] = new Pessoa("MARIA FERREIRA",16,'F');
		l[0] = new Livro("VIDA BANDIDA","ERASMO CARLOS",800,p[0]);
		l[1] = new Livro("SAUDADE SUA","RICARDINHO REBOLOS",500,p[1]);
		l[2] = new Livro("VENTO GELADO","RUBINHO BAR RISCHELO",200,p[0]);
		
		System.out.println(l[0].detalhes());
		
		

	}

}
