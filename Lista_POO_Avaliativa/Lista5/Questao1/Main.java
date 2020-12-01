package Lista5.Questao1;

import java.util.Scanner;

public class Main {

	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para adicionar funcionário;\n[2] Para adicionar gerente;\n[3] Para obter salário de funcionário;\n[4] Para obter salário de gerente;\n[0] Para sair.");
		Empresa empresa = new Empresa();
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Adicionando novo funcionário...\n");
				String nomeFunc 		= input(sc, "Nome do funcionário:");
				String cpfFunc 			= input(sc, "Cpf do funcionário:");
				String dataNascFunc 	= input(sc, "Data de nascimento do funcionário:");
				float salarioFunc		= Float.parseFloat(input(sc, "Salário do funcionário em R$:"));
				Funcionario func = new Funcionario(nomeFunc, cpfFunc, dataNascFunc, salarioFunc);
				empresa.adicionarFuncionario(func);
				System.out.println("Funcionário adicionado!");
				break;
			case "2":
				System.out.println("Adicionando novo gerente...\n");
				String nomeGer 			= input(sc, "Nome do gerente:");
				String cpfGer 			= input(sc, "Cpf do gerente:");
				String dataNascGer 		= input(sc, "Data de nascimento do gerente:");
				float salarioGer		= Float.parseFloat(input(sc, "Salário do gerente em R$ (Sem contar com a gratificação):"));
				Gerente ger = new Gerente(nomeGer, cpfGer, dataNascGer, salarioGer);
				empresa.adicionarGerente(ger);
				System.out.println("Gerente adicionado!");
				break;
			case "3":
				System.out.println("Obtendo salário de funcionário...\n");
				String nomeOuCpf = input(sc, "Digite o nome ou Cpf do funcionário:");
				empresa.obterSalarioFuncionario(nomeOuCpf);
				break;
			case "4":
				System.out.println("Obtendo salário de gerente...\n");
				String _nomeOuCpf = input(sc, "Digite o nome ou Cpf do gerente:");
				empresa.obterSalarioGerente(_nomeOuCpf);
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
