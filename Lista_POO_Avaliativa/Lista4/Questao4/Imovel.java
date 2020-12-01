package Lista4.Questao4;

public abstract class Imovel {
	
	private String Rua;
	private int Numero;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private String Cep;
	private float Preco;
	private boolean Alugado;
	private boolean Mobiliado;
	
	public Imovel(	String rua, int numero, String bairro,
					String cidade, String estado, String cep, 
					float preco, boolean alugado, boolean mobiliado) {
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setCep(cep);
		this.setPreco(preco);
		this.setAlugado(alugado);
		this.setMobiliado(mobiliado);
	}
	
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		Cep = cep;
	}
	public float getPreco() {
		return Preco;
	}
	public void setPreco(float preco) {
		Preco = preco;
	}
	public boolean isAlugado() {
		return Alugado;
	}
	public void setAlugado(boolean alugado) {
		Alugado = alugado;
	}
	public boolean isMobiliado() {
		return Mobiliado;
	}
	public void setMobiliado(boolean mobiliado) {
		Mobiliado = mobiliado;
	}
	
}
