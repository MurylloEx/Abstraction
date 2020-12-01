package Lista1.Questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para criar um retângulo;\n[2] Para calcular a área;\n[3] Para calcular o perímetro;\n[0] Para sair.");
		boolean bFlag = true;
		Retangulo ret = null;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Criando um retângulo...");
				System.out.println("Diga qual a altura do retângulo:");
				float alt = Float.parseFloat(sc.nextLine());
				System.out.println("Diga qual a largura do retângulo:");
				float larg = Float.parseFloat(sc.nextLine());
				ret = new Retangulo(alt, larg);
				System.out.println("Retângulo criado!");
				break;
			case "2":
				if (ret != null) {
					System.out.println("A área do retângulo é: " + ret.calcularArea());
				}
				else {
					System.out.println("Você precisa criar um retângulo antes.");
				}
				break;
			case "3":
				if (ret != null) {
					System.out.println("O perímetro do retângulo é: " + ret.calcularPerimetro());
				}
				else {
					System.out.println("Você precisa criar um retângulo antes.");
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
