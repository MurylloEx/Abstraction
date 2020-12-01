package Lista4.Questao4;

import java.util.Scanner;

public class Main {
	
	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para registrar casa;\n[2] Para registrar apartamento;\n[3] Para listar imóveis não alugados;\n[4] Para listar todos os imóveis mobiliados;\n[0] Para sair.");
		Imobiliaria imobiliaria = new Imobiliaria();
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Registrando casa no sistema...\n");
				String ruaCasa 			= input(sc, "Digite o nome da rua:");
				String numeroCasa 		= input(sc, "Digite o número do imóvel:");
				String bairroCasa 		= input(sc, "Digite o nome do bairro:");
				String cidadeCasa 		= input(sc, "Digite o nome da cidade:");
				String estadoCasa 		= input(sc, "Digite o nome do estado:");
				String cepCasa 			= input(sc, "Digite o CEP:");
				String precoCasa 		= input(sc, "Forneça o preço do imóvel:");
				boolean alugadaCasa 	= input(sc, "A casa está alugada? (S/N):").toUpperCase().equals("S");
				boolean mobiliadaCasa 	= input(sc, "A casa é mobiliada? (S/N):").toUpperCase().equals("S");
				Casa casa = new Casa(ruaCasa, Integer.parseInt(numeroCasa), bairroCasa, cidadeCasa, estadoCasa, cepCasa, Float.parseFloat(precoCasa), alugadaCasa, mobiliadaCasa);
				imobiliaria.registrarCasa(casa);
				System.out.println("Casa registrada com sucesso!");
				break;
			case "2":
				System.out.println("Registrando casa no sistema...\n");
				String nomePredio 		= input(sc, "Diga o nome do prédio:");
				String ruaApt 			= input(sc, "Digite o nome da rua:");
				String numeroApt 		= input(sc, "Digite o número do imóvel:");
				String bairroApt 		= input(sc, "Digite o nome do bairro:");
				String cidadeApt 		= input(sc, "Digite o nome da cidade:");
				String estadoApt 		= input(sc, "Digite o nome do estado:");
				String cepApt 			= input(sc, "Digite o CEP:");
				String precoApt 		= input(sc, "Forneça o preço do imóvel:");
				boolean alugadaApt 		= input(sc, "A casa está alugada? (S/N):").toUpperCase().equals("S");
				boolean mobiliadaApt 	= input(sc, "A casa é mobiliada? (S/N):").toUpperCase().equals("S");
				Apartamento apt = new Apartamento(nomePredio, ruaApt, Integer.parseInt(numeroApt), bairroApt, cidadeApt, estadoApt, cepApt, Float.parseFloat(precoApt), alugadaApt, mobiliadaApt);
				imobiliaria.registrarApartamento(apt);
				System.out.println("Apartamento registrado com sucesso!");
				break;
			case "3":
				System.out.println("Listando imóveis não alugados...");
				String nomeRua = input(sc, "Forneça o nome da rua para listar os imóveis não alugados.");
				imobiliaria.listarImoveisAlugados(false, nomeRua);
				break;
			case "4":
				System.out.println("Listando todos os imóveis mobiliados...");
				imobiliaria.listarImoveisMobiliados(true);
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
