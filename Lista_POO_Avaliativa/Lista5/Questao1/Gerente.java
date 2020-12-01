package Lista5.Questao1;

public class Gerente extends Funcionario implements Trabalhador{

	public Gerente(String nome, String cpf, String dataNascimento, float salario) {
		super(nome, cpf, dataNascimento, salario);
	}

	@Override
	public float calcularSalario() {
		return this.getSalario() + 1500;
	}

}