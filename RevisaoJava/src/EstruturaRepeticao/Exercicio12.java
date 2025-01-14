/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada.*/

package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero");
		int numero = scan.nextInt();
		System.out.println("Tabuada do " +numero +": ");
		for (int i = 1; i < 11; i++) {
			
			System.out.println(numero+" X "+i+" = "+numero*i);
			
		}scan.close();

	}

}
