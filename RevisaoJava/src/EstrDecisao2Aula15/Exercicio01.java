/*Faça um Programa que peça dois números e imprima o maior deles.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira dois numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("O numero maior é o numero: " +num1);
			
		}else {
			System.out.println("O numero maior é o numero: "+num2);
		}scan.close();
		
		
	}

}
