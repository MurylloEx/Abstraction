package Lista4.Questao2;

public abstract class Conta {

	protected int Numero;
	protected float Taxa;
	protected float Saldo;
	protected String Banco;
	
	public Conta(int numero, float taxa, float saldo, String banco) {
		this.setNumero(numero);
		this.setTaxa(taxa);
		this.setSaldo(saldo);
		this.setBanco(banco);
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
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
	
	public abstract boolean sacar(float valor);
	public abstract void depositar(float valor);
}
