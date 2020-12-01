package Lista5.Questao1;

import java.util.Scanner;

public class Main {

	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para adicionar funcion�rio;\n[2] Para adicionar gerente;\n[3] Para obter sal�rio de funcion�rio;\n[4] Para obter sal�rio de gerente;\n[0] Para sair.");
		Empresa empresa = new Empresa();
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("Selecione uma a��o [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Adicionando novo funcion�rio...\n");
				String nomeFunc 		= input(sc, "Nome do funcion�rio:");
				String cpfFunc 			= input(sc, "Cpf do funcion�rio:");
				String dataNascFunc 	= input(sc, "Data de nascimento do funcion�rio:");
				float salarioFunc		= Float.parseFloat(input(sc, "Sal�rio do funcion�rio em R$:"));
				Funcionario func = new Funcionario(nomeFunc, cpfFunc, dataNascFunc, salarioFunc);
				empresa.adicionarFuncionario(func);
				System.out.println("Funcion�rio adicionado!");
				break;
			case "2":
				System.out.println("Adicionando novo gerente...\n");
				String nomeGer 			= input(sc, "Nome do gerente:");
				String cpfGer 			= input(sc, "Cpf do gerente:");
				String dataNascGer 		= input(sc, "Data de nascimento do gerente:");
				float salarioGer		= Float.parseFloat(input(sc, "Sal�rio do gerente em R$ (Sem contar com a gratifica��o):"));
				Gerente ger = new Gerente(nomeGer, cpfGer, dataNascGer, salarioGer);
				empresa.adicionarGerente(ger);
				System.out.println("Gerente adicionado!");
				break;
			case "3":
				System.out.println("Obtendo sal�rio de funcion�rio...\n");
				String nomeOuCpf = input(sc, "Digite o nome ou Cpf do funcion�rio:");
				empresa.obterSalarioFuncionario(nomeOuCpf);
				break;
			case "4":
				System.out.println("Obtendo sal�rio de gerente...\n");
				String _nomeOuCpf = input(sc, "Digite o nome ou Cpf do gerente:");
				empresa.obterSalarioGerente(_nomeOuCpf);
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
