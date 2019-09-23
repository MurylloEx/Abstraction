package animais.classes;

import animais.reino.Animalia;

public class Peixes extends Animalia {

	public Peixes(String nome, float tempoVida, String habitat, String localFeto, String alimento, boolean heterotrofo,
			boolean autotrofo) {
		super(nome, tempoVida, habitat, localFeto, alimento, heterotrofo, autotrofo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Respirar() {
		// TODO Auto-generated method stub
		System.out.println("Usam suas traquéias.");
	}

	@Override
	public void Comunicar() {
		// TODO Auto-generated method stub
		System.out.println("Usam vocalizações e vibrações para se comunicar, embora nem todos tenham essa capacidade...");
	}

	@Override
	public void Descansar() {
		// TODO Auto-generated method stub
		System.out.println("Não dormem, apenas repousam... :O");
	}

}
