package Lista2.Questao2;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione\n[1] Para cadastrar produto;\n[2] Para buscar produto pelo nome;\n[3] Para listar todos os produtos;\n[4] Para efetuar a venda de produto;\n[0] Para sair.");
		boolean bFlag = true;
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		while (bFlag) {
			System.out.println("Selecione uma ação [0, 1, 2, 3, 4]...");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("Cadastrando produtos...");
				System.out.println("Digite o nome do produto:");
				String nome = sc.nextLine();
				System.out.println("Digite o preço do produto:");
				float preco = Float.parseFloat(sc.nextLine());
				System.out.println("Gerando código do produto...");
				try {
					Thread.sleep(700);
				}
				catch(Exception except) {}
				int codigo = 0;
				Random rnd = new Random();
				boolean bStatus = false;
				while (!bStatus) {
					bStatus = true;
					codigo = rnd.nextInt(Integer.MAX_VALUE);
					for (Produto prod : produtos) {
						if (prod.getCodigo() == codigo) {
							bStatus = false;
						}
					}
				}
				produtos.add(new Produto(nome, codigo, preco));
				System.out.println("Produto cadastrado!");
				break;
			case "2":
				System.out.println("Pesquisa de produtos por nome...");
				System.out.println("Digite o nome do produto a ser pesquisado:");
				boolean bEncontrado = false;
				String prodNome = sc.nextLine();
				for (Produto prod : produtos) {
					if (prod.getNome().toUpperCase().equals(prodNome.toUpperCase())) {
						System.out.println("Produto encontrado no estoque!\n");
						System.out.println("================================");
						System.out.println("Nome do produto: " + prod.getNome());
						System.out.println("Código do produto: " + prod.getCodigo());
						System.out.println("Preço do produto: R$ " + String.format(Float.toString(prod.getPreco()), ".00"));
						System.out.println("================================\n");
						bEncontrado = true;
					}
				}
				if (bEncontrado == false){
					System.out.println("Nenhum produto com esse nome encontrado...");
				}
				break;
			case "3":
				System.out.println("Listando todos os produtos no estoque...\n");
				boolean bProdutos = false;
				for (Produto prod : produtos) {
					System.out.println("Produto encontrado no estoque!\n");
					System.out.println("================================");
					System.out.println("Nome do produto: " + prod.getNome());
					System.out.println("Código do produto: " + prod.getCodigo());
					System.out.println("Preço do produto: R$ " + String.format(Float.toString(prod.getPreco()), ".00"));
					System.out.println("================================\n");
					bProdutos = true;
				}
				if (bProdutos == false){
					System.out.println("Desculpe, nosso estoque está VAZIO!");
				}
				break;
			case "4":
				System.out.println("Setor de vendas do produto...");
				System.out.println("Digite o nome do produto que desejas comprar:");
				String nomeProd = sc.nextLine();
				boolean bVendido = false;
				for (Produto prod : produtos) {
					if (prod.getNome().toUpperCase().equals(nomeProd.toUpperCase())) {
						produtos.remove(prod);
						System.out.println("Produto vendido...");
						System.out.println("================================");
						System.out.println("Nome do produto vendido: " + prod.getNome());
						System.out.println("Código do produto vendido: " + prod.getCodigo());
						System.out.println("Preço do produto vendido: " + prod.getPreco());
						System.out.println("================================\n");
						System.out.println("Estoque atualizado!");
						bVendido = true;
						break;
					}
				}
				if (bVendido == false) {
					System.out.println("Não encontrado o produto que você quer comprar, lamentamos por isso!");
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
