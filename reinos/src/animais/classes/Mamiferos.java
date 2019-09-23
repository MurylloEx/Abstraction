package animais.classes;

import animais.reino.Animalia;

public class Mamiferos extends Animalia {

	public Mamiferos(String nome, float tempoVida, String habitat, String localFeto, String alimento,
			boolean heterotrofo, boolean autotrofo) {
		super(nome, tempoVida, habitat, localFeto, alimento, heterotrofo, autotrofo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Respirar() {
		// TODO Auto-generated method stub
		System.out.println("Respiram por pulmões, assim como as aves...");
	}

	@Override
	public void Comunicar() {
		// TODO Auto-generated method stub
		System.out.println("Comunicam-se das mais diversas formas, utilizando cantos, feromônios, toque etc...");
	}
	
	@Override
	public void Descansar() {
		// TODO Auto-generated method stub
		System.out.println("Dormem quando senem-se cansados. Cientistas também suspeitam de que eles possam sonhar assim como os humanos...");
	}

}
