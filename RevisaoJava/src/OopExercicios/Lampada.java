package OopExercicios;

public class Lampada {
	
	private String cor;
	private String modelo;
	private String tamanho;
	
	public Lampada() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Lampada(String cor, String modelo, String tamanho) {
	
		this.cor = cor;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}



	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void ligarLampada(){
		System.out.println("Lampada ligada");
	}
	public void desligarLampada() {
		System.out.println("Lampada desligada");
	}
	
	public void mostrarInfo() {
		System.out.println("Cor: "+cor);
		System.out.println("Modelo: "+modelo);
		System.out.println("Tamanho: "+tamanho);
	}

}
