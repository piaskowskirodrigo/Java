/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.*/

package Vetores;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posicao "+i);
			vetorA[i] = scan.nextInt();	
	
		}
		for (int i=0; i<vetorA.length; i++){
            
	           System.out.println("Tabuada de " + vetorA[i]);
	           
	           for (int j=1; j<=10; j++){
	               
	               System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i]*j));
	           }
		}
		/*primeiro armazzena o vetorA, depois faz um for para vetorA.lenght e dentro um for com a tabuada de 1 a 10*/

	}

}
