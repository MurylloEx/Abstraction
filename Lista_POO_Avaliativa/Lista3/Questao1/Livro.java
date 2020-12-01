package Lista3.Questao1;

public class Livro {

	private Autor Autor;
	private Editora Editora;
	private int Isbn;
	private String Titulo;
	private String DataEdicao;
	
	public Livro(Autor autor, Editora editora, int isbn, String titulo, String dataEdicao) {
		this.setAutor(autor);
		this.setEditora(editora);
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setDataEdicao(dataEdicao);
	}

	public Autor getAutor() {
		return Autor;
	}

	public void setAutor(Autor autor) {
		Autor = autor;
	}

	public Editora getEditora() {
		return Editora;
	}

	public void setEditora(Editora editora) {
		Editora = editora;
	}

	public int getIsbn() {
		return Isbn;
	}

	public void setIsbn(int isbn) {
		Isbn = isbn;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDataEdicao() {
		return DataEdicao;
	}

	public void setDataEdicao(String dataEdicao) {
		DataEdicao = dataEdicao;
	}
	
}
