package Lista6.QuestaoBonus;

public class Funcionario extends Entidade implements Trabalhador {

	private String Cpf;
	private String Endereco;
	private String Telefone;
	protected float Salario;
	
	
	public Funcionario(String nome, String cpf, String endereco, String telefone, float salario) {
		super(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setSalario(salario);
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	public void setSalario(float salario) {
		Salario = salario;
	}

	@Override
	public float calcularSalario() {
		return this.Salario;
	}

}
