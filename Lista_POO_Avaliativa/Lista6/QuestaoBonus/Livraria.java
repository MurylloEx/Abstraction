package Lista6.QuestaoBonus;

import java.util.ArrayList;

public class Livraria extends Entidade {

	private String Cidade;
	private String Estado;
	private Gerente Gerente;
	private ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Livro> Livros = new ArrayList<Livro>();
	
	public Livraria(String nome, String cidade, String estado) {
		super(nome);
		this.setCidade(cidade);
		this.setEstado(estado);
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

	public Gerente getGerente() {
		return Gerente;
	}

	public void setGerente(Gerente gerente) {
		Gerente = gerente;
	}
	
	public void addFuncionario(Funcionario func) {
		Funcionarios.add(func);
	}
	
	public void addLivro(Livro livro) {
		Livros.add(livro);
	}
	
	public void listarLivros() {
		for (Livro liv : Livros) {
			System.out.println("=========================================");
			System.out.println("Autor: " + liv.getAutor());
			System.out.println("Título: " + liv.getTitulo());
			System.out.println("ISBN: " + liv.getIsbn());
			System.out.println("Editora: " + liv.getEditora());
			System.out.println("Ano de edição: " + liv.getAnoEdicao());
			System.out.println("=========================================\n");
		}
	}
	
	public void listarFuncionarios() {
		for (Funcionario func : Funcionarios) {
			System.out.println("=========================================");
			System.out.println("Nome: " + func.getNome());
			System.out.println("Cpf: " + func.getCpf());
			System.out.println("Endereço: " + func.getEndereco());
			System.out.println("Telefone: " + func.getTelefone());
			System.out.println("Salário: R$ " + func.calcularSalario());
			System.out.println("=========================================\n");			
		}
	}
	
	public ArrayList<Livro> obterLivros(){
		return Livros;
	}
	
}
