package activity;

/*
Nome
Idade
Gênero
Cidade
Estado
País
CPF
RG
Telefone
Email
Massa
Altura
IMC
QI
Estado Civil
Pai
Mãe
Filhos[]
Profissão
Posição X
Posição Y
Posição Z
Instante Geométrico
Salário
Cônjuge
Nome da Empresa
Doenças[]
Crimes[]
Renda Anual
Ensino Fundamental
Ensino Médio
Graduação
Cor da pele
Batimentos por minuto
Pressão arterial
Idiomas
*/
public class Pessoa {

	private String Name;
	private int Idade;
	private int Genero;
	private String Cidade;
	private String Estado;
	private String Pais;
	private String Endereco;
	private short CPF[];
	private short RG[];
	private int Telefone[];
	private String Email;
	private float Massa;
	private float Altura;
	private double IMC;
	private int QI;
	private boolean EstadoCivil;
	private Pessoa Pai;
	private Pessoa Mae;
	private Pessoa Filhos[];
	private String Profissao;
	private long PosX;
	private long PosY;
	private long PosZ;
	private long Instante;
	private double Salario;
	private Pessoa Conjuge;
	private String NomeEmpresa;
	private String Doenças[];
	private String Crimes[];
	private double RendaAnual;
	private boolean EnsinoFundamental;
	private boolean EnsinoMedio;
	private boolean Graduaçao;
	private CorPele CorDaPele;
	private short BatimentosPorMinuto;
	private float PressaoArterial;
	private String Idiomas[];
	private float Temperatura;

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public int getGenero() {
		return Genero;
	}
	
	public void setGenero(int genero) {
		Genero = genero;
	}
	
	public String getCidade() {
		return Cidade;
	}
	
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	
	public String getEstado() {
		return Estado;
	}
	
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String getPais() {
		return Pais;
	}
	
	public void setPais(String pais) {
		Pais = pais;
	}
	
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public short[] getCPF() {
		return CPF;
	}
	
	public void setCPF(short[] cPF) {
		CPF = cPF;
	}
	
	public short[] getRG() {
		return RG;
	}
	
	public void setRG(short[] rG) {
		RG = rG;
	}
	
	public int[] getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(int[] telefone) {
		Telefone = telefone;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public float getMassa() {
		return Massa;
	}
	
	public void setMassa(float massa) {
		Massa = massa;
	}
	
	public float getAltura() {
		return Altura;
	}
	
	public void setAltura(float altura) {
		Altura = altura;
	}
	
	public double getIMC() {
		return IMC;
	}
	
	public void setIMC(double iMC) {
		IMC = iMC;
	}
	
	public int getQI() {
		return QI;
	}
	
	public void setQI(int qI) {
		QI = qI;
	}
	
	public boolean isEstadoCivil() {
		return EstadoCivil;
	}
	
	public void setEstadoCivil(boolean estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	
	public Pessoa getPai() {
		return Pai;
	}
	
	public void setPai(Pessoa pai) {
		Pai = pai;
	}
	
	public Pessoa getMae() {
		return Mae;
	}
	
	public void setMae(Pessoa mae) {
		Mae = mae;
	}
	
	public Pessoa[] getFilhos() {
		return Filhos;
	}
	
	public void setFilhos(Pessoa[] filhos) {
		Filhos = filhos;
	}
	
	public String getProfissao() {
		return Profissao;
	}
	
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	
	public long getPosX() {
		return PosX;
	}
	
	public void setPosX(long posX) {
		PosX = posX;
	}
	
	public long getPosY() {
		return PosY;
	}
	
	public void setPosY(long posY) {
		PosY = posY;
	}
	
	public long getPosZ() {
		return PosZ;
	}
	
	public void setPosZ(long posZ) {
		PosZ = posZ;
	}
	
	public long getInstante() {
		return Instante;
	}
	
	public void setInstante(long instante) {
		Instante = instante;
	}
	
	public double getSalario() {
		return Salario;
	}
	
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public Pessoa getConjuge() {
		return Conjuge;
	}
	
	public void setConjuge(Pessoa conjuge) {
		Conjuge = conjuge;
	}
	
	public String getNomeEmpresa() {
		return NomeEmpresa;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		NomeEmpresa = nomeEmpresa;
	}
	
	public String[] getDoenças() {
		return Doenças;
	}
	
	public void setDoenças(String[] doenças) {
		Doenças = doenças;
	}
	
	public String[] getCrimes() {
		return Crimes;
	}
	
	public void setCrimes(String[] crimes) {
		Crimes = crimes;
	}
	public double getRendaAnual() {
		return RendaAnual;
	}
	
	public void setRendaAnual(double rendaAnual) {
		RendaAnual = rendaAnual;
	}
	
	public boolean isEnsinoFundamental() {
		return EnsinoFundamental;
	}
	
	public void setEnsinoFundamental(boolean ensinoFundamental) {
		EnsinoFundamental = ensinoFundamental;
	}
	
	public boolean isEnsinoMedio() {
		return EnsinoMedio;
	}
	
	public void setEnsinoMedio(boolean ensinoMedio) {
		EnsinoMedio = ensinoMedio;
	}
	
	public boolean isGraduaçao() {
		return Graduaçao;
	}
	
	public void setGraduaçao(boolean graduaçao) {
		Graduaçao = graduaçao;
	}
	
	public CorPele getCorDaPele() {
		return CorDaPele;
	}
	
	public void setCorDaPele(CorPele corDaPele) {
		CorDaPele = corDaPele;
	}
	
	public short getBatimentosPorMinuto() {
		return BatimentosPorMinuto;
	}
	
	public void setBatimentosPorMinuto(short batimentosPorMinuto) {
		BatimentosPorMinuto = batimentosPorMinuto;
	}
	
	public float getPressaoArterial() {
		return PressaoArterial;
	}
	
	public void setPressaoArterial(float pressaoArterial) {
		PressaoArterial = pressaoArterial;
	}
	
	public String[] getIdiomas() {
		return Idiomas;
	}
	
	public void setIdiomas(String[] idiomas) {
		Idiomas = idiomas;
	}
	
	public float getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(float temperatura) {
		Temperatura = temperatura;
	}
	
	public void Respirar() {
		System.out.println(this.getName() + " está respirando ofegante.");
	}
	
	public void Pulsar() {
		System.out.println(this.getName() + " tem pulsação.");
	}
	
	public void Andar() {
		System.out.println(this.getName() + " andou.");
	}
	
	public void VirarEsquerda() {
		System.out.println(this.getName() + " virou à esquerda.");
	}
	
	public void VirarDireita() {
		System.out.println(this.getName() + " virou à direita.");
	}
	
	public void Correr() {
		System.out.println(this.getName() + " está correndo.");
	}
	
	public void Espirrar() {
		System.out.println(this.getName() + " espirrou.");
	}
	
	public void Tossir() {
		System.out.println(this.getName() + " tossiu.");
	}
	
	public void Urinar() {
		System.out.println(this.getName() + " urinou.");
	}
	
	public void Defecar() {
		System.out.println(this.getName() + " defecou.");
	}
	
	public void Beber() {
		System.out.println(this.getName() + " bebeu.");
	}
	
	public void Comer() {
		System.out.println(this.getName() + " comeu.");
	}
	
	public void Ler() {
		System.out.println(this.getName() + " está lendo um livro.");
	}
	
	public void Assistir() {
		System.out.println(this.getName() + " está assistindo televisão.");
	}
	
	public void Dançar() {
		System.out.println(this.getName() + " está dançando.");
	}
	
	public void Pular() {
		System.out.println(this.getName() + " pulou.");
	}
	
	public void Agachar() {
		System.out.println(this.getName() + " está agachado(a).");
	}
	
	public void OlharParaCima() {
		System.out.println(this.getName() + " está olhando para cima.");
	}
	
	public void Cuspir() {
		System.out.println(this.getName() + " cuspiu.");
	}
	
	public void Falar(String texto) {
		System.out.println(this.getName() + " falou: " + texto);
	}
	
	public void Sussurrar(String texto) {
		System.out.println(this.getName() + " sussurrou: " + texto);
	}
	
	public void Dirigir() {
		System.out.println(this.getName() + " está dirigindo um carro.");
	}
	
	public void Cozinhar() {
		System.out.println(this.getName() + " cozinhou um alimento.");
	}
	
	public void Socar() {
		System.out.println(this.getName() + " deu um soco em alguém.");
	}
	
	public void Empurrar() {
		System.out.println(this.getName() + " empurrou alguém.");
	}
	
	public void Chorar() {
		System.out.println(this.getName() + " está chorando ;(");
	}
	
}