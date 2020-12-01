package Lista3.Questao3;

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
			"[1] Cadastrar turma;\n" +
			"[2] Cadastrar estudante;\n"+
			"[3] Listar turmas;\n" + 
			"[4] Listar estudantes por turma;\n" + 
			"[5] Consultar média de um estudante;\n" + 
			"[6] Alterar notas de um estudante;\n" + 
			"[7] Exibir média dos estudantes de uma turma;\n" +
			"[0] Para sair."
		);
		Escola escola = new Escola();
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4, 5, 6, 7, 8]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando turma...");
				escola.cadastrarTurma(sc);
				break;
			case "2":
				System.out.println("Cadastrando estudante...");
				escola.cadastrarEstudante(sc);
				break;
			case "3":
				System.out.println("Listando turmas...");
				escola.listarTurmas();
				break;
			case "4":
				System.out.println("Listando estudantes por turma...");
				escola.listarEstudantesPelaTurma(sc);
				break;
			case "5":
				System.out.println("Consultando média de um estudante...");
				escola.consultarMediaEstudante(sc);
				break;
			case "6":
				System.out.println("Alterando notas de um estudante...");
				escola.alterarNotasEstudante(sc);
				break;
			case "7":
				System.out.println("Exibindo média dos estudantes de uma turma...");
				escola.exibirMediaTurma(sc);
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