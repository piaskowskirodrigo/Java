//Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.
package EstruturaDecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("O numero e negativo");
		}else {
			System.out.println("O numero e positivo");
		}
		scan.close();

	}

}
