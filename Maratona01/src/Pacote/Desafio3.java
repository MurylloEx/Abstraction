package Pacote;

import java.util.Scanner;

public class Desafio3 {
	
	public static void main(String args[]) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Forneça sua idade em anos:");
				long dias = sc.nextInt();
				System.out.println(dias*365+"");
				sc.close();			
				break;
				
			}
			catch(Exception e) {
				System.out.println("Forneça uma idade válida.");
			}
		}
	}
	
}
