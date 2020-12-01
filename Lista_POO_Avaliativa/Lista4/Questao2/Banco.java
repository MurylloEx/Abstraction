package Lista4.Questao2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {

	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static int generaternd(ArrayList<Cliente> clientes, String text, int milliseconds) {
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
			for (Cliente c : clientes) {
				if (!c.getContaCorrente().equals(null)) {
					if (c.getContaCorrente().getNumero() == numero) {
						bStatus = false;
					}
				}
				else {
					if (!c.getContaPoupanca().equals(null)) {
						if (c.getContaPoupanca().getNumero() == numero) {
							bStatus = false;
						}
					}
				}
			}
		}
		System.out.println(text + " gerado(a) com sucesso.");
		return numero;
	}
	
	public void cadastrarCliente(Scanner sc) {
		System.out.println("Cadastrando cliente...");
		String nome = input(sc, "Digite o nome do cliente:");
		String cpf = input(sc, "Digite o cpf do cliente:");
		
		float taxaCorrente = Float.parseFloat(input(sc, "Digite a taxa da conta corrente:"));
		String bancoCorrente = input(sc, "Digite o nome da sua agência de banco da conta corrente:");
		int numeroCorrente = generaternd(clientes, "número da conta corrente", 700);
		ContaCorrente contaCorrente = new ContaCorrente(numeroCorrente, taxaCorrente, 0, bancoCorrente);
		
		float taxaPoupanca = Float.parseFloat(input(sc, "Digite a taxa da conta poupança:"));
		String bancoPoupanca = input(sc, "Digite o nome da sua agência de banco da conta poupança:");
		int numeroPoupanca = generaternd(clientes, "número da conta poupança", 700);
		ContaPoupanca contaPoupanca = new ContaPoupanca(numeroPoupanca, taxaPoupanca, 0, bancoPoupanca);
		
		Cliente cliente = new Cliente(nome, cpf, contaCorrente, contaPoupanca);
		clientes.add(cliente);
		System.out.println("Cliente cadastrado com sucesso!");
	}
	
	public Cliente procurarCliente(String cpf) {
		for (Cliente cl : clientes) {
			if (cl.getCpf().toUpperCase().equals(cpf.toUpperCase())) {
				return cl;
			}
		}
		return null;
	}
	
}