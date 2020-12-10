import java.util.Scanner;

public class matrícula {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		String alunos [] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira"," Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"};
		char sexos [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'};
		int matricula [] = new int[40];
		String aux;
		int aluno;
		
			for(int i = 0; i<40; i++){
				matricula[i] = i+1;
				}
			System.out.print("Entre com a matrícula: ");
			aluno = t.nextInt();

			for(int i = 0; i<40; i++){
				if(aluno == matricula[i]) {
					if(sexos[i] == 'M') {
						aux = "Nome do aluno: ";
						System.out.println(matricula[i] + "  " + aux + alunos[i]);
					}
					else {
					aux = "Nome da aluna: ";
					System.out.println(matricula[i] + "  " + aux + alunos[i]);
				}
			}
				
		}
	}
}