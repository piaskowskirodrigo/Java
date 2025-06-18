package OopMetodos;

public class TesteLampada {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.cor = "Amarela";
		lampada.modelo = "Aquecimento";
		lampada.tamanho = "Pequena";
		
		
		System.out.println(lampada.cor);
		System.out.println(lampada.modelo);
		System.out.println(lampada.tamanho);
		lampada.ligarLampada();
		lampada.desligarLampada();
		
		
		
	}

}
