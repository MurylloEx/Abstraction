package Lista2.Questao1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar um livro;\n[2] Para buscar um livro pelo título;\n[3] Para listar os livros de um autor;\n[4] Para listar todos os livros;\n[0] Para sair.");
		boolean bFlag = true;

		ArrayList<Livro> livros = new ArrayList<Livro>();

		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando novo livro...\n");
				System.out.println("Digite o nome do autor:");
				String autor = sc.nextLine();
				System.out.println("Digite o título do livro:");
				String titulo = sc.nextLine();
				System.out.println("Digite a editora:");
				String editora = sc.nextLine();
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
						if (liv.getISBN() == isbn) {
							bStatus = false;
						}
					}
				}
				livros.add(new Livro(autor, editora, titulo, dataedicao, isbn));
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
						System.out.println("Autor: " + liv.getAutor());
						System.out.println("Editora: " + liv.getEditora());
						System.out.println("Título: " + liv.getTitulo());
						System.out.println("Data de edição: " + liv.getDataEdicao());
						System.out.println("ISBN: " + liv.getISBN() + "\n");
						System.out.println("=======================================");
						bEncontrado = true;
					}
				}
				if (bEncontrado == false) {
					System.out.println("Desculpe, não encontramos nenhum livro com esse título!");
				}
				break;
			case "3":
				System.out.println("Digite o nome autor do livro para listar suas obras.");
				String nomeAutor = sc.nextLine();
				boolean bAutor = false;
				for (Livro liv : livros) {
					if (liv.getAutor().toUpperCase().equals(nomeAutor.toUpperCase())) {
						System.out.println("=======================================");
						System.out.println("Livro encontrado!\n");
						System.out.println("Autor: " + liv.getAutor());
						System.out.println("Editora: " + liv.getEditora());
						System.out.println("Título: " + liv.getTitulo());
						System.out.println("Data de edição: " + liv.getDataEdicao());
						System.out.println("ISBN: " + liv.getISBN() + "\n");
						System.out.println("=======================================");
						bAutor = true;
					}
				}
				if (bAutor == false) {
					System.out.println("Desculpe, não encontramos livros desse autor!");
				}
				break;
			case "4":
				boolean bContemLivros = false;
				for (Livro liv : livros) {
					System.out.println("=======================================");
					System.out.println("Livro encontrado!\n");
					System.out.println("Autor: " + liv.getAutor());
					System.out.println("Editora: " + liv.getEditora());
					System.out.println("Título: " + liv.getTitulo());
					System.out.println("Data de edição: " + liv.getDataEdicao());
					System.out.println("ISBN: " + liv.getISBN() + "\n");
					System.out.println("=======================================");
					bContemLivros = true;
				}
				if (bContemLivros == false) {
					System.out.println("Nessa biblioteca ainda não há livros cadastrados!");
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
