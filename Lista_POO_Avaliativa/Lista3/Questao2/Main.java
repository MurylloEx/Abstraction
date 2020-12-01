package Lista3.Questao2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar contas;\n[2] Para realizar dep�sito;\n[3] Para realizar saque;\n[4] Verificar saldo;\n[5] Consultar n�mero e nome da ag�ncia;\n[6] Alterar o n�mero e nome da ag�ncia;\n[0] Para sair.");
		boolean bFlag = true;
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		while (bFlag) {
			System.out.println("Selecione uma a��o [0, 1, 2, 3, 4, 5, 6]...");
			switch(sc.nextLine()) {
			case "1":
				if (contas.size() < 10) {
					System.out.println("Cadastrando nova conta...");
					int numeroAgencia = Integer.parseInt(input(sc, "Forne�a o n�mero da ag�ncia:"));
					String nomeAgencia = input(sc, "Forne�a o nome da ag�ncia banc�ria:");
					String nome = input(sc, "Forne�a o nome do cliente:");
					String cpf = input(sc, "Forne�a o CPF do cliente:");
					int numero = 0;
					System.out.println("Gerando o n�mero da sua conta, aguarde...");
					try {
						Thread.sleep(700);
					}
					catch (Exception except) {}
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
					contas.add(new Conta(numero, new Banco(numeroAgencia, nomeAgencia), new Cliente(nome, cpf), 0));
					System.out.println("Informa��es da conta:");
					System.out.println("=============================");
					System.out.println("Proprit�rio: " + contas.get(contas.size() - 1).getCliente().getNome());
					System.out.println("Cpf do propriet�rio: " + contas.get(contas.size() - 1).getCliente().getCpf());
					System.out.println("N�mero da conta: " + contas.get(contas.size() - 1).getNumero());
					System.out.println("Ag�ncia da conta: " + contas.get(contas.size() - 1).getBanco().getNomeAgencia());
					System.out.println("N�mero da ag�ncia da conta: " + contas.get(contas.size() - 1).getBanco().getNumeroAgencia());
					System.out.println("Saldo atual: R$ " + Float.toString(contas.get(contas.size() - 1).getSaldo()));
					System.out.println("=============================\n");
					System.out.println("Conta cadastrada com sucesso!");
				}
				else {
					System.out.println("limite de contas banc�rias cadastradas atingido! S� � poss�vel criar 10 contas.");
				}
				break;
			case "2":
				System.out.println("Sistema de dep�sitos via CPF...\n");
				boolean bEncontrado = false;
				String _cpf = input(sc, "Digite o Cpf de quem voc� ir� depositar o dinheiro:");
				for (Conta con : contas) {
					if (con.getCliente().getCpf().toUpperCase().equals(_cpf.toUpperCase()) == true) {
						bEncontrado = true;
						System.out.println("Informa��es da conta:");
						System.out.println("=============================");
						System.out.println("Proprit�rio: " + con.getCliente().getNome());
						System.out.println("Cpf do propriet�rio: " + con.getCliente().getCpf());
						System.out.println("N�mero da conta: " + con.getNumero());
						System.out.println("Ag�ncia da conta: " + con.getBanco().getNomeAgencia());
						System.out.println("N�mero da ag�ncia da conta: " + con.getBanco().getNumeroAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(con.getSaldo()));
						System.out.println("=============================\n");
						float quantia = Float.parseFloat(input(sc, "Forne�a a quantia a ser depositada:"));
						if (con.efetuarDeposito(quantia) == true) {
							System.out.println("Dep�sito efetuado com sucesso!\n");
							System.out.println("Novas informa��es da conta:");
							System.out.println("=============================");
							System.out.println("Proprit�rio: " + con.getCliente().getNome());
							System.out.println("Cpf do propriet�rio: " + con.getCliente().getCpf());
							System.out.println("N�mero da conta: " + con.getNumero());
							System.out.println("Ag�ncia da conta: " + con.getBanco().getNomeAgencia());
							System.out.println("N�mero da ag�ncia da conta: " + con.getBanco().getNumeroAgencia());
							System.out.println("Saldo atual: R$ " + Float.toString(con.getSaldo()));
							System.out.println("=============================\n");
						}
						else {
							System.out.println("O dep�sito n�o ocorreu, erro ao efetuar dep�sito.");
						}
					}
				}
				if (bEncontrado == false) {
					System.out.println("Lamentamos mas o CPF fornecido n�o possui conta cadastrada nesse banco!");
				}
				break;
			case "3":
				System.out.println("Sistema de saques via CPF...\n");
				boolean _bEncontrado = false;
				String __cpf = input(sc, "Forne�a o seu CPF para sacar o dinheiro:");
				for (Conta con : contas) {
					if (con.getCliente().getCpf().toUpperCase().equals(__cpf.toUpperCase()) == true) {
						_bEncontrado = true;
						System.out.println("Informa��es da conta:");
						System.out.println("=============================");
						System.out.println("Proprit�rio: " + con.getCliente().getNome());
						System.out.println("Cpf do propriet�rio: " + con.getCliente().getCpf());
						System.out.println("N�mero da conta: " + con.getNumero());
						System.out.println("Ag�ncia da conta: " + con.getBanco().getNomeAgencia());
						System.out.println("N�mero da ag�ncia da conta: " + con.getBanco().getNumeroAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(con.getSaldo()));
						System.out.println("=============================\n");
						float quantia = Float.parseFloat(input(sc, "Forne�a a quantia a ser sacada:"));
						if (con.efetuarDeposito(quantia) == true) {
							System.out.println("Saque efetuado com sucesso!\n");
							System.out.println("Novas informa��es da conta:");
							System.out.println("=============================");
							System.out.println("Proprit�rio: " + con.getCliente().getNome());
							System.out.println("Cpf do propriet�rio: " + con.getCliente().getCpf());
							System.out.println("N�mero da conta: " + con.getNumero());
							System.out.println("Ag�ncia da conta: " + con.getBanco().getNomeAgencia());
							System.out.println("N�mero da ag�ncia da conta: " + con.getBanco().getNumeroAgencia());
							System.out.println("Saldo atual: R$ " + Float.toString(con.getSaldo()));
							System.out.println("=============================\n");
						}
						else {
							System.out.println("O saque n�o ocorreu, erro ao efetuar saque.");
						}
					}
				}
				if (_bEncontrado == false) {
					System.out.println("Lamentamos mas o CPF fornecido n�o possui conta cadastrada nesse banco!");
				}
				break;
			case "4":
				System.out.println("Sistema de saques via CPF...\n");
				boolean __bEncontrado = false;
				String ___cpf = input(sc, "Forne�a o seu CPF para sacar o dinheiro:");
				for (Conta con : contas) {
					if (con.getCliente().getCpf().toUpperCase().equals(___cpf.toUpperCase()) == true) {
						__bEncontrado = true;
						System.out.println("=============================");
						System.out.println("Proprit�rio: " + con.getCliente().getNome());
						System.out.println("Cpf do propriet�rio: " + con.getCliente().getCpf());
						System.out.println("Saldo atual: R$ " + Float.toString(con.getSaldo()));
						System.out.println("=============================\n");
					}
				}
				if (__bEncontrado == false) {
					System.out.println("Lamentamos mas o CPF fornecido n�o possui conta cadastrada nesse banco!");
				}
				break;
			case "5":
				int _numero = Integer.parseInt(input(sc, "Digite o n�mero da conta para efetuar a consulta:"));
				String _agencia = input(sc, "Digite o nome da ag�ncia:");
				for (Conta con : contas) {
					if (con.getNumero() == _numero && con.getBanco().getNomeAgencia().toUpperCase().equals(_agencia.toUpperCase()) == true) {
						System.out.println("Conta encontrada!\n");
						System.out.println("Informa��es da conta:");
						System.out.println("=============================");
						System.out.println("Proprit�rio: " + con.getCliente().getNome());
						System.out.println("Cpf do propriet�rio: " + con.getCliente().getCpf());
						System.out.println("N�mero da conta: " + con.getNumero());
						System.out.println("Ag�ncia da conta: " + con.getBanco().getNomeAgencia());
						System.out.println("N�mero da ag�ncia da conta: " + con.getBanco().getNumeroAgencia());
						System.out.println("Saldo atual: R$ " + Float.toString(con.getSaldo()));
						System.out.println("=============================\n");
						break;
					}
				}
				break;
			case "6":
				String ___nome = input(sc, "Digite o seu nome:");
				for (Conta con : contas) {
					if (con.getCliente().getNome().toUpperCase().equals(___nome.toUpperCase()) == true){
						int novoNumAgencia = Integer.parseInt(input(sc, "Digite seu novo n�mero de ag�ncia:"));
						String nomeAgencia = input(sc, "Digite o novo nome da ag�ncia:");
						con.getBanco().setNumeroAgencia(novoNumAgencia);
						con.getBanco().setNomeAgencia(nomeAgencia);
					}
				}
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
