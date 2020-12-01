package Lista6.QuestaoBonus;

public class Gerente extends Funcionario implements Trabalhador {

	public Gerente(String nome, String cpf, String endereco, String telefone, float salario) {
		super(nome, cpf, endereco, telefone, salario);
	}

	@Override
	public float calcularSalario() {
		return this.Salario;
	}

}