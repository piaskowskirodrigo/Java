package Vetores;

import java.util.Scanner;

public class Exercicio12 {
/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int soma =0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posicao " +i);
			vetorA[i] = scan.nextInt();
			
		}
		for(int i=0; i<vetorA.length;i++) {
			soma += vetorA[i];
			}
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		System.out.println("A soma dos vetores e: " +soma);

	}

}
