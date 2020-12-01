package Lista4.Questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para adicionar funcionário;\n[2] Para adicionar gerente;\n[3] Para listar todos os funcionários;\n[4] Para mostrar o salário do gerente;\n[0] Para sair.");
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Adicionando funcionario...");
				String nome = input(sc, "Digite o nome do funcionário:");
				String cpf = input(sc, "Digite o cpf do funcionário:");
				String salario = input(sc, "Digite o salário do funcionário:");
				String dataNascimento = input(sc, "Diga a data de nascimento do funcionário:");
				Funcionario func = new Funcionario(nome, cpf, dataNascimento, Float.parseFloat(salario));
				funcionarios.add(func);
				System.out.println("Funcionário adicionado!");
				break;
			case "2":
				System.out.println("Adicionando gerente...");
				String nomeGerente = input(sc, "Digite o nome do gerente:");
				String cpfGerente = input(sc, "Digite o cpf do gerente:");
				String salarioGerente = input(sc, "Digite o salário do gerente sem as gratificações:");
				String dataNascimentoGerente = input(sc, "Digite a data de nascimento do gerente:");
				Funcionario gerente = new Gerente(nomeGerente, cpfGerente, dataNascimentoGerente, Float.parseFloat(salarioGerente));
				funcionarios.add(gerente);
				System.out.println("Gerente adicionado!");
				break;
			case "3":
				System.out.println("Listando todos os funcionários...");
				for (Funcionario f : funcionarios) {
					System.out.println("======================================");
					System.out.println("Novo funcionário encontrado!\n");
					System.out.println("Nome: " + f.getNome());
					System.out.println("CPF: " + f.getCpf());
					if (f instanceof Gerente) {
						System.out.println("Salário: R$ " + ((Gerente) f).calcularSalario());
					}
					else {
						System.out.println("Salário: R$ " + f.calcularSalario());
					}
					System.out.println("Cargo: " + (f instanceof Gerente ? "Gerente" : "Funcionário"));
					System.out.println("======================================\n");
				}
				break;
			case "4":
				System.out.println("Exibindo salário de gerente...\n");
				String _cpf = input(sc, "Diga o CPF do gerente para obter seu salário:");
				for (Funcionario _f : funcionarios) {
					if (_f instanceof Gerente) {
						if (((Gerente) _f).getCpf().toUpperCase().equals(_cpf)){
							System.out.println("======================================");
							System.out.println("Novo funcionário encontrado!\n");
							System.out.println("Nome: " + _f.getNome());
							System.out.println("Salário: R$ " + ((Gerente) _f).calcularSalario());
							System.out.println("======================================");
						}
					}
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
