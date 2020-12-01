package Lista6.QuestaoBonus;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static String input(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar livraria;\n[2] Para cadastrar funcionário em uma livraria;\n[3] Para definir gerente de uma livraria;\n[4] Para adicionar livros em uma livraria;\n[5] Para listar os livros de uma livraria;\n[6] Para listar os funcionários de uma livraria;\n[7] Para listar os gerentes das livrarias cadastradas;\n[0] Para sair.");
		RedeLivrarias rede = new RedeLivrarias();
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4, 5, 6, 7]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando livraria...\n");
				String nomeLib = input(sc, "Nome da livraria:");
				String cidadeLib = input(sc, "Cidade da livraria:");
				String estadoLib = input(sc, "Estado da livraria:");
				Livraria lib = new Livraria(nomeLib, cidadeLib, estadoLib);
				rede.cadastrarLivraria(lib);
				break;
			case "2":
				System.out.println("Cadastrando funcionário em uma livraria...");
				String nomeLivraria = input(sc, "Nome da livraria:");
				Livraria liv = rede.procurarLivraria(nomeLivraria);
				if (liv != null) {
					System.out.println("Preencha as informações do funcionário agora.\n");
					String nomeFunc = input(sc, "Nome do funcionário:");
					String cpfFunc = input(sc, "Cpf do funcionário:");
					String enderecoFunc = input(sc, "Endereço do funcionário:");
					String telefoneFunc = input(sc, "Telefone do funcionário:");
					float salarioFunc = Float.parseFloat(input(sc, "Salário do funcionário:"));
					Funcionario func = new Funcionario(nomeFunc, cpfFunc, enderecoFunc, telefoneFunc, salarioFunc);
					liv.addFuncionario(func);
					System.out.println("Funcionário cadastrado!");
				}
				else {
					System.out.println("Livraria não encontrada!");
				}
				break;
			case "3":
				System.out.println("Definindo gerente em uma livraria...");
				String _nomeLivraria = input(sc, "Nome da livraria:");
				Livraria _liv = rede.procurarLivraria(_nomeLivraria);
				if (_liv != null) {
					System.out.println("Preencha as informações do gerente agora.\n");
					String nomeGer = input(sc, "Nome do gerente:");
					String cpfGer = input(sc, "Cpf do gerente:");
					String enderecoGer = input(sc, "Endereço do gerente:");
					String telefoneGer = input(sc, "Telefone do gerente:");
					float salarioGer = Float.parseFloat(input(sc, ""));
					Gerente ger = new Gerente(nomeGer, cpfGer, enderecoGer, telefoneGer, salarioGer);
					_liv.setGerente(ger);
					System.out.println("Novo gerente definido!");
					System.out.println("======================================");
					System.out.println("Nome: " + _liv.getNome());
					System.out.println("Cidade: " + _liv.getCidade());
					System.out.println("Estado: " + _liv.getEstado());
					System.out.println("gerente: " + _liv.getGerente().getNome());
					System.out.println("======================================\n");
				}
				else {
					System.out.println("Livraria não encontrada!");
				}
				break;
			case "4":
				System.out.println("Adicionando livros em uma livraria...");
				String __nomeLivraria = input(sc, "Nome da livraria:");
				Livraria __liv = rede.procurarLivraria(__nomeLivraria);
				if (__liv != null) {
					System.out.println("Preenchendo informações sobre o novo livro.\n");
					String 	autor 		= input(sc, "Autor do livro:");
					String 	editora 	= input(sc, "Editora do livro:");
					String 	titulo 		= input(sc, "Título do livro:");
					int 	anoEdicao 	= Integer.parseInt(input(sc, "Ano de edição:"));
					System.out.println("Gerando ISBN do livro...");
					try {
						Thread.sleep(700);
					}
					catch (Exception except) {}
					int isbn = 0;
					Random rnd = new Random();
					boolean bStatus = false;
					while (!bStatus) {
						bStatus = true;
						isbn = rnd.nextInt(Integer.MAX_VALUE);
						for (Livro livro : __liv.obterLivros()) {
							if (livro.getIsbn() == isbn) {
								bStatus = false;
							}
						}
					}
					Livro livro = new Livro(autor, isbn, editora, titulo, anoEdicao);
					__liv.addLivro(livro);
					System.out.println("Livro adicionado à livraria.");
					
				}
				else {
					System.out.println("Livraria não encontrada!");
				}
				break;
			case "5":
				System.out.println("Listando livros de uma livraria...");
				String ___nomeLivraria = input(sc, "Nome da livraria:");
				Livraria ___liv = rede.procurarLivraria(___nomeLivraria);
				if (___liv != null) {
					___liv.listarLivros();
				}
				else {
					System.out.println("Livraria não encontrada!");
				}
				break;
			case "6":
				System.out.println("Listando os funcionários de uma livraria...");
				String ____nomeLivraria = input(sc, "Nome da livraria:");
				Livraria ____liv = rede.procurarLivraria(____nomeLivraria);
				if (____liv != null) {
					____liv.listarFuncionarios();
				}
				else {
					System.out.println("Livraria não encontrada!");
				}
				break;
			case "7":
				System.out.println("Listando os gerentes das livrarias cadastradas...\n");
				for (Livraria livraria_ : rede.obterLivrarias()) {
					System.out.println("=========================");
					System.out.println("Livraria: " + livraria_.getNome());
					System.out.println("Gerente: " + livraria_.getGerente().getNome());
					System.out.println("=========================\n");
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
