package Lista3.Questao1;

public class Editora extends Pessoa {

	private String Cnpj;
	
	public Editora(String nome, String endereco, String telefone, String cnpj) {
		super(nome, endereco, telefone);
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	
}
