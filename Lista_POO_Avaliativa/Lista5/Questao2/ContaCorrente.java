package Lista5.Questao2;

public class ContaCorrente extends Conta {

	public ContaCorrente(String cpfCliente, float taxa, float saldo, String banco) {
		super(cpfCliente, taxa, saldo, banco);
	}

	@Override
	public boolean Atualizar() {
		if (this.getSaldo() >= 0.3f) {
			System.out.println("Taxa atualizada na conta!");
			this.setSaldo(this.getSaldo() - 0.3f);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean Sacar(float valor) {
		if (valor + 0.3f <= this.getSaldo()) {
			if (Atualizar() == true) {
				this.setSaldo(getSaldo() - (valor + 0.3f));
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Override
	public void Depositar(float valor) {
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}
	}
	
}