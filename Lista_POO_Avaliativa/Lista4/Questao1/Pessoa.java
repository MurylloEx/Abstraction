package Lista4.Questao1;

public abstract class Pessoa {

	private String Nome;
	private String Cpf;
	private String DataNascimento;
	
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
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

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
}
