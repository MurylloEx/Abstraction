package Lista3.Questao3;

import java.util.ArrayList;

public class Turma extends Entidade {

	private int Codigo;
	private ArrayList<Estudante> Estudantes;
	
	public Turma(int codigo, String nome) {
		super(nome);
		this.setCodigo(codigo);
		Estudantes = new ArrayList<Estudante>();
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public ArrayList<Estudante> getEstudantes() {
		return Estudantes;
	}

	public void addEstudante(Estudante estudante) {
		Estudantes.add(estudante);
	}
	
}
