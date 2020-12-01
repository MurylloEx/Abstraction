package Lista5.Questao2;

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
			"[1] Cadastrar conta corrente;\n" +
			"[2] Cadastrar conta poupan�a;\n"+
			"[3] Atualizar conta corrente;\n" + 
			"[4] Atualizar conta poupan�a;\n" + 
			"[5] Saque conta corrente;\n" + 
			"[6] Saque conta poupan�a;\n" + 
			"[7] Verificar saldo de conta corrente;\n" + 
			"[8] Verificar saldo de conta poupan�a;\n" + 
			"[0] Para sair."
		);
		boolean bFlag = true;
		Banco banco = new Banco();
		while (bFlag) {
			System.out.println("Selecione uma a��o [0, 1, 2, 3, 4, 5, 6, 7, 8]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando conta corrente...");
				banco.cadastrarContaCorrente(sc);
				break;
			case "2":
				System.out.println("Cadastrando conta poupan�a...");
				banco.cadastrarContaPoupanca(sc);
				break;
			case "3":
				System.out.println("Atualizando conta corrente...");
				banco.atualizarContaCorrente(input(sc, "Digite o cpf do cliente:"));
				break;
			case "4":
				System.out.println("Atualizando conta poupan�a...");
				banco.atualizarContaPoupanca(input(sc, "Digite o cpf do cliente:"));
				break;
			case "5":
				System.out.println("Sacando na conta corrente...");
				banco.sacarContaCorrente(
						input(sc, "Digite o seu cpf:"),
						Float.parseFloat(input(sc, "Digite o valor do saque em R$:"))
						);
				break;
			case "6":
				System.out.println("Sacando na conta poupan�a...");
				banco.sacarContaPoupanca(
						input(sc, "Digite o seu cpf:"),
						Float.parseFloat(input(sc, "Digite o valor do saque em R$:"))
						);
				break;
			case "7":
				System.out.println("Verificando saldo de conta corrente...");
				banco.verificarSaldoContaCorrente(
						input(sc, "Digite o seu cpf:")
						);
				break;
			case "8":
				System.out.println("Verificando saldo de conta poupan�a...");
				banco.verificarSaldoContaPoupanca(
						input(sc, "Digite o seu cpf:")
						);
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
