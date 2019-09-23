package animais.classes;

import animais.reino.Animalia;

public class Aves extends Animalia{

	public Aves(String nome, float tempoVida, String habitat, String localFeto, String alimento, boolean heterotrofo,
			boolean autotrofo) {
		super(nome, tempoVida, habitat, localFeto, alimento, heterotrofo, autotrofo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Respirar() {
		// TODO Auto-generated method stub
		System.out.println("Respiram através de pulmões regidos e por traquéias...");
	}

	@Override
	public void Comunicar() {
		// TODO Auto-generated method stub
		System.out.println("Comunicam-se através de cantos...");
	}

	@Override
	public void Descansar() {
		// TODO Auto-generated method stub
		System.out.println("Fazem ninhos e dormem em árvores, buracos...");
	}

}
