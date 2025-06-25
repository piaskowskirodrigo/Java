package OopExercicios;

import OopExercicios.Lampada;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lampada = new Lampada();
		lampada.setCor("Amarela"); 
		lampada.setModelo("Aquecimento");
		lampada.setTamanho("Pequena");
		
		lampada.mostrarInfo();
		lampada.ligarLampada();
		lampada.desligarLampada();
		
		

	}

}
