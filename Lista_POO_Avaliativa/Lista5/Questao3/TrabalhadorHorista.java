package Lista5.Questao3;

public class TrabalhadorHorista extends Trabalhador {

	private float TotalHoras;
	private float SalarioHora;
	
	public TrabalhadorHorista(String nome, int cadastro, int idade, String endereco, float totalHoras,
			float salarioHora) {
		super(nome, cadastro, idade, endereco);
		TotalHoras = totalHoras;
		SalarioHora = salarioHora;
	}
	
	@Override
	public float getSalario() {
		return TotalHoras * SalarioHora;
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
