package Pacote;

import java.util.Scanner;

public class Desafio4 {
	
	public static void main(String args[]) {
		while(true) {
			try {
				System.out.println("Forneça seu salário.");
				Scanner sc = new Scanner(System.in);
				int salario = (int)sc.nextFloat();
				//int resto = salario % 998;
				int salariosMinimos = salario / 998;
				//+ (resto > 0 ? 1 : 0)
				System.out.println("Salários mínimos: " + (salariosMinimos));
				sc.close();
				break;
			}
			catch (Exception ex) {
				System.out.println("Forneça um salário válida.");
			}
		}
		
	}
	
}
