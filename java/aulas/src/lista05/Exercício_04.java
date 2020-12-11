package lista05;

public class Exercício_04 {

	public static void main(String[] args) {
		
		double num1=-1;
		double res=0.0;
		for(int i=1 ; i<=50 ; i++){
			num1 = num1 + 2;
			System.out.print(num1+ "/"+ i +" + ");
			res = res + (num1/i);

		}
		System.out.println("\n\nRESULTADO: " + Math.round(res));
	}
}
