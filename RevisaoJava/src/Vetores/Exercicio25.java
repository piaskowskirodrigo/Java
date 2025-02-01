/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
quando Ai for ímpar*/

package Vetores;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] vetorA = new int[4];
	int[] vetorB = new int[vetorA.length];
	
	
	
	for(int i=0;i<vetorA.length;i++) {
		System.out.println("Entre com o valor da posicao "+i);
		vetorA[i] = scan.nextInt();
		if (vetorA[i] %2==0) {
			vetorB[i] = 1;
		}else {
			vetorB[i] = 0;
		}
	}
	System.out.println("VetorA:  ");
	for(int i=0;i<vetorA.length;i++) {
		System.out.print(vetorA[i]+" ");
	}
	System.out.println("VetorB:  ");
	for(int i=0;i<vetorA.length;i++) {
		System.out.print(vetorB[i]+" ");
	}
}

}
