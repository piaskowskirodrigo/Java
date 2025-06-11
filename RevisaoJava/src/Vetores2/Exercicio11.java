/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/
package Vetores2;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[6];
		int cont = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira os valor do vetor " +(i+1)+" de A: ");
			vetorA[i] = scan.nextInt();
			
		}
		
		System.out.println("Vetores pares: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i]%2==0) {
				System.out.print(vetorA[i]+ " ");
				cont ++;
				
			}
			
		}
		System.out.println();
		System.out.println("Quantidade de vetores Par: "+ cont);


	}

}
