package animais.reino;

public abstract class Animalia {
	
	private String Nome;
	private float TempoVida;
	private String Habitat;
	private String LocalFeto;
	private String Alimento;
	private boolean Heterotrofo;
	private boolean Autotrofo;
	
	public Animalia(String nome, float tempoVida, String habitat, String localFeto, String alimento, boolean heterotrofo, boolean autotrofo) {
		this.Nome = nome;
		this.TempoVida = tempoVida;
		this.Habitat = habitat;
		this.LocalFeto = localFeto;
		this.Alimento = alimento;
		this.Heterotrofo = heterotrofo;
		this.Autotrofo = autotrofo;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public float getTempoVida() {
		return TempoVida;
	}
	
	public void setTempoVida(float tempoVida) {
		TempoVida = tempoVida;
	}
	
	public String getHabitat() {
		return Habitat;
	}
	
	public void setHabitat(String habitat) {
		Habitat = habitat;
	}
	
	public String getLocalFeto() {
		return LocalFeto;
	}
	
	public void setLocalFeto(String localFeto) {
		LocalFeto = localFeto;
	}
	
	public String getAlimento() {
		return Alimento;
	}
	
	public void setAlimento(String alimento) {
		Alimento = alimento;
	}
	
	public boolean isHeterotrofo() {
		return Heterotrofo;
	}

	public void setHeterotrofo(boolean heterotrofo) {
		Heterotrofo = heterotrofo;
	}

	public boolean isAutotrofo() {
		return Autotrofo;
	}

	public void setAutotrofo(boolean autotrofo) {
		Autotrofo = autotrofo;
	}

	public abstract void Respirar();
	public abstract void Comunicar();
	public abstract void Descansar();
	
}