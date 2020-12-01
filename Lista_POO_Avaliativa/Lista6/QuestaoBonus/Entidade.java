package Lista6.QuestaoBonus;

public abstract class Entidade {

	private String Nome;
	
	public Entidade(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
}
