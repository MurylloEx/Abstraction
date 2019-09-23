import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe a nota 1: ");
		nota1 = s.nextInt(); 
		System.out.println("Informe a nota 2: ");
		nota2 = s.nextInt(); 
		System.out.println("Informe a nota 3: ");
		nota3 = s.nextInt(); 
		System.out.println("Informe a nota 4: ");
		nota4 = s.nextInt(); 
		int media = (nota1+nota2+nota3+nota4);
		media =  media/4;
			
		System.out.println("A media e: " + media);
		
	}

}
