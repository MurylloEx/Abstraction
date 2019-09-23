package def;

public class Coordenador extends Professor implements Gerir {
	
	public String Nome = "Coordenador";
	
	public Coordenador() {
		System.out.println(this.Nome);
	}
	
	@Override
	public void gerenciar() {
		// TODO Auto-generated method stub
		System.out.println("Fazendo reuniões.. ");
	}
	
	
	
}