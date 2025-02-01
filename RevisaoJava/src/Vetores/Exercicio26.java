/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando Ai for menor que Bi.*/

package Vetores;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		int[] vetorA = new int[4];
		int[] vetorB = new int[4];
		int[] vetorC = new int[vetorA.length];
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		for(int i=0; i < vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao A " +i);
			vetorA[i] = scan.nextInt();
		}
		for(int i=0; i < vetorB.length;i++) {
			System.out.println("Entre com o valor da posicao B " +i);
			vetorB[i] = scan1.nextInt();
			
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}
			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;	
			}
			if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;	
			}
		}
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+" ");
		}

	}

}
