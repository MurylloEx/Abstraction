package Lista5.Questao3;

import java.util.Scanner;

public class Main {
	
	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
			"Pressione\n"+
			"[1] Cadastrar trabalhador integral;\n" +
			"[2] Cadastrar trabalhador horista;\n"+
			"[3] Obter salário de trabalhador integral;\n" + 
			"[4] Obter salário de trabalhador horista;\n" + 
			"[5] Obter ficha do trabalhador integral;\n" + 
			"[6] Obter ficha do trabalhador horista;\n" + 
			"[7] Obter maior salário entre os trabalhadores integrais;\n" + 
			"[8] Obter maior salário entre os trabalhadores horista;\n" + 
			"[0] Para sair."
		);
		boolean bFlag = true;
		Empresa empresa = new Empresa();
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4, 5, 6, 7, 8]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando trabalhador integral...");
				empresa.cadastrarTrabalhadorIntegral(sc);
				break;
			case "2":
				System.out.println("Cadastrando trabalhador horista...");
				empresa.cadastrarTrabalhadorHorista(sc);
				break;
			case "3":
				System.out.println("Obtendo salário de trabalhador integral...");
				empresa.obterSalarioTrabIntegral(sc);
				break;
			case "4":
				System.out.println("Obtendo salário de trabalhador horista...");
				empresa.obterSalarioTrabHorista(sc);
				break;
			case "5":
				System.out.println("Obtendo ficha de trabalhador integral...");
				empresa.obterFichaTrabIntegral(sc);
				break;
			case "6":
				System.out.println("Obtendo ficha de trabalhador horista...");
				empresa.obterFichaTrabHorista(sc);
				break;
			case "7":
				System.out.println("Maior salário dos trabalhadores integrais:");
				empresa.exibirMaiorSalarioTrabIntegral();
				break;
			case "8":
				System.out.println("Maior salário dos trabalhadores horistas:");
				empresa.exibirMaiorSalarioTrabHorista();
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
