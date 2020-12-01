package Lista5.Questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

	ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}

	public Conta procurarConta(String cpfCliente) {
		for (Conta c : contas) {
			if (c.getCpfCliente().toUpperCase().equals(cpfCliente.toUpperCase())) {
				return c;
			}
		}
		return null;
	}
	
	public Conta procurarConta(String cpfCliente, boolean contaPoupanca) {
		for (Conta c : contas) {
			if (contaPoupanca == true) {
				if (c instanceof ContaPoupanca) {
					if (c.getCpfCliente().toUpperCase().equals(cpfCliente.toUpperCase())) {
						return c;
					}
				}
			}
			else {
				if (c instanceof ContaCorrente) {
					if (c.getCpfCliente().toUpperCase().equals(cpfCliente.toUpperCase())) {
						return c;
					}
				}
			}
		}
		return null;
	}
	
	public void cadastrarContaCorrente(Scanner sc) {
		String cpfCliente = input(sc, "Digite o cpf do cliente:");
		Float taxa = Float.parseFloat(input(sc, "Digite a taxa da conta corrente:"));
		String banco = input(sc, "Digite o nome da agência bancária:");
		ContaCorrente contacorrente = new ContaCorrente(cpfCliente, taxa, 0, banco);
		contas.add(contacorrente);
	}
	
	public void cadastrarContaPoupanca(Scanner sc) {
		String cpfCliente = input(sc, "Digite o cpf do cliente:");
		Float taxa = Float.parseFloat(input(sc, "Digite a taxa da conta corrente:"));
		String banco = input(sc, "Digite o nome da agência bancária:");
		ContaPoupanca contapoupanca = new ContaPoupanca(cpfCliente, taxa, 0, banco);
		contas.add(contapoupanca);
	}
	
	public void atualizarContaCorrente(String cpfCliente) {
		Conta conta = procurarConta(cpfCliente);
		if (conta != null) {
			if (conta instanceof ContaCorrente) {
				((ContaCorrente)conta).Atualizar();
			}
			else {
				System.out.println("Conta corrente não encontrada!");
			}
		}
		else {
			System.out.println("Conta corrente não encontrada!");
		}
	}
	
	public void atualizarContaPoupanca(String cpfCliente) {
		Conta conta = procurarConta(cpfCliente);
		if (conta != null) {
			if (conta instanceof ContaPoupanca) {
				((ContaPoupanca)conta).Atualizar();
			}
			else {
				System.out.println("Conta poupança não encontrada!");
			}
		}
		else {
			System.out.println("Conta poupança não encontrada!");
		}
	}
	
	public void sacarContaCorrente(String cpfCliente, float valor) {
		Conta conta = procurarConta(cpfCliente);
		if (conta != null) {
			if (conta instanceof ContaCorrente) {
				if (((ContaCorrente)conta).Sacar(valor)) {
					System.out.println("Saque efetuado com sucesso.");
				}
				else {
					System.out.println("Erro ao efetuar saque, saldo insuficiente.");
				}
			}
			else {
				System.out.println("Conta corrente não encontrada!");
			}
		}
		else {
			System.out.println("Conta corrente não encontrada!");
		}
	}
	
	public void sacarContaPoupanca(String cpfCliente, float valor) {
		Conta conta = procurarConta(cpfCliente);
		if (conta != null) {
			if (conta instanceof ContaPoupanca) {
				if (((ContaPoupanca)conta).Sacar(valor)) {
					System.out.println("Saque efetuado com sucesso.");
				}
				else {
					System.out.println("Erro ao efetuar saque, saldo insuficiente.");
				}
			}
			else {
				System.out.println("Conta poupança não encontrada!");
			}
		}
		else {
			System.out.println("Conta poupança não encontrada!");
		}
	}
	
	public void verificarSaldoContaCorrente(String cpfCliente) {
		Conta conta = procurarConta(cpfCliente, false);
		if (conta != null) {
			System.out.println("=========================");
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("Cpf do cliente: " + conta.getCpfCliente());
			System.out.println("=========================");			
			System.out.println("Número da conta: " + conta.getNumero());
		}
		else {
			System.out.println("Conta corrente não encontrada!");
		}
	}
	
	public void verificarSaldoContaPoupanca(String cpfCliente) {
		Conta conta = procurarConta(cpfCliente, true);
		if (conta != null) {
			System.out.println("=========================");
			System.out.println("Saldo: R$ " + conta.getSaldo());
			System.out.println("Cpf do cliente: " + conta.getCpfCliente());
			System.out.println("Número da conta: " + conta.getNumero());
			System.out.println("=========================");
		}
		else {
			System.out.println("Conta corrente não encontrada!");
		}
	}

}
