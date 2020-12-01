package Lista6.QuestaoBonus;

public class Livro {

	private String Autor;
	private int Isbn;
	private String Editora;
	private String Titulo;
	private int AnoEdicao;
	
	public Livro(String autor, int isbn, String editora, String titulo, int anoEdicao) {
		this.setAutor(autor);
		this.setIsbn(isbn);
		this.setEditora(editora);
		this.setTitulo(titulo);
		this.setAnoEdicao(anoEdicao);	
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public int getIsbn() {
		return Isbn;
	}
	
	public void setIsbn(int isbn) {
		Isbn = isbn;
	}
	
	public String getEditora() {
		return Editora;
	}
	
	public void setEditora(String editora) {
		Editora = editora;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public int getAnoEdicao() {
		return AnoEdicao;
	}
	
	public void setAnoEdicao(int anoEdicao) {
		AnoEdicao = anoEdicao;
	}
	
}
