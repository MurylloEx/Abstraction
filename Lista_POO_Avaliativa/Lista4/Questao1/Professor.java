package Lista4.Questao1;

public class Professor extends Pessoa{

	private float Salario;
	
	public Professor(String nome, String cpf, String dataNascimento, float salario) {
		super(nome, cpf, dataNascimento);
		this.setSalario(salario);
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
	
}
