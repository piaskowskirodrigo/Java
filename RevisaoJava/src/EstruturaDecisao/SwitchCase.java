package EstruturaDecisao;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero de 1 a 7");
		int diaSemana=scan.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo");
		break;
		case 2: System.err.println("Segunda");
		break;
		case 3: System.out.println("Terca");
		break;
		case 4: System.out.println("Quarta");
		break;
		case 5: System.out.println("Quinta");
		break;
		case 6: System.out.println("Sexta");
		break;
		case 7: System.out.println("Sabado");
		break;
		default: System.out.println("Numero invalido");
		//"teste
		
		}
		
		
	}
}
