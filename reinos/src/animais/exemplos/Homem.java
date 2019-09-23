package animais.exemplos;

import animais.especies.*;
import animais.classes.*;
import animais.familias.*;
import animais.ordem.*;
import animais.grupos.*;

public class Homem extends Mamiferos implements Viviparo, Omnivoro, Hominideos, Terrestre{

	public Homem(String nome, float tempoVida, String habitat, String localFeto, String alimento, boolean heterotrofo,
			boolean autotrofo) {
		super(nome, tempoVida, habitat, localFeto, alimento, heterotrofo, autotrofo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Correr() {
		// TODO Auto-generated method stub
		System.out.println("Correndo...");
	}

	@Override
	public void Pular() {
		// TODO Auto-generated method stub
		System.out.println("Pulando...");
	}

	@Override
	public void Andar() {
		// TODO Auto-generated method stub
		System.out.println("Andando...");
	}

	@Override
	public void Saltar() {
		// TODO Auto-generated method stub
		System.out.println("Saltando...");
	}

	@Override
	public void Falar() {
		// TODO Auto-generated method stub
		System.out.println("Falando qualquer coisa ;)");
	}

	@Override
	public void Raciocinar() {
		// TODO Auto-generated method stub
		System.out.println("Sou um animal racional, logo, penso.");
	}

	@Override
	public void Ler() {
		// TODO Auto-generated method stub
		System.out.println("Lendo um livro sobre desenvolvimento de drivers...");
	}

	@Override
	public void Comer() {
		// TODO Auto-generated method stub
		System.out.println("Comendo um hamburguer de 4 carnes...");
	}

	@Override
	public void IngerirCarne() {
		// TODO Auto-generated method stub
		System.out.println("Comendo sushi!");
	}

	@Override
	public void IngerirVegetal() {
		// TODO Auto-generated method stub
		System.out.println("Comendo alface...");
	}

	@Override
	public void IngerirFruta() {
		// TODO Auto-generated method stub
		System.out.println("Gosto de maçãs...");
	}

	@Override
	public void Caçar() {
		// TODO Auto-generated method stub
		System.out.println("Ca�ando...");
	}

	@Override
	public void Fecundar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NutrirFeto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Parir() {
		// TODO Auto-generated method stub
		System.out.println("Acabo de ter um filho ;o");
	}

	
}
