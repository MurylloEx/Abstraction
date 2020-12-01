package Lista2.Questao1;

public class Livro {
	
	private String Autor;
	private String Editora;
	private String Titulo;
	private String DataEdicao;
	private int ISBN;
	
	public Livro(String autor, String editora, String titulo, 
				String dataedicao, int isbn) {
		this.setAutor(autor);
		this.setEditora(editora);
		this.setTitulo(titulo);
		this.setISBN(isbn);
		this.setDataEdicao(dataedicao);
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
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

	public String getDataEdicao() {
		return DataEdicao;
	}

	public void setDataEdicao(String dataEdicao) {
		DataEdicao = dataEdicao;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	
	
}
