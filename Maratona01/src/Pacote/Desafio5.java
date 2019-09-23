package Pacote;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String args[]) {
		while (true) {
			try {
				System.out.println("Forneça o seu salário bruto:");
				Scanner sc = new Scanner(System.in);
				float salarioBruto = sc.nextFloat();
				System.out.println("Seu salário líquido é: " + (0.815 * salarioBruto));
				sc.close();
				break;
			}
			catch (Exception e) {
				System.out.println(",0Forneça um salário válido.");
			}	
		}
	}
	
}
