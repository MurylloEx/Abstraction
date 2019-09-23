package animais.exemplos;

public class EntryPoint {

	
	public static void main(String[] args) {
		
		Homem h = new Homem("João", 70, "Meio urbano", "útero", "Qualquer alimento", true, false);
		h.Correr();
		h.Comer();
		//Existe vários outros métodos dentro da classe Homem, listei alguns...
		
		
		Cachorro c = new Cachorro("Marmaduke", 10, "Apartamento", "Útero", "Ração para cães", true, false);
		c.Latir();
		c.Descansar();
		c.Roer();
		//Existe vários outros métodos dentro da classe Cachorro, listei alguns...
		
	}

}
