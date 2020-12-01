package Lista3.Questao2;

public abstract class Pessoa {

	private String Nome;
	private String Cpf;
	
	public Pessoa(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
}
