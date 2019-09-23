
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0 ;
		int b ;										
		Scanner s = new Scanner(System.in);
		System.out.println("Quantos metros tu queres converter:");
		a = s.nextInt();
		b = (a/100);
		
		if(b==1) {
			System.out.println(a + (" centimetros é igual a " + b + (" metro")));
		}else {
			
			System.out.println(a + (" centimetros é igual a " + b + (" metros")));
		}
	}

}