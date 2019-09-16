
public class Humano extends Animal{

	public Humano(String nome) {
		super(nome, true);
	}

	@Override
	public void tipoAnimal() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " é um humano.");
	}

	@Override
	public void tipoMovimento() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " anda com 2 pés, ereto.");
	}

	@Override
	public void tipoComunicacao() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " se comunica falando, conversando.");
	}

	@Override
	public void tipoInteligencia() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " é um animal " + ((super.isRacional() == true) ? "racional." : "irracional."));
	}
	
}
