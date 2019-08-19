package activity;

public class Professor extends Pessoa {
	
	private String DisciplinaMinistrada;
	private String FormacaoAcademica;
	private boolean UsaGiz;
	private boolean UsaPiloto;
	private String NomeEscola;
	private int TempoDeAulas;
	
	public String getDisciplinaMinistrada() {
		return DisciplinaMinistrada;
	}
	
	public void setDisciplinaMinistrada(String disciplinaMinistrada) {
		DisciplinaMinistrada = disciplinaMinistrada;
	}
	
	public String getFormacaoAcademica() {
		return FormacaoAcademica;
	}
	
	public void setFormacaoAcademica(String formacaoAcademica) {
		FormacaoAcademica = formacaoAcademica;
	}
	
	public boolean isUsaGiz() {
		return UsaGiz;
	}
	public void setUsaGiz(boolean usaGiz) {
		UsaGiz = usaGiz;
	}
	
	public boolean isUsaPiloto() {
		return UsaPiloto;
	}
	
	public void setUsaPiloto(boolean usaPiloto) {
		UsaPiloto = usaPiloto;
	}
	
	public String getNomeEscola() {
		return NomeEscola;
	}
	
	public void setNomeEscola(String nomeEscola) {
		NomeEscola = nomeEscola;
	}
	
	public int getTempoDeAulas() {
		return TempoDeAulas;
	}
	
	public void setTempoDeAulas(int tempoDeAulas) {
		TempoDeAulas = tempoDeAulas;
	}
	
	public void PassarExercicios() {
		System.out.println(this.getName() + " deixou uma pilha de exerc�cios para os alunos resolverem.");
	}
	
	public void EscreverNoQuadro() {
		System.out.println(this.getName() + " est� fazendo anota��es no quadro.");
	}
	
	public void PedirSilencio() {
		System.out.println(this.getName() + " est� pedindo sil�ncio � turma.");
	}
	
	public void SolicitarSaidaDeSala(String nomeAluno) {
		System.out.println(this.getName() + " pediu para que o aluno " + nomeAluno.toUpperCase() + " sa�sse de sala.");
	}
	
	public void AplicarProva() {
		System.out.println(this.getName() + " est� agora aplicando prova de f�sica.");
	}
	
}