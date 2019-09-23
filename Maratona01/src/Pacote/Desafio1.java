package Pacote;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String args[]) {
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Forneça um número ao console:");
				long numero = sc.nextLong();
				System.out.println((numero-1) + "");
				System.out.println((numero+1) + "");
				sc.close();
				break;
			}
			catch(Exception ex){
				System.out.println("Forneça um número válido.");
			}
		}
		
	}
	
}