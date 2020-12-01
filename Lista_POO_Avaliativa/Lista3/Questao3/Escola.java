package Lista3.Questao3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Escola {

	ArrayList<Turma> Turmas = new ArrayList<Turma>();
	
	public String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public int generaternd(String text, int milliseconds) {
		System.out.println("Gerando o(a) " + text + ";");
		try {
			Thread.sleep(milliseconds);
		}
		catch (Exception except) {}
		int numero = 0;
		Random rnd = new Random();
		boolean bStatus = false;
		while (!bStatus) {
			bStatus = true;
			numero = rnd.nextInt(Integer.MAX_VALUE);
			for (Turma c : Turmas) {
				if (c.getCodigo() == numero) {
					bStatus = false;
				}	
			}
		}
		System.out.println(text + " gerado(a) com sucesso.");
		return numero;
	}
	
	public Turma procurarTurma(int codigoTurma) {
		for (Turma turma : Turmas) {
			if (turma.getCodigo() == codigoTurma) {
				return turma;
			}
		}
		return null;
	}
	
	public Estudante procurarEstudante(Turma turma, int matricula) {
		for (Estudante e : turma.getEstudantes()) {
			if (e.getMatricula() == matricula) {
				return e;
			}
		}
		return null;
	}
	
	public void cadastrarTurma(Scanner sc) {
		if (Turmas.size() < 10) {
			String nome = input(sc, "Digite o nome da turma:");
			int codigo = generaternd("número da turma", 700);
			Turma turma = new Turma(codigo, nome);
			Turmas.add(turma);
			System.out.println("Turma cadastrada!");	
		}
		else {
			System.out.println("Número de turmas cadastradas excedido.");
		}
	}
	
	public void cadastrarEstudante(Scanner sc) {
		int matricula = Integer.parseInt(input(sc, "Digite o número de matrícula do estudante:"));
		String nome = input(sc, "Digite o nome do estudante:");
		float nota1 = Float.parseFloat(input(sc, "Digite a primeira nota do aluno:"));
		float nota2 = Float.parseFloat(input(sc, "Digite a segunda nota do aluno:"));
		float nota3 = Float.parseFloat(input(sc, "Digite a terceira nota do aluno:"));
		float nota4 = Float.parseFloat(input(sc, "Digite a quarta nota do aluno:"));
		Turma turma = procurarTurma(Integer.parseInt(input(sc, "Digite o código da turma a qual o estudante será inserido:")));
		if (turma != null) {
			Estudante e = new Estudante(matricula, nome, nota1, nota2, nota3, nota4);	
			if (turma.getEstudantes().size() < 10) {
				turma.addEstudante(e);
			}
			else{
				System.out.println("Número de estudantes cadastrados excedido. MAX. 10.");
			}
			System.out.println("Estudante cadastrado na turma " + turma.getNome() + "!");
		}
		else {
			System.out.println("Essa turma não foi encontrada, código inválido.");
		}
	}
	
	public void listarTurmas() {
		for (Turma turma : Turmas) {
			System.out.println("===================================");
			System.out.println("Código: " + turma.getCodigo());
			System.out.println("Número de alunos: " + turma.getEstudantes().size());
			System.out.println("Nome da turma: " + turma.getNome());
			System.out.println("Estudantes cadastrados...");
			for (Estudante e : turma.getEstudantes()) {
				System.out.println("	>> " + e.getNome());
			}
			System.out.println("Fim da listagem.");
			System.out.println("===================================\n");
		}
	}
	
	public void listarEstudantesPelaTurma(Scanner sc) {
		int codigoTurma = Integer.parseInt(input(sc, "Digite o código da turma:"));
		Turma turma = procurarTurma(codigoTurma);
		if (turma != null) {
			System.out.println("Estudantes cadastrados...");
			for (Estudante e : turma.getEstudantes()) {
				System.out.println("	>> " + e.getNome());
			}
			System.out.println("Fim da listagem.");
		}
		else {
			System.out.println("Turma não encontrada...");
		}
	}
	
	public void consultarMediaEstudante(Scanner sc) {
		int codigoTurma = Integer.parseInt(input(sc, "Digite o código da turma:"));
		int matricula = Integer.parseInt(input(sc, "Digite a matrícula do estudante:"));
		Turma turma = procurarTurma(codigoTurma);
		if (turma != null) {
			Estudante e = procurarEstudante(turma, matricula);
			if (e != null) {
				System.out.println("==============================");
				System.out.println("Nome do estudante: " + e.getNome());
				System.out.println("Matrícula: " + e.getMatricula());
				System.out.println("Média: " + e.mediaNotas());
				System.out.println("==============================\n");
			}
			else {
				System.out.println("Estudante não encontrado!");
			}
		}
		else {
			System.out.println("Turma não encontrada!");
		}
				
	}
	
	public void alterarNotasEstudante(Scanner sc) {
		int codigoTurma = Integer.parseInt(input(sc, "Digite o código da turma:"));
		int matricula = Integer.parseInt(input(sc, "Digite a matrícula do estudante:"));
		Turma turma = procurarTurma(codigoTurma);
		if (turma != null) {
			Estudante e = procurarEstudante(turma, matricula);
			if (e != null) {
				System.out.println("==============================");
				System.out.println("Nome do estudante: " + e.getNome());
				System.out.println("Matrícula: " + e.getMatricula());
				System.out.println("Média: " + e.mediaNotas());
				System.out.println("==============================\n");
				
				String bN1 = input(sc, "Deseja alterar a nota 1? s/N").toUpperCase();
				if (bN1.equals("S") == true) {
					e.setNota1(Float.parseFloat(input(sc, "Digite o valor da nova nota:")));
				}
				String bN2 = input(sc, "Deseja alterar a nota 2? s/N").toUpperCase();
				if (bN2.equals("S") == true) {
					e.setNota2(Float.parseFloat(input(sc, "Digite o valor da nova nota:")));
				}
				String bN3 = input(sc, "Deseja alterar a nota 3? s/N").toUpperCase();
				if (bN3.equals("S") == true) {
					e.setNota3(Float.parseFloat(input(sc, "Digite o valor da nova nota:")));
				}
				String bN4 = input(sc, "Deseja alterar a nota 4? s/N").toUpperCase();
				if (bN4.equals("S") == true) {
					e.setNota4(Float.parseFloat(input(sc, "Digite o valor da nova nota:")));
				}

			}
			else {
				System.out.println("Estudante não encontrado!");
			}
		}
		else {
			System.out.println("Turma não encontrada!");
		}
	}
	
	public void exibirMediaTurma(Scanner sc) {
		int codigoTurma = Integer.parseInt(input(sc, "Digite o código da turma:"));
		Turma turma = procurarTurma(codigoTurma);
		if (turma != null) {
			float media = 0;
			for (Estudante e : turma.getEstudantes()) {
				media += e.mediaNotas();
			}
			media /= turma.getEstudantes().size();
			System.out.println("Média da turma: " + media);
		}
		else {
			System.out.println("Turma não encontrada!");
		}
	}
	
}
