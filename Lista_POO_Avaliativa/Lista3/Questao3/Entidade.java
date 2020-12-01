package Lista3.Questao3;

public abstract class Entidade {

	protected String Nome;
	
	public Entidade(String nome) {
		this.setNome(nome);
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
}
