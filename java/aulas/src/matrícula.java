import java.util.Scanner;

public class matr�cula {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		String alunos [] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira"," Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel Enrique Cabral Silva","Gabriel S�rgio Nascimento Santos Gon�alves","Gide�o da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros","Lucas Gon�alves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almenara","Vinicius Alves Miranda"};
		char sexos [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'};
		int matricula [] = new int[40];
		String aux;
		int aluno;
		
			for(int i = 0; i<40; i++){
				matricula[i] = i+1;
				}
			System.out.print("Entre com a matr�cula: ");
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