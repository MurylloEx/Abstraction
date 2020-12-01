package Lista4.Questao4;

import java.util.ArrayList;

public class Imobiliaria {

	private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	
	public void registrarCasa(Casa casa) {
		imoveis.add(casa);
	}
	
	public void registrarApartamento(Apartamento apt) {
		imoveis.add(apt);
	}
	
	public void listarImoveisAlugados(boolean alugados, String rua) {
		for (Imovel imovel : imoveis) {
			if (imovel.isAlugado() == alugados && imovel.getRua().toUpperCase().equals(rua.toUpperCase())) {
				System.out.println("=============================");
				if (imovel instanceof Apartamento) {
					System.out.println("Nome do prédio: " + ((Apartamento)imovel).getNomePredio());
				}
				System.out.println("Nome da rua: " + imovel.getRua());
				System.out.println("Número: " + imovel.getNumero());
				System.out.println("Bairro: " + imovel.getBairro());
				System.out.println("Cidade: " + imovel.getCidade());
				System.out.println("Estado: " + imovel.getEstado());
				System.out.println("Cep: " + imovel.getCep());
				System.out.println("Preço: R$ " + imovel.getPreco());
				System.out.println("Está alugado? " + (imovel.isAlugado() ? "Sim" : "Não"));
				System.out.println("Está mobiliado? " + (imovel.isMobiliado() ? "Sim" : "Não"));
				System.out.println("=============================\n");
			}
		}
	}
	
	public void listarImoveisMobiliados(boolean mobiliados) {
		for (Imovel imovel : imoveis) {
			if (imovel.isMobiliado() == mobiliados) {
				System.out.println("=============================");
				if (imovel instanceof Apartamento) {
					System.out.println("Nome do prédio: " + ((Apartamento)imovel).getNomePredio());
				}
				System.out.println("Nome da rua: " + imovel.getRua());
				System.out.println("Número: " + imovel.getNumero());
				System.out.println("Bairro: " + imovel.getBairro());
				System.out.println("Cidade: " + imovel.getCidade());
				System.out.println("Estado: " + imovel.getEstado());
				System.out.println("Cep: " + imovel.getCep());
				System.out.println("Preço: R$ " + imovel.getPreco());
				System.out.println("Está alugado? " + (imovel.isAlugado() ? "Sim" : "Não"));
				System.out.println("Está mobiliado? " + (imovel.isMobiliado() ? "Sim" : "Não"));
				System.out.println("=============================\n");
			}
		}
	}
	
}
