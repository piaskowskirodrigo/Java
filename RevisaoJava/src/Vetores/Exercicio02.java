package Vetores;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[8];
		int [] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao: " +i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		/*for(int i=0; i<vetorB.length;i++) {
			vetorB[i] = vetorA[i];
			
		}*/
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i]+  " ");
		}
		System.out.println();
		System.out.print("Vetor B= ");
		for(int i=0; i<vetorB.length;i++) {
			System.out.print(vetorB[i]+  " ");
	}
	
	}
}
