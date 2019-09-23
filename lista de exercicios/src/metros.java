import java.util.Scanner;

public class metros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, res ;								
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o metro que vc quer:");
		a = s.nextInt(); 
		res = a*100;
		System.out.println("Metros em centimetros será: " + res);
		
	}

}
