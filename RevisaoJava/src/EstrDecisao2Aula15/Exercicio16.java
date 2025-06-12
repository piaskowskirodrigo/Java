/*Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numeros = {10, 20, 30, 40, 50}; 
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[10];
		int soma = 0;
		int qtd = 0;
		int soma2 = 0;
		int qtd2 = 0;
		int media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição "+(i+1)+ " do vetor A: ");
			vetorA[i] = scan.nextInt(); 
		}
		
		//soma
		System.out.print("Vetores menores que 15: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i]<15) {
				System.out.print(vetorA[i]+ " ");	
				soma = soma + vetorA[i];
			}
		
		}
		System.out.println();
		System.out.println("A soma dos elementos menores que 15 é: "+ soma);
		//qtd = 15
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] == 15) {	
				qtd = qtd +1;			
			}
		}
		System.out.println("A quantidade dos elementos iguais a 15 é: " +qtd);
		//media > 15

		System.out.print("Vetores maiores que 15: ");
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > 15) {
			System.out.print(vetorA[i]+ " ");	
			soma2 = soma2 + vetorA[i];
			qtd2 = qtd2+1;
			media = soma2/qtd2;
			}

		}
		System.out.println();
		System.out.println("A media dos elementos maiores que 15 é: " +media);
		

	}

}
