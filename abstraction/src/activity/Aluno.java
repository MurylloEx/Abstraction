package activity;

public class Aluno extends Pessoa {

	private short Notas[];
	private String DisciplinasComDificuldade[];
	private String DisciplinasComFacilidade[];
	private short MediaDoSemestre;
	private String PeriodoEscolar;
	private boolean Reprovado;
	private String Esportes[];
	private String NomeEscola;
	
	public short[] getNotas() {
		return Notas;
	}

	public void setNotas(short[] notas) {
		Notas = notas;
	}

	public String[] getDisciplinasComDificuldade() {
		return DisciplinasComDificuldade;
	}

	public void setDisciplinasComDificuldade(String[] disciplinasComDificuldade) {
		DisciplinasComDificuldade = disciplinasComDificuldade;
	}
	
	public String[] getDisciplinasComFacilidade() {
		return DisciplinasComFacilidade;
	}

	public void setDisciplinasComFacilidade(String[] disciplinasComFacilidade) {
		DisciplinasComFacilidade = disciplinasComFacilidade;
	}

	public short getMediaDoSemestre() {
		return MediaDoSemestre;
	}

	public void setMediaDoSemestre(short mediaDoSemestre) {
		MediaDoSemestre = mediaDoSemestre;
	}

	public String getPeriodoEscolar() {
		return PeriodoEscolar;
	}

	public void setPeriodoEscolar(String periodoEscolar) {
		PeriodoEscolar = periodoEscolar;
	}

	public boolean isReprovado() {
		return Reprovado;
	}

	public void setReprovado(boolean reprovado) {
		Reprovado = reprovado;
	}

	public String[] getEsportes() {
		return Esportes;
	}

	public void setEsportes(String[] esportes) {
		Esportes = esportes;
	}
	
	public String getNomeEscola() {
		return NomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		NomeEscola = nomeEscola;
	}

	public void ConversarNaAula() {
		System.out.println(this.getName() + " est� conversando durante a aula de Matem�tica!");
	}
	
	public void FazerAnotacoes() {
		System.out.println(this.getName() + " est� fazendo anota��es em seu caderno...");
	}
	
	public void AbrirLivro(String livro, short pagina) {
		System.out.println(this.getName() + " abriu o livro de " + livro + " na p�gina " + Short.toString(pagina) + ".");
	}
	
	public void FazerBarulho() {
		System.out.println(this.getName() + " est� fazendo muito barulho na aula...");
	}
	
	public void FazerPergunta() {
		System.out.println(this.getName() + " fez uma pergunta sobre fun��es exponenciais...");
	}
	
	public void PaquerarColegaAoLado() {
		System.out.println(this.getName() + " est� paquerando sua coleguinha.");
	}
	
	public void IrAoIntervalo() {
		System.out.println(this.getName() + " foi ao intervalo...");
	}
	
	public void Lanchar() {
		System.out.println(this.getName() + " foi fazer um lanche...");
	}
	
	public void ResponderExercicio() {
		System.out.println(this.getName() + " est� respondendo os exerc�cios propostos na aula...");
	}
	
	public void EscreverComCaneta() {
		System.out.println(this.getName() + " est� fazendo a anota��o de literatura usando a caneta.");
	}
	
	public void EscreverComLapis() {
		System.out.println(this.getName() + " est� fazendo c�lculos com caneta e borracha.");
	}
	
	public void ApagarAnota��o() {
		System.out.println(this.getName() + " apagou parte da anota��o.");
	}
	
	public void ChutarBola() {
		System.out.println(this.getName() + " chutou a bola na educa��o f�sica.");
	}
	
	public void SacarBola() {
		System.out.println(this.getName() + " realizou um saque no jogo de v�lei...");
	}
	
	public void PedirMaterialEmprestado() {
		System.out.println(this.getName() + " disse: Ei, voc�! Me empresta uma borracha, por favor?");
	}
	
	public void JogarBolinhaDePapel() {
		System.out.println(this.getName() + " arremessou uma bolinha de papel na cabe�a do professor de f�sica.");
	}
	
}
