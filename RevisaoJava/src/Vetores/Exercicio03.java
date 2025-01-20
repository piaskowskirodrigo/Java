package Vetores;

import java.util.Scanner;

public class Exercicio03 {
	/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[3];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a posicao " +i);
			vetorA[i] = scan.nextDouble();
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		
		System.out.println("Vertor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(+vetorA[i]+ " ");
		}
		System.out.println();
		System.out.println("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] +" " );
		}
	}
}
