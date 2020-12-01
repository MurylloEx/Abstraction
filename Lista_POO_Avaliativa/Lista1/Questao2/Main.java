package Lista1.Questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para criar um ret�ngulo;\n[2] Para calcular a �rea;\n[3] Para calcular o per�metro;\n[0] Para sair.");
		boolean bFlag = true;
		Retangulo ret = null;
		while (bFlag) {
			System.out.println("Selecione uma a��o [0, 1, 2, 3]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Criando um ret�ngulo...");
				System.out.println("Diga qual a altura do ret�ngulo:");
				float alt = Float.parseFloat(sc.nextLine());
				System.out.println("Diga qual a largura do ret�ngulo:");
				float larg = Float.parseFloat(sc.nextLine());
				ret = new Retangulo(alt, larg);
				System.out.println("Ret�ngulo criado!");
				break;
			case "2":
				if (ret != null) {
					System.out.println("A �rea do ret�ngulo �: " + ret.calcularArea());
				}
				else {
					System.out.println("Voc� precisa criar um ret�ngulo antes.");
				}
				break;
			case "3":
				if (ret != null) {
					System.out.println("O per�metro do ret�ngulo �: " + ret.calcularPerimetro());
				}
				else {
					System.out.println("Voc� precisa criar um ret�ngulo antes.");
				}
				break;
			case "0":
				bFlag = false;
				break;
			default:
				System.out.println("Selecione uma op��o v�lida.");
				break;
			}
		}
		sc.close();
	}

}
