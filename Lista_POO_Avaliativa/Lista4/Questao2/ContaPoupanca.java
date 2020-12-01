package Lista4.Questao2;

public class ContaPoupanca extends Conta implements Manutencao {

	public ContaPoupanca(int numero, float taxa, float saldo, String banco) {
		super(numero, taxa, saldo, banco);
	}

	@Override
	public void Atualizar() {
		Saldo += Taxa;
	}

	@Override
	public boolean sacar(float valor) {
		if (valor > 0) {
			Saldo -= valor;
			this.Atualizar();
			return true;
		}
		return false;
	}

	@Override
	public void depositar(float valor) {
		if (valor > 0) {
			Saldo += valor;
			System.out.println("Depósito feito!");
			this.Atualizar();
		}
	}

}
