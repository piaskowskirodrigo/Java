/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/
package Vetores2;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[5];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe os valores da posicao "+(i+1) +" de A:");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
			soma = soma+ vetorA[i];
		}
		System.out.println();
		System.out.println("A soma dos vetores é: "+ soma);

	}

}
