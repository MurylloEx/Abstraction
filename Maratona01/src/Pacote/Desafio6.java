package Pacote;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String args[]) {
		String herois[] = new String[] {"Hulk", "Wolverine", "Iron Man", "Viuva Negra", "Ciclope", "Jean Gray", "Pantera Negra", "Capitao America", "Thor", "Capita Marvel"};
		String viloes[] = new String[] {"Magneto", "Caveira Vermelha", "Mandarim", "Kill Monger", "Skrulls", "Treinador", "Duende", "Rei Do Crime", "Thanos", "Ultron"};
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		boolean bflag = false;
		for (int k = 0; k < herois.length; k++) {
			if (herois[k].toLowerCase().equals( nome.toLowerCase() )) {
				System.out.println("É um herói.");
				bflag = true;
				break;
			}
			if (viloes[k].toLowerCase().equals( nome.toLowerCase() )) {
				System.out.println("É um vilão.");
				bflag = true;
				break;
			}
		}
		if (bflag == false) {
			System.out.println("Informe um vilão ou herói válido.");
		}
		sc.close();
	}
	
}