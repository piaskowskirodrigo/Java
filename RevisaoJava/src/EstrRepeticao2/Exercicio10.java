/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/
package EstrRepeticao2;

import java.util.Scanner;

import javax.management.relation.InvalidRoleValueException;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira dois numeros inteiros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		System.out.println("Os numeros entre eles sao: ");
		for (int i = num1 + 1; i < num2; i++) {
			System.out.println(i);
		}

	}

}
