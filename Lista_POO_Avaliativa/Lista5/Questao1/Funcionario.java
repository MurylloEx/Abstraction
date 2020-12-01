package Lista5.Questao1;

public class Funcionario extends Pessoa implements Trabalhador{

	private float Salario;
	
	public Funcionario(String nome, String cpf, String dataNascimento, float salario) {
		super(nome, cpf, dataNascimento);
		this.setSalario(salario);
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	@Override
	public float calcularSalario() {
		return this.getSalario();
	}
	
}