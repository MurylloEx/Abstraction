
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas   ;
		int horas2 = 0  ;
		int salario;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe quanto voce recebe por hora: ");
		horas = s.nextInt(); 
		System.out.println("Agora quantas horas voce trabalha por mes: ");
		horas2 = s.nextInt();  
		salario = horas*horas2;
		System.out.println("Seu salario é : " + salario);
		
	}

}