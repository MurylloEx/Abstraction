package Lista4.Questao3;

public class Funcionario implements Trabalhador{

	private String Nome;
	private String Cpf; 
	private String DataNascimento;
	private float Salario;
	
	public Funcionario(String nome, String cpf, String dataNascimento, float salario) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setSalario(salario);
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

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	@Override
	public float calcularSalario() {
		return Salario;
	}
	
}
