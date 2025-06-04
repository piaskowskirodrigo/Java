/*Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int num = scan.nextInt();
		
		if (num%2==1) {
			System.out.println("O numero é impar");
		}else {
			System.out.println("O numero é par");
		}scan.close();
	}
}
