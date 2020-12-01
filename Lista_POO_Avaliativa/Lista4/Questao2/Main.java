package Lista4.Questao2;

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
			"[1] Cadastrar Cliente;\n" +
			"[2] Saque da conta corrente;\n"+
			"[3] Saque da poupan�a;\n" + 
			"[4] Dep�sito da conta corrente;\n" + 
			"[5] Dep�sito da conta poupan�a;\n" + 
			"[0] Para sair."
		);
		boolean bFlag = true;
		Banco banco = new Banco();
		while (bFlag) {
			System.out.println("Selecione uma a��o [0, 1, 2, 3, 4, 5]...");
			switch(sc.nextLine()) {
			case "1":
				banco.cadastrarCliente(sc);
				break;
			case "2":
				System.out.println("Realizando saque da conta corrente...");
				Cliente cl = banco.procurarCliente(input(sc, "Digite o Cpf do cliente:"));
				if (cl != null) {
					if (cl.getContaCorrente().sacar(Float.parseFloat(input(sc, "Forne�a o valor do saque:")))) {
						System.out.println("Saque efetuado com sucesso!");
					}
					else {
						System.out.println("Erro ao efetuar saque!");
					}
				}
				break;
			case "3":
				System.out.println("Realizando saque da conta poupan�a...");
				Cliente cl_ = banco.procurarCliente(input(sc, "Digite o Cpf do cliente:"));
				if (cl_ != null) {
					if (cl_.getContaPoupanca().sacar(Float.parseFloat(input(sc, "Forne�a o valor do saque:")))) {
						System.out.println("Saque efetuado com sucesso!");
					}
					else {
						System.out.println("Erro ao efetuar saque!");
					}
				}
				break;
			case "4":
				System.out.println("Realizando dep�sito da conta corrente...");
				Cliente _cl = banco.procurarCliente(input(sc, "Digite o Cpf do cliente:"));
				if (_cl != null) {
					_cl.getContaCorrente().depositar(Float.parseFloat(input(sc, "Digite o valor a ser depositado:")));
				}
				break;
			case "5":
				System.out.println("Realizando dep�sito da conta poupan�a...");
				Cliente __cl = banco.procurarCliente(input(sc, "Digite o Cpf do cliente:"));
				if (__cl != null) {
					__cl.getContaCorrente().depositar(Float.parseFloat(input(sc, "Digite o valor a ser depositado:")));
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
