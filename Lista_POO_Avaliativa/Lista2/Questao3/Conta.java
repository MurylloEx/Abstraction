package Lista2.Questao3;

public class Conta {

	private int Numero;
	private int Agencia;
	private Cliente Cliente;
	private float Saldo;
	
	public Conta(int numero, int agencia, Cliente cliente, float saldo) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setCliente(cliente);
		this.setSaldo(saldo);
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public int getAgencia() {
		return Agencia;
	}

	public void setAgencia(int agencia) {
		Agencia = agencia;
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
