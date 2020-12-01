package Lista2.Questao3;

public abstract class Pessoa {

	protected String Nome;
	protected String Cpf;
	
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
