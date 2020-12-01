package Lista2.Questao2;

public class Produto {

	private String Nome;
	private int Codigo;
	private float Preco;
	
	public Produto(String nome, int codigo, float preco) {
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setPreco(preco);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}
	
	
	
}
