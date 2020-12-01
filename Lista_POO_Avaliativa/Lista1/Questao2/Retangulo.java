package Lista1.Questao2;

public class Retangulo {

	private float altura;
	private float largura;
	
	public Retangulo(float alt, float larg) {
		this.altura = alt;
		this.largura = larg;
	}
	
	public float calcularArea() {
		return altura*largura;
	}
	
	public float calcularPerimetro() {
		return 2 * (altura + largura);
	}
	
}
