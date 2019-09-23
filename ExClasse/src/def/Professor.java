package def;

public class Professor extends Pessoa{
	
	protected String Nome = "Professor";
	
	public Professor() {
		System.out.println(super.Nome);
		
		System.out.println(this.Nome);
	}

	@Override
	public void Respirar() {
		// TODO Auto-generated method stub
		
	}
}
