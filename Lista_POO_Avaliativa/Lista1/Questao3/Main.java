package Lista1.Questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para criar um C�rculo;\n[2] Para calcular a �rea;\n[3] Para calcular o per�metro;\n[0] Para sair.");
		boolean bFlag = true;
		Circulo ret = null;
		while (bFlag) {
			System.out.println("Selecione uma a��o [0, 1, 2, 3]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Criando um C�rculo...");
				System.out.println("Diga qual o raio do c�rculo:");
				float raio = Float.parseFloat(sc.nextLine());
				ret = new Circulo(raio);
				System.out.println("C�rculo criado!");
				break;
			case "2":
				if (ret != null) {
					System.out.println("A �rea do c�rculo �: " + ret.calcularArea());
				}
				else {
					System.out.println("Voc� precisa criar um c�rculo antes.");
				}
				break;
			case "3":
				if (ret != null) {
					System.out.println("O per�metro do c�rculo �: " + ret.calcularPerimetro());
				}
				else {
					System.out.println("Voc� precisa criar um c�rculo antes.");
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
