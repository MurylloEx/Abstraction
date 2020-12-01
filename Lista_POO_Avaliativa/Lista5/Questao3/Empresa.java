package Lista5.Questao3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Empresa {

	ArrayList<Trabalhador> Trabalhadores = new ArrayList<Trabalhador>();
	
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
			for (Trabalhador t : Trabalhadores) {
				if (t.getCadastro() == numero) {
					bStatus = false;
				}	
			}
		}
		System.out.println(text + " gerado(a) com sucesso.");
		return numero;
	}
	
	public Trabalhador procurarTrabalhador(int cadastro) {
		for (Trabalhador trab : Trabalhadores) {
			if (trab.getCadastro() == cadastro) {
				return trab;
			}
		}
		return null;
	}
	
	public void cadastrarTrabalhadorIntegral(Scanner sc) {
		int cadastro = generaternd("número de cadastro", 700);
		String nome = input(sc, "Digite o nome do trabalhador integral:");
		int idade = Integer.parseInt(input(sc, "Digite a idade do trabalhador integral:"));
		String endereco = input(sc, "Digite o endereço do trabalhador:");
		float totalHoras = Float.parseFloat(input(sc, "Quantas horas o trabalhador trabalhou?"));
		float salarioHora = Float.parseFloat(input(sc, "Qual o valor do salário-hora do trabalhador?"));
		TrabalhadorIntegral trab = new TrabalhadorIntegral( nome, cadastro, idade, endereco, totalHoras, salarioHora);
		Trabalhadores.add(trab);
		System.out.println("Trabalhador cadastrado!");
	}
	
	public void cadastrarTrabalhadorHorista(Scanner sc) {
		int cadastro = generaternd("número de cadastro", 700);
		String nome = input(sc, "Digite o nome do trabalhador horista:");
		int idade = Integer.parseInt(input(sc, "Digite a idade do trabalhador horista:"));
		String endereco = input(sc, "Digite o endereço do trabalhador:");
		float totalHoras = Float.parseFloat(input(sc, "Quantas horas o trabalhador trabalhou?"));
		float salarioHora = Float.parseFloat(input(sc, "Qual o valor do salário-hora do trabalhador?"));
		TrabalhadorHorista trab = new TrabalhadorHorista( nome, cadastro, idade, endereco, totalHoras, salarioHora);
		Trabalhadores.add(trab);
		System.out.println("Trabalhador cadastrado!");
	}

	public void obterSalarioTrabIntegral(Scanner sc) {
		int cadastro = Integer.parseInt(input(sc, "Digite o número de cadastro do trabalhador:"));
		Trabalhador trab = procurarTrabalhador(cadastro);
		if (trab != null) {
			if (trab instanceof TrabalhadorIntegral) {
				System.out.println("===============================");
				System.out.println("Nome: " + ((TrabalhadorIntegral)trab).getNome());
				System.out.println("Valor-hora: R$ " + ((TrabalhadorIntegral)trab).getSalarioHora());
				System.out.println("===============================");
			}
			else {
				System.out.println("O cadastro fornecido não é de um trabalhador integral.");
			}
		}
		else {
			System.out.println("Nenhum trabalhador com esse cadastro foi encontrado!");
		}
	}
	
	public void obterSalarioTrabHorista(Scanner sc) {
		int cadastro = Integer.parseInt(input(sc, "Digite o número de cadastro do trabalhador:"));
		Trabalhador trab = procurarTrabalhador(cadastro);
		if (trab != null) {
			if (trab instanceof TrabalhadorHorista) {
				System.out.println("===============================");
				System.out.println("Nome: " + ((TrabalhadorHorista)trab).getNome());
				System.out.println("Valor-hora: R$ " + ((TrabalhadorHorista)trab).getSalarioHora());
				System.out.println("===============================");
			}
			else {
				System.out.println("O cadastro fornecido não é de um trabalhador horista.");
			}
		}
		else {
			System.out.println("Nenhum trabalhador com esse cadastro foi encontrado!");
		}
	}
	
	public void obterFichaTrabIntegral(Scanner sc) {
		int cadastro = Integer.parseInt(input(sc, "Digite o número de cadastro do trabalhador:"));
		Trabalhador trab = procurarTrabalhador(cadastro);
		if (trab != null) {
			if (trab instanceof TrabalhadorIntegral) {
				System.out.println("===============================");
				System.out.println("Nome: " + ((TrabalhadorIntegral)trab).getNome());
				System.out.println("Cadastro: " + ((TrabalhadorIntegral)trab).getCadastro());
				System.out.println("Endereço: " + ((TrabalhadorIntegral)trab).getEndereco());
				System.out.println("Valor-hora: " + ((TrabalhadorIntegral)trab).getSalarioHora());
				System.out.println("Total de horas de serviço: R$ " + ((TrabalhadorIntegral)trab).getTotalHoras());
				System.out.println("Salário: R$ " + ((TrabalhadorIntegral)trab).getSalario());
				System.out.println("===============================");
			}
			else {
				System.out.println("O cadastro fornecido não é de um trabalhador integral.");
			}
		}
		else {
			System.out.println("Nenhum trabalhador com esse cadastro foi encontrado!");
		}
	}
	
	public void obterFichaTrabHorista(Scanner sc) {
		int cadastro = Integer.parseInt(input(sc, "Digite o número de cadastro do trabalhador:"));
		Trabalhador trab = procurarTrabalhador(cadastro);
		if (trab != null) {
			if (trab instanceof TrabalhadorHorista) {
				System.out.println("===============================");
				System.out.println("Nome: " + ((TrabalhadorHorista)trab).getNome());
				System.out.println("Cadastro: " + ((TrabalhadorHorista)trab).getCadastro());
				System.out.println("Endereço: " + ((TrabalhadorHorista)trab).getEndereco());
				System.out.println("Valor-hora: R$ " + ((TrabalhadorHorista)trab).getSalarioHora());
				System.out.println("Total de horas de serviço: R$ " + ((TrabalhadorHorista)trab).getTotalHoras());
				System.out.println("Salário: R$ " + ((TrabalhadorHorista)trab).getSalario());
				System.out.println("===============================");
			}
			else {
				System.out.println("O cadastro fornecido não é de um trabalhador horista.");
			}
		}
		else {
			System.out.println("Nenhum trabalhador com esse cadastro foi encontrado!");
		}
	}
	
	public void exibirMaiorSalarioTrabIntegral() {
		float maiorSalario = 0;
		int cadastro = -1;
		for (Trabalhador trab : Trabalhadores) {
			if (trab instanceof TrabalhadorIntegral) {
				if (((TrabalhadorIntegral)trab).getSalario() > maiorSalario) {
					maiorSalario = ((TrabalhadorIntegral)trab).getSalario();
					cadastro = ((TrabalhadorIntegral)trab).getCadastro();
				}
			}
		}
		if (cadastro != -1 && maiorSalario != 0) {
			System.out.println("O maior salário dentre os trabalhadores integrais é de: R$ " + maiorSalario);
			System.out.println("Número de cadastro do trabalhador integral: " + cadastro);
		}
		else {
			System.out.println("Não há dados.");
		}
	}
	
	public void exibirMaiorSalarioTrabHorista() {
		float maiorSalario = 0;
		int cadastro = -1;
		for (Trabalhador trab : Trabalhadores) {
			if (trab instanceof TrabalhadorHorista) {
				if (((TrabalhadorHorista)trab).getSalario() > maiorSalario) {
					maiorSalario = ((TrabalhadorHorista)trab).getSalario();
					cadastro = ((TrabalhadorHorista)trab).getCadastro();
				}
			}
		}
		if (cadastro != -1 && maiorSalario != 0) {
			System.out.println("O maior salário dentre os trabalhadores horistas é de: R$ " + maiorSalario);
			System.out.println("Número de cadastro do trabalhador horista: " + cadastro);
		}
		else {
			System.out.println("Não há dados.");
		}
	}
	
}