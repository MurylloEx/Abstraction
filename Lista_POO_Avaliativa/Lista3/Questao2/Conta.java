package Lista3.Questao2;

public class Conta {

	private int Numero;
	private Banco Banco;
	private Cliente Cliente;
	private float Saldo;
	
	public Conta(int numero, Banco banco, Cliente cliente, float saldo) {
		this.setNumero(numero);
		this.setBanco(banco);
		this.setCliente(cliente);
		this.setSaldo(saldo);
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public Banco getBanco() {
		return Banco;
	}

	public void setBanco(Banco banco) {
		Banco = banco;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	public boolean efetuarDeposito(float valor) {
		if (valor > 0) {
			Saldo += valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean efetuarSaque(float valor) {
		if (valor > Saldo) {
			return false;
		}
		else {
			Saldo -= valor;
			return true;
		}
	}
	
}
