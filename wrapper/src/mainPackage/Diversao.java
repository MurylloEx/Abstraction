package mainPackage;

import real.desenho.segundaDimensao.ToyStore;
import real.desenho.terceiraDimensao.*;
import real.filme.*;
import real.game.primeiraPessoa.*;
import real.game.terceiraPessoa.*;
import real.serie.*;

public class Diversao {

	public static void main(String[] args) {

		ToyStore toy 		 = new ToyStore();
		Simpsons simp 		 = new Simpsons();
		GearsOfWar gears 	 = new GearsOfWar();
		Doom doom 			 = new Doom();
		Vingadores ving 	 = new Vingadores();
		LaCasaDePapel laCasa = new LaCasaDePapel();
		
		//Maneira ERRADA de acessar o atributo "Nome";
		//Com o encapsulamento, o atributo torna-se indisponível de fora do objeto.
		//toy.Nome = "Toy Store";
		//simp.Nome = "Simpsons";
		//gears.Nome = "Gears of war";
		//doom.Nome = "Doom";
		//ving.Nome = "Vingadores";
		//laCasa.Nome = "La Casa de Papel";
		
		//Maneira CORRETA de acessar o atributo "Nome";
		toy.setNome("Toy Store");
		simp.setNome("Simpsons");
		gears.setNome("Gears of war");
		doom.setNome("Doom");
		ving.setNome("Vingadores");
		laCasa.setNome("La Casa de Papel");
		
		//Para obter seu conteúdo da forma apropriada, usar seu método GET;
		System.out.println(toy.getNome());
		System.out.println(simp.getNome());
		System.out.println(gears.getNome());
		System.out.println(doom.getNome());
		System.out.println(ving.getNome());
		System.out.println(laCasa.getNome());
		
	}

}
