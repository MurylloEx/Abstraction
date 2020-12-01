package Lista4.Questao2;

public class Cliente extends Pessoa{

	private String Cpf;
	private ContaCorrente ContaCorrente;
	private ContaPoupanca ContaPoupanca;
	
	public Cliente(String nome, String cpf, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
		super(nome);
		this.setCpf(cpf);
		this.setContaCorrente(contaCorrente);
		this.setContaPoupanca(contaPoupanca);
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public ContaCorrente getContaCorrente() {
		return ContaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		ContaCorrente = contaCorrente;
	}

	public ContaPoupanca getContaPoupanca() {
		return ContaPoupanca;
	}

	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		ContaPoupanca = contaPoupanca;
	}
	
}
