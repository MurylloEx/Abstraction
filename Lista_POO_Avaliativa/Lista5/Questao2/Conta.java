package Lista5.Questao2;

public abstract class Conta {

	protected int Numero;
	protected String CpfCliente;
	protected float Taxa;
	protected float Saldo;
	protected String Banco;
	
	public Conta(String cpfCliente, float taxa, float saldo, String banco) {
		this.setCpfCliente(cpfCliente);
		this.setTaxa(taxa);
		this.setSaldo(saldo);
		this.setBanco(banco);
	}

	public String getCpfCliente() {
		return CpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		CpfCliente = cpfCliente;
	}

	public float getTaxa() {
		return Taxa;
	}

	public void setTaxa(float taxa) {
		Taxa = taxa;
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public abstract boolean Atualizar();
	public abstract boolean Sacar(float valor);
	public abstract void Depositar(float valor);
	
}
