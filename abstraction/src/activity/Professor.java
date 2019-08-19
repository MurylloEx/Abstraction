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
		System.out.println(this.getName() + " deixou uma pilha de exercícios para os alunos resolverem.");
	}
	
	public void EscreverNoQuadro() {
		System.out.println(this.getName() + " está fazendo anotações no quadro.");
	}
	
	public void PedirSilencio() {
		System.out.println(this.getName() + " está pedindo silêncio à turma.");
	}
	
	public void SolicitarSaidaDeSala(String nomeAluno) {
		System.out.println(this.getName() + " pediu para que o aluno " + nomeAluno.toUpperCase() + " saísse de sala.");
	}
	
	public void AplicarProva() {
		System.out.println(this.getName() + " está agora aplicando prova de física.");
	}
	
}