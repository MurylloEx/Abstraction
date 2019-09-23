package animais.classes;

import animais.reino.Animalia;

public class Anfibios extends Animalia{

	public Anfibios(String nome, float tempoVida, String habitat, String localFeto, String alimento,
			boolean heterotrofo, boolean autotrofo) {
		super(nome, tempoVida, habitat, localFeto, alimento, heterotrofo, autotrofo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Respirar() {
		// TODO Auto-generated method stub
		System.out.println("(AMBIENTE AQUÁTICO) Respiram pelas br�nquias... (AMBIENTE TERRESTRE) Respiram pelos pulmões...");
	}

	@Override
	public void Comunicar() {
		// TODO Auto-generated method stub
		System.out.println("Comunicam-se por zunidos, vocalizações, coaxos...");
	}

	@Override
	public void Descansar() {
		// TODO Auto-generated method stub
		System.out.println("Dormem em lugares frescos e durante o dia...");
	}


}
