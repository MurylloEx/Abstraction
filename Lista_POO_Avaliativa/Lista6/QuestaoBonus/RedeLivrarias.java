package Lista6.QuestaoBonus;

import java.util.ArrayList;

public class RedeLivrarias {

	private ArrayList<Livraria> Livrarias = new ArrayList<Livraria>();
	
	public void cadastrarLivraria(Livraria lib) {
		Livrarias.add(lib);
		System.out.println("Livraria cadastrada!\n");
		System.out.println("======================================");
		System.out.println("Nome: " + lib.getNome());
		System.out.println("Cidade: " + lib.getCidade());
		System.out.println("Estado: " + lib.getEstado());
		System.out.println("======================================\n");
	}
	
	public Livraria procurarLivraria(String nomeLivraria) {
		for (Livraria lib : Livrarias) {
			if (lib.getNome().toUpperCase().equals(nomeLivraria.toUpperCase())) {
				return lib;
			}
		}
		return null;
	}
	
	public ArrayList<Livraria> obterLivrarias(){
		return Livrarias;
	}
	
}
