/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/
package Matrizes2;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int [][] numerosAleatorios = new int[10][10];
		
		//gera numeros aleatorios
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = random.nextInt(9);
			}
			
		}
		
		//imprime a matriz
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j]+ " ");
			}
			System.out.println();
		}
		
		 int maiorL5 = 0;
	     int menorL5 = 10;//levar em consideração o maior numero aleatorio
	     int linha5 = 5;
		
		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
			if(numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i]; 
			}
			if(numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i]; 
			}
		}
		
		System.out.println("Maior numero da linha 5: " +maiorL5);
		System.out.println("Menor numero da linha 5: " +menorL5);
		
		int maiorC7 = 0;
		int menorC7 = 10;
		int coluna7 = 7;
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if(numerosAleatorios[i][coluna7] > maiorC7) {
				maiorC7 = numerosAleatorios[i][coluna7];
			}
			if(numerosAleatorios[i][coluna7] < menorC7) {
				menorC7 = numerosAleatorios[i][coluna7];
			}
			
		}
		System.out.println("Maior numero da coluna 7: " +maiorC7);
		System.out.println("Menor numero da coluna 7: " +menorC7);
		

	}

}
