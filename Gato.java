
public class Gato extends Animal{

	public Gato(String nome) {
		super(nome, false);
	}

	@Override
	public void tipoAnimal() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " é um gato.");
	}

	@Override
	public void tipoMovimento() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " anda com 4 patas.");
	}

	@Override
	public void tipoComunicacao() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " se comunica miando.");
	}

	@Override
	public void tipoInteligencia() {
		// TODO Auto-generated method stub
		System.out.println(super.getNome() + " é um animal " + ((super.isRacional() == true) ? "racional." : "irracional."));
	}
	
}
