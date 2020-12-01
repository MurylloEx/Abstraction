package Lista4.Questao4;

public class Apartamento extends Imovel {

	private String NomePredio;
	
	public Apartamento(String nomePredio, String rua, int numero, String bairro, String cidade, String estado, String cep, float preco,
			boolean alugado, boolean mobiliado) {
		super(rua, numero, bairro, cidade, estado, cep, preco, alugado, mobiliado);
	}

	public String getNomePredio() {
		return NomePredio;
	}

	public void setNomePredio(String nomePredio) {
		NomePredio = nomePredio;
	}
	
}
