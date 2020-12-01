package Lista2.Questao3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar conta;\n[2] Para realizar depósito;\n[3] Para realizar saque;\n[4] Para verificar saldo;\n[5] Consultar cliente.\n[0] Para sair.");
		boolean bFlag = true;
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4, 5]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Informe o nome do cliente:");
				String nome = sc.nextLine();
				System.out.println("Informe o Cpf do cliente:");
				String cpf = sc.nextLine();
				System.out.println("Gerando número da conta bancária...");
				try {
					Thread.sleep(700);
				}
				catch (Exception except) {}
				int numero = 0;
				Random rnd = new Random();
				boolean bStatus = false;
				while (!bStatus) {
					bStatus = true;
					numero = rnd.nextInt(Integer.MAX_VALUE);
					for (Conta con : contas) {
						if (con.getNumero() == numero) {
							bStatus = false;
						}
					}
				}
				int agencia = rnd.nextInt(9999);
				contas.add(new Conta(numero, agencia, new Cliente(nome, cpf), 0));
				System.out.println("Conta criada com sucesso!\n");
				System.out.println("Informações da conta:");
				System.out.println("=============================");
				System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
				System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
				System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
				System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
				System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
				System.out.println("=============================\n");
				break;
			case "2":
				System.out.println("Realizando depósitos...");
				System.out.println("Digite o nome da pessoa a quem deseja fazer um depósito:");
				String pessoaNome = sc.nextLine();
				for (Conta con : contas) {
					if (con.getCliente().getNome().toUpperCase().equals(pessoaNome.toUpperCase()) == true) {
						System.out.println("Conta encontrada!\n");
						System.out.println("Informações da conta:");
						System.out.println("=============================");
						System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
						System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
						System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
						System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
						System.out.println("=============================\n");
						System.out.println("Digite o valor do depósito em R$:");
						float valor = Float.parseFloat(sc.nextLine());
						if (con.efetuarDeposito(valor) == true) {
							System.out.println("Depósito efetuado!\n");
							System.out.println("Novas informações da conta:");
							System.out.println("=============================");
							System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
							System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
							System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
							System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
							System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
							System.out.println("=============================\n");
						}
						else {
							System.out.println("O depósito não foi feito! Talvez o valor seja negativo ou nulo.");
						}
						break;
					}
				}
				break;
			case "3":
				System.out.println("Realizando saques...");
				System.out.println("Digite o seu nome para sacar dinheiro:");
				String nomePessoa = sc.nextLine();
				for (Conta con : contas) {
					if (con.getCliente().getNome().toUpperCase().equals(nomePessoa.toUpperCase()) == true) {
						System.out.println("Conta encontrada!\n");
						System.out.println("Informações da conta:");
						System.out.println("=============================");
						System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
						System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
						System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
						System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
						System.out.println("=============================\n");
						System.out.println("Digite o valor do saque em R$:");
						float valor = Float.parseFloat(sc.nextLine());
						if (con.efetuarSaque(valor) == true) {
							System.out.println("Saque efetuado!\n");
							System.out.println("Novas informações da conta:");
							System.out.println("=============================");
							System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
							System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
							System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
							System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
							System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
							System.out.println("=============================\n");
						}
						else {
							System.out.println("O saque não foi feito! Talvez o valor seja negativo ou nulo.");
						}
						break;
					}
				}
				break;
			case "4":
				System.out.println("Digite o seu nome para verificar seu saldo:");
				String name = sc.nextLine();
				for (Conta con : contas) {
					if (con.getCliente().getNome().toUpperCase().equals(name.toUpperCase()) == true) {
						System.out.println("Conta encontrada!\n");
						System.out.println("Informações da conta:");
						System.out.println("=============================");
						System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
						System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
						System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
						System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
						System.out.println("=============================\n");
						break;
					}
				}
				break;
			case "5":
				System.out.println("Digite o número da conta para efetuar a consulta:");
				int _numero = Integer.parseInt(sc.nextLine());
				System.out.println("Digite o número da agência:");
				int _agencia = Integer.parseInt(sc.nextLine());
				for (Conta con : contas) {
					if (con.getNumero() == _numero && con.getAgencia() == _agencia) {
						System.out.println("Conta encontrada!\n");
						System.out.println("Informações da conta:");
						System.out.println("=============================");
						System.out.println("Propritário: " + contas.get(contas.size() - 1).getCliente().getNome());
						System.out.println("Cpf do proprietário: " + contas.get(contas.size() - 1).getCliente().getCpf());
						System.out.println("Número da conta: " + contas.get(contas.size() - 1).getNumero());
						System.out.println("Agência da conta: " + contas.get(contas.size() - 1).getAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
						System.out.println("=============================\n");
						break;
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
