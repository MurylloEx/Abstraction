package Lista3.Questao2;

public class Banco {

	private int NumeroAgencia;
	private String NomeAgencia;
	
	public Banco(int numeroAgencia, String nomeAgencia) {
		this.setNumeroAgencia(numeroAgencia);
		this.setNomeAgencia(nomeAgencia);
	}

	public int getNumeroAgencia() {
		return NumeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		NumeroAgencia = numeroAgencia;
	}

	public String getNomeAgencia() {
		return NomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		NomeAgencia = nomeAgencia;
	}
	
}
