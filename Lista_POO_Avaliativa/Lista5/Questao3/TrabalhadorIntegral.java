package Lista5.Questao3;

public class TrabalhadorIntegral extends Trabalhador {
	
	private float TotalHoras;
	private float SalarioHora;
	
	public TrabalhadorIntegral(String nome, int cadastro, int idade, 
			String endereco, float totalHoras, float salarioHora) {
		super(nome, cadastro, idade, endereco);
		TotalHoras = totalHoras;
		SalarioHora = salarioHora;
	}

	@Override
	public float getSalario() {
		if (this.getIdade() <= 30) {
			return 1.16f * TotalHoras * SalarioHora;
		}
		else {
			return 1.25f * TotalHoras * SalarioHora;
		}
	}

	public float getTotalHoras() {
		return TotalHoras;
	}

	public void setTotalHoras(float totalHoras) {
		TotalHoras = totalHoras;
	}

	public float getSalarioHora() {
		return SalarioHora;
	}

	public void setSalarioHora(float salarioHora) {
		SalarioHora = salarioHora;
	}
	
}