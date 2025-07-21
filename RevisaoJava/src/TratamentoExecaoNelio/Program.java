package TratamentoExecaoNelio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		try {
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid position");
		} catch(InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("Fim do programa");
		scan.close();
	}

}
