package Vetores;

import java.util.Scanner;

public class Exercicio11 {
	/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que defina e escreva a quantidade de elementos armazenados neste
	vetor que são pares.*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int quantidadePres = 0;
	
		
		
		
		for(int i =0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao "+i);
			vetorA[i] = scan.nextInt();
		}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i]+  " ");
		}

		System.out.println();
		System.out.print("Vetores pares: ");
		
		
		for(int i=0; i<vetorA.length;i++) {
			if(vetorA[i] %2 == 0) {
				quantidadePres ++;
				System.out.print(vetorA[i] + " ");
			}
		}
		System.out.println();
		System.out.print("A quantidade de vetores pares e: "+quantidadePres);
		
		
	}

}
