package Lista1.Questao3;

public class Circulo {
	
	private float raio;
	private final float pi = 3.14159265359f;
	
	public Circulo(float r) {
		raio = r;
	}
	
	public float calcularArea() {
		return pi*raio*raio;
	}
	
	public float calcularPerimetro() {
		return 2*pi*raio;
	}
}
