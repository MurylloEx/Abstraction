package Pacote;

import java.util.Scanner;

public class Desafio7 {
	
	public static void main(String[] args) {
		int count = 0;
		int votosChapa1 = 0;
		int votosChapa2 = 0;
		int votosBrancos = 0;
		int votosNulos = 0;
		Scanner sc = new Scanner(System.in);
		
		while (count < 5) {
			System.out.println("Digite um número para escolher a chapa.");
			try {
				int numero = Integer.parseInt(sc.nextLine());
				switch(numero) {
					case 0:
						votosBrancos += 1;
						break;
					case 1:
						votosChapa1 += 1;
						break;
					case 2:
						votosChapa2 += 1;
						break;
					default:
						votosNulos += 1;
						break;
				}
			}
			catch(Exception ex) {
				System.out.println("Digite um número válido.");
				count -=1;
			}
			count += 1;
			sc = new Scanner(System.in);
		}
		
		sc.close();
		
		System.out.println("Número de votos da para a chapa 1: " + votosChapa1);
		System.out.println("Número de votos da para a chapa 2: " + votosChapa2);
		System.out.println("Número de votos em branco: " + votosBrancos);
		System.out.println("Número de votos nulos: " + votosNulos);
		if (votosChapa1 > votosChapa2) {
			//Chapa 1 ganhou.
			System.out.println("[-->] Chapa 1 ganhou.");
		}
		else {
			if (votosChapa1 == votosChapa2) {
				//Deu empate.
				System.out.println("[-->] Deu empate.");
			}
			else {
				//Chapa 2 ganhou.
				System.out.println("[-->] Chapa 2 ganhou.");
			}
		}
		
	}
	
}
