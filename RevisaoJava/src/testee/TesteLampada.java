package testee;

public class TesteLampada {
	
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "Led";
		lampada.cor = "vermelha";
		lampada.tamanho = "pequena";
		
		lampada.mostrarInfo();
		lampada.lampadaLigada();
		lampada.lampadaDesligada();
	}
}
