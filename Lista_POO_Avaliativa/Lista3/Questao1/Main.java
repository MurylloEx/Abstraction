package Lista3.Questao1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar um livro;\n[2] Para buscar um livro pelo título;\n[3] Para listar livros por autor;\n[4] Para listar todos os livros;\n[0] Para sair.");
		boolean bFlag = true;
		
		ArrayList<Livro> livros = new ArrayList<Livro>();
		
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando novo livro...\n");
				System.out.println("Digite o nome do autor:");
				String nomeAutor = sc.nextLine();
				System.out.println("Digite o endereço do autor:");
				String enderecoAutor = sc.nextLine();
				System.out.println("Digite CPF do autor:");
				String cpfAutor = sc.nextLine();
				System.out.println("Digite o título do livro:");
				String titulo = sc.nextLine();
				System.out.println("Digite o telefone do autor:");
				String telefoneAutor = sc.nextLine();
				System.out.println("Digite a editora:");
				String nomeEditora = sc.nextLine();
				System.out.println("Digite o CNPJ da editora:");
				String cnpjEditora = sc.nextLine();
				System.out.println("Digite o endereço da editora:");
				String enderecoEditora = sc.nextLine();
				System.out.println("Digite o telefone da editora:");
				String telefoneEditora = sc.nextLine();
				System.out.println("Digite a data de edição:");
				String dataedicao = sc.nextLine();
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
					for (Livro liv : livros) {
						if (liv.getIsbn() == isbn) {
							bStatus = false;
						}
					}
				}
				
				Autor autor = new Autor(nomeAutor, enderecoAutor, telefoneAutor, cpfAutor);
				Editora editora = new Editora(nomeEditora, enderecoEditora, telefoneEditora, cnpjEditora);
				
				livros.add(new Livro(autor, editora, isbn, titulo, dataedicao));
				System.out.println("Livro cadastrado!");
				break;
			case "2":
				System.out.println("Digite o título do livro para ser pesquisado.");
				String title = sc.nextLine();
				boolean bEncontrado = false;
				for (Livro liv : livros) {
					if (liv.getTitulo().toUpperCase().equals(title.toUpperCase())) {
						System.out.println("=======================================");
						System.out.println("Livro encontrado!\n");
						System.out.println("Autor: " + liv.getAutor().getNome());
						System.out.println("Cpf do autor: " + liv.getAutor().getCpf());
						System.out.println("Endereço do autor: " + liv.getAutor().getEndereco());
						System.out.println("Telefone do autor: " + liv.getAutor().getTelefone());
						System.out.println("Editora: " + liv.getEditora().getNome());
						System.out.println("Cnpj da editora: " + liv.getEditora().getCnpj());
						System.out.println("Endereço da editora: " + liv.getEditora().getEndereco());
						System.out.println("Telefone da editora: " + liv.getEditora().getTelefone());
						System.out.println("Título: " + liv.getTitulo());
						System.out.println("Data de edição: " + liv.getDataEdicao());
						System.out.println("ISBN: " + liv.getIsbn() + "\n");
						System.out.println("=======================================");
						bEncontrado = true;
					}
				}
				if (bEncontrado == false) {
					System.out.println("Desculpe, não encontramos nenhum livro com esse título!");
				}
				break;
			case "3":
				System.out.println("Digite o nome do autor para ver suas obras...");
				String ___autor = sc.nextLine();
				boolean _bEncontrado = false;
				for (Livro liv : livros) {
					if (liv.getAutor().getNome().toUpperCase().equals(___autor.toUpperCase())) {
						System.out.println("=======================================");
						System.out.println("Livro encontrado!\n");
						System.out.println("Autor: " + liv.getAutor().getNome());
						System.out.println("Cpf do autor: " + liv.getAutor().getCpf());
						System.out.println("Endereço do autor: " + liv.getAutor().getEndereco());
						System.out.println("Telefone do autor: " + liv.getAutor().getTelefone());
						System.out.println("Editora: " + liv.getEditora().getNome());
						System.out.println("Cnpj da editora: " + liv.getEditora().getCnpj());
						System.out.println("Endereço da editora: " + liv.getEditora().getEndereco());
						System.out.println("Telefone da editora: " + liv.getEditora().getTelefone());
						System.out.println("Título: " + liv.getTitulo());
						System.out.println("Data de edição: " + liv.getDataEdicao());
						System.out.println("ISBN: " + liv.getIsbn() + "\n");
						System.out.println("=======================================");
						_bEncontrado = true;
					}
				}
				if (_bEncontrado == false) {
					System.out.println("Desculpe, não encontramos nenhum livro desse autor!");
				}
				break;
			case "4":
				boolean __bEncontrado = false;
				for (Livro liv : livros) {
					System.out.println("=======================================");
					System.out.println("Livro encontrado!\n");
					System.out.println("Autor: " + liv.getAutor().getNome());
					System.out.println("Cpf do autor: " + liv.getAutor().getCpf());
					System.out.println("Endereço do autor: " + liv.getAutor().getEndereco());
					System.out.println("Telefone do autor: " + liv.getAutor().getTelefone());
					System.out.println("Editora: " + liv.getEditora().getNome());
					System.out.println("Cnpj da editora: " + liv.getEditora().getCnpj());
					System.out.println("Endereço da editora: " + liv.getEditora().getEndereco());
					System.out.println("Telefone da editora: " + liv.getEditora().getTelefone());
					System.out.println("Título: " + liv.getTitulo());
					System.out.println("Data de edição: " + liv.getDataEdicao());
					System.out.println("ISBN: " + liv.getIsbn() + "\n");
					System.out.println("=======================================");
					_bEncontrado = true;
				}
				if (__bEncontrado == false) {
					System.out.println("Desculpe, não encontramos livros nessa biblioteca.");
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
