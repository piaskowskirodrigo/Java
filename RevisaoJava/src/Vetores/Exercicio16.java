/*Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/


package Vetores;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[6];
		int somaInferiores = 0;
		int somaSuperiores = 0;
		int qtdSuperior = 0;
		int iguais = 0;
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Insira o valor da posicao "+i);
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		System.out.print("Vetor A: ");
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+  " ");
		}
		System.out.println();
		System.out.print("Vetores inferiores a 15: ");
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i] < 15) {
				somaInferiores += vetorA[i];
				System.out.print(vetorA[i]+  " ");
			}
		}
		System.out.println();
		System.out.print("A soma dos vetores inferiores a 15 e: "+somaInferiores);
		
		System.out.println();
		System.out.print("Vetores iguais a 15: ");
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i] ==  15) {
				iguais ++;
				System.out.print(vetorA[i]+  " ");
			}
		}
		System.out.println();
		System.out.print("A quantidade dos vetores inferiores a 15 e: "+iguais);
		
		System.out.println();
		System.out.print("Vetores superiores a 15: ");
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i] >  15) {
				somaSuperiores += vetorA[i];
				qtdSuperior ++;
				System.out.print(vetorA[i]+  " ");
			}
		}
		System.out.println();
		System.out.println("A quantidade dos vetores superiores a 15 e: "+(qtdSuperior/somaSuperiores));
	}



}
