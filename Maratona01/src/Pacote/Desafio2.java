package Pacote;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String args[]) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite a nota 1:");
				double nota1 = sc.nextFloat();
				System.out.println("Digite a nota 2:");
				double nota2 = sc.nextFloat();
				System.out.println("Digite a nota 3:");
				double nota3 = sc.nextFloat();
				System.out.println("Digite a nota 4:");
				double nota4 = sc.nextFloat();
				System.out.println((nota1 + nota2 + nota3 + nota4)/4+"");
				sc.close();
				break;
			}
			catch(Exception e) {
				System.out.println("Forneça notas válidas.");
			}
		}
	}
}
