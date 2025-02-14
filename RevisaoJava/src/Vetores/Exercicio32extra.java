package Vetores;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio32extra {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o numero a ser multiplicado: ");
		int num1 = scan.nextInt();
	
		
		System.out.println("Insira o tamanho da tabuada: ");
		int num2 = scan.nextInt();
		
		for (int i = 0; i <= num2; i++) {
			System.out.println(num1+" * "+i+" = "+num1*i);
			
		}

	}

}
