package Lista4.Questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar um aluno;\n[2] Para cadastrar um professor;\n[3] Para obter média de um aluno;\n[4] Para obter informações de um aluno;\n[5] Para obter informações de um professor;\n[0] Para sair.");
		boolean bFlag = true;

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4, 5]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando aluno...\n");
				String nomeAluno 		= input(sc, "Digite o nome do aluno:");
				String cpfAluno 		= input(sc, "Digite o Cpf do aluno:");
				String dataNascimento 	= input(sc, "Digite a data de nascimento do aluno:");
				float n1 = Float.parseFloat(input(sc, "Digite a nota 1 do aluno:"));
				float n2 = Float.parseFloat(input(sc, "Digite a nota 2 do aluno:"));
				float n3 = Float.parseFloat(input(sc, "Digite a nota 3 do aluno:"));
				float n4 = Float.parseFloat(input(sc, "Digite a nota 4 do aluno:"));
				Aluno a = new Aluno(nomeAluno, cpfAluno, dataNascimento, n1, n2, n3, n4);
				alunos.add(a);
				System.out.println("Novo aluno cadastrado!");
				break;
			case "2":
				System.out.println("Cadastrando professor...\n");
				String nomeProfessor 	= input(sc, "Digite o nome do professor:");
				String cpfProfessor		= input(sc, "Digite o Cpf do professor:");
				String dataProfessor 	= input(sc, "Digite a data de nascimento do professor:");
				float salarioProfessor 	= Float.parseFloat(input(sc, "Salário do professor:"));
				Professor prof = new Professor(nomeProfessor, cpfProfessor, dataProfessor, salarioProfessor);
				professores.add(prof);
				break;
			case "3":
				System.out.println("Obtendo média do aluno...\n");
				String nomeAlunoDesejado = input(sc, "Digite o nome do aluno:");
				for (Aluno aluno : alunos) {
					if (aluno.getNome().toUpperCase().equals(nomeAlunoDesejado.toUpperCase()) == true) {
						System.out.println("========================================");
						System.out.println("Média do aluno \"" + aluno.getNome() + "\" --> " + aluno.tirarMedia() + ".");
						System.out.println("========================================\n");
					}
				}
				break;
			case "4":
				System.out.println("Obtendo informações do aluno...\n");
				String nomeAlunoInfo = input(sc, "Digite o nome do aluno:");
				for (Aluno aluno : alunos) {
					if (aluno.getNome().toUpperCase().equals(nomeAlunoInfo.toUpperCase()) == true) {
						System.out.println("Exibindo informações do aluno...");
						System.out.println("========================================");
						System.out.println("Nome do aluno: " + aluno.getNome());
						System.out.println("Data de nascimento: " + aluno.getDataNascimento());
						System.out.println("CPF: " + aluno.getCpf());
						System.out.println("Média do aluno \"" + aluno.getNome() + "\" --> " + aluno.tirarMedia() + ".");
						System.out.println("Av.1: " + aluno.getNota1() + " / " + "Av.2: " + aluno.getNota2() + " / " + "Av.3: " + aluno.getNota3() + " / " + "Av.4: " + aluno.getNota4());
						System.out.println("========================================\n");
					}
				}
				break;
			case "5":
				System.out.println("Obtendo informações do professor...\n");
				String nomeProfessorInfo = input(sc, "Digite o nome do professor:");
				for (Professor professor : professores) {
					if (professor.getNome().toUpperCase().equals(nomeProfessorInfo.toUpperCase()) == true) {
						System.out.println("Exibindo informações do professor...");
						System.out.println("========================================");
						System.out.println("Nome do professor: " + professor.getNome());
						System.out.println("Data de nascimento: " + professor.getDataNascimento());
						System.out.println("CPF: " + professor.getCpf());
						System.out.println("Salário: " + professor.getSalario());
						System.out.println("========================================\n");
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