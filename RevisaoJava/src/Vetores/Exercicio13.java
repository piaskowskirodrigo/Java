package Vetores;

import java.util.Scanner;

public class Exercicio13 {
	/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que determine a soma dos elementos armazenados neste vetor que
	são múltiplos de 5.*/

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int [] vetorA = new int[10];
			int multiplo = 0;
			int soma = 0;
		
			
			for(int i=0;i<vetorA.length;i++) {
				System.out.println("Insira o valor da posicao "+i);
				vetorA[i] = scan.nextInt();
			}
			System.out.print("Vetor A: ");
			for(int i=0;i<vetorA.length;i++) {
				System.out.print(vetorA[i]+  " ");
			}
			
			System.out.println();
			System.out.print("Vetor multiplo de 5 : ");
			for(int i=0;i<vetorA.length;i++) {
				if(vetorA[i] %5==0) {
					soma += vetorA[i];
					System.out.print(vetorA[i]+  " ");
					

				}
			}
			System.out.println();
			System.out.print("A soma dos multiplos de 5 sao : "+soma);

					

		}

	}