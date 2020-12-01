package Lista4.Questao1;

public class Aluno extends Pessoa {

	private float Nota1;
	private float Nota2;
	private float Nota3;
	private float Nota4;
	
	public Aluno(String nome, String cpf, String dataNascimento,
			float nota1, float nota2, float nota3, float nota4) {
		super(nome, cpf, dataNascimento);
		this.setNota1(nota1);
		this.setNota2(nota2);
		this.setNota3(nota3);
		this.setNota4(nota4);
	}
	
	public float getNota1() {
		return Nota1;
	}
	public void setNota1(float nota1) {
		Nota1 = nota1;
	}
	public float getNota2() {
		return Nota2;
	}
	public void setNota2(float nota2) {
		Nota2 = nota2;
	}
	public float getNota3() {
		return Nota3;
	}
	public void setNota3(float nota3) {
		Nota3 = nota3;
	}
	public float getNota4() {
		return Nota4;
	}
	public void setNota4(float nota4) {
		Nota4 = nota4;
	}
	
	public float tirarMedia() {
		return (Nota1 + Nota2 + Nota3 + Nota4)/4;
	}
	
}