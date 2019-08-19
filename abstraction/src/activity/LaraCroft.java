package activity;

public class LaraCroft extends Pessoa {

	private String NomePersonagem;
	private String NomeFilme;
	private String Habilidades[];
	private String ExperienciaCombate;
	private String Roupa;
	private String Interprete;
	private String Personalidade;
	private String Equipamentos[];
	private String Passado;
	private String Criador;
	
	public String getNomePersonagem() {
		return NomePersonagem;
	}
	
	public void setNomePersonagem(String nomePersonagem) {
		NomePersonagem = nomePersonagem;
	}
	
	public String getNomeFilme() {
		return NomeFilme;
	}
	
	public void setNomeFilme(String nomeFilme) {
		NomeFilme = nomeFilme;
	}
	
	public String[] getHabilidades() {
		return Habilidades;
	}
	
	public void setHabilidades(String[] habilidades) {
		Habilidades = habilidades;
	}
	
	public String getExperienciaCombate() {
		return ExperienciaCombate;
	}
	
	public void setExperienciaCombate(String experienciaCombate) {
		ExperienciaCombate = experienciaCombate;
	}
	
	public String getRoupa() {
		return Roupa;
	}
	
	public void setRoupa(String roupa) {
		Roupa = roupa;
	}
	
	public String getInterprete() {
		return Interprete;
	}
	
	public void setInterprete(String interprete) {
		Interprete = interprete;
	}
	
	public String getPersonalidade() {
		return Personalidade;
	}
	
	public void setPersonalidade(String personalidade) {
		Personalidade = personalidade;
	}
	
	public String[] getEquipamentos() {
		return Equipamentos;
	}
	
	public void setEquipamentos(String[] equipamentos) {
		Equipamentos = equipamentos;
	}
	
	public String getPassado() {
		return Passado;
	}
	
	public void setPassado(String passado) {
		Passado = passado;
	}
	
	public String getCriador() {
		return Criador;
	}

	public void setCriador(String criador) {
		Criador = criador;
	}

	public void AtirarFlecha() {
		System.out.println(this.getName() + " atirou com seu arco e flechas.");
	}
	
	public void AtirarPedra() {
		System.out.println(this.getName() + " atirou pedras.");
	}
	
	public void Lutar() {
		System.out.println(this.getName() + " iniciou uma luta.");
	}
	
	public void CurarFerida() {
		System.out.println(this.getName() + " usou bandaje para estancar seu sangramento.");
	}
	
	public void SacarArmas() {
		System.out.println(this.getName() + " sacou suas armas.");
	}
	
	public void PendurarEmObjeto() {
		System.out.println(this.getName() +  " está pendurada em um objeto.");
	}
	
	public void EscalarTerreno() {
		System.out.println(this.getName() + " está agora escalando o terreno.");
	}
	
}
