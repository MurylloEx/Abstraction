package Lista4.Questao3;

public class Gerente extends Funcionario implements Trabalhador {

	public Gerente(String nome, String cpf, String dataNascimento, float salario) {
		super(nome, cpf, dataNascimento, salario);
	}

	public float calcularSalario() {
		return this.getSalario() + 2000;
	}
	
}
