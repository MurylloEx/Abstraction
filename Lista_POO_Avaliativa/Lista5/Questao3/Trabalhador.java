package Lista5.Questao3;

public abstract class Trabalhador {

	private String Nome;
	private int Cadastro;
	protected float Salario;
	private int Idade;
	private String Endereco;
	
	public Trabalhador(String nome, int cadastro,
			int idade, String endereco) {
		this.setNome(nome);
		this.setCadastro(cadastro);
		this.setIdade(idade);
		this.setEndereco(endereco);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCadastro() {
		return Cadastro;
	}

	public void setCadastro(int cadastro) {
		Cadastro = cadastro;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
	
	public abstract float getSalario();
	
}
