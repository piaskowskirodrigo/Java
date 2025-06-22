package testee;

public class Lampada {
	
	String modelo;
	String cor;
	String tamanho;
	
	
	
	void mostrarInfo() {
		System.out.println("Lampada modelo: "+ modelo);
		System.out.println("Lampada cor: "+cor);
		System.out.println("Lampada tamanho: "+tamanho);
	}
	
	void lampadaLigada() {
		System.out.println("Lampada ligada");
	}
	void lampadaDesligada() {
		System.out.println("Lampada desligada");
	}
}
