package TratamentoExecaoNelio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metodo1();
		
		System.out.println("Fim do programa");
		
	}
	public static void metodo1() {
		System.out.println("Metodo 1 iniciado ");
		metodo2();
		System.out.println("Metodo 1 finalizado ");
		
	}
	
	public static void metodo2() {
		System.out.println("Metodo 2 iniciado ");
		Scanner scan = new Scanner(System.in);
		
		try {
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid position");
			e.printStackTrace();

		} catch(InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("Metodo 2 finalizado ");
		scan.close();
	}

}
