package activity;

public class ViuvaNegra extends Pessoa{
	
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
	private String Poderes[];

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
	
	public String[] getPoderes() {
		return Poderes;
	}

	public void setPoderes(String[] poderes) {
		Poderes = poderes;
	}
	
	public void Lutar() {
		System.out.println(this.getName() + " iniciou uma luta com suas habilidades em artes marciais...");
	}
	
	public void CurarFerida() {
		System.out.println(this.getName() + " usou bandaje para estancar seu sangramento.");
	}
	
	public void SacarArmas() {
		System.out.println(this.getName() + " sacou suas armas.");
	}
	
	public void HackearSistema() {
		System.out.println(this.getName() + " está hackeando o sistema agora...");
	}
	
	public void ModoFurtivo() {
		System.out.println(this.getName() + " está espionando uma instalação inimiga em modo furtivo...");
	}
	
	public void Seduzir() {
		System.out.println(this.getName() + " está usando sua habilidade de sedução agora...");
	}
	
	public void ElaborarTatica() {
		System.out.println(this.getName() + " elaborou uma tática de combate com a sua inteligência brilhante.");
	}
	
	public void FalarOutroIdioma(String idioma) {
		System.out.println(this.getName() + " está falando em " + idioma.toUpperCase() + ".");
	}
	
	public void UsarPulseira() {
		System.out.println(this.getName() + " ativou sua pulseira e lançou um projétil...");
	}
	
	
}
