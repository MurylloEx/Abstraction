package animais.exemplos;

import animais.especies.*;
import animais.classes.*;
import animais.familias.*;
import animais.ordem.*;
import animais.grupos.*;

public class Cachorro extends Mamiferos implements Carnivoro, Viviparo, Terrestre, Canideo {


	public Cachorro(String nome, float tempoVida, String habitat, String localFeto, String alimento,
			boolean heterotrofo, boolean autotrofo) {
		super(nome, tempoVida, habitat, localFeto, alimento, heterotrofo, autotrofo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Farejar() {
		// TODO Auto-generated method stub
		System.out.println("Farejando a casa em busca de carne ;P");
	}

	@Override
	public void Latir() {
		// TODO Auto-generated method stub
		System.out.println("Woof Woof!");
	}

	@Override
	public void Roer() {
		// TODO Auto-generated method stub
		System.out.println("Pfft! pfft! phfpt!");
	}

	@Override
	public void Correr() {
		// TODO Auto-generated method stub
		System.out.println("Me alcance se puder (Sou um cão, não falo, apenas penso) ;)");
	}

	@Override
	public void Pular() {
		// TODO Auto-generated method stub
		System.out.println("E lê se foi mais um record de pulo!");
	}

	@Override
	public void Andar() {
		// TODO Auto-generated method stub
		System.out.println("Andando de forma estilosa, sou um cão bonito.");
	}

	@Override
	public void Saltar() {
		// TODO Auto-generated method stub
		
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
		
	}

	@Override
	public void CaçarAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Comer() {
		// TODO Auto-generated method stub
		
	}
}
