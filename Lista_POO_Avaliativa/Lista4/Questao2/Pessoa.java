package Lista4.Questao2;

public abstract class Pessoa {

	private String Nome;
	
	public Pessoa(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
}
