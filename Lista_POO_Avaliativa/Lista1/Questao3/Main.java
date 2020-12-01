package Lista1.Questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para criar um Círculo;\n[2] Para calcular a área;\n[3] Para calcular o perímetro;\n[0] Para sair.");
		boolean bFlag = true;
		Circulo ret = null;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Criando um Círculo...");
				System.out.println("Diga qual o raio do círculo:");
				float raio = Float.parseFloat(sc.nextLine());
				ret = new Circulo(raio);
				System.out.println("Círculo criado!");
				break;
			case "2":
				if (ret != null) {
					System.out.println("A área do círculo é: " + ret.calcularArea());
				}
				else {
					System.out.println("Você precisa criar um círculo antes.");
				}
				break;
			case "3":
				if (ret != null) {
					System.out.println("O perímetro do círculo é: " + ret.calcularPerimetro());
				}
				else {
					System.out.println("Você precisa criar um círculo antes.");
				}
				break;
			case "0":
				bFlag = false;
				break;
			default:
				System.out.println("Selecione uma opção válida.");
				break;
			}
		}
		sc.close();
	}

}
