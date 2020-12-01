package Lista3.Questao1;

public class Autor extends Pessoa{

	private String Cpf;
	
	public Autor(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

}
