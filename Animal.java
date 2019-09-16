
public abstract class Animal {
	
	private String nome;
	private boolean racional;
	
	public Animal(String _nome, boolean bRacional) {
		this.nome = _nome;
		this.racional = bRacional;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean isRacional() {
		return racional;
	}
	
	public abstract void tipoAnimal();
	public abstract void tipoMovimento();
	public abstract void tipoComunicacao();
	public abstract void tipoInteligencia();
	
}
