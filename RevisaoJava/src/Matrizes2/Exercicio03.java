/*Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/
package Matrizes2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][3];
		int qtdpar = 0;
		int qtdimpar = 0;
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe o valor da posicao da linha "+(i+1) + " da coluna " +(j+1));
				matriz[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ " ");
				if(matriz[i][j]%2==0) {
					qtdpar++;
				}else {
					qtdimpar++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Quantidade par = "+ qtdpar);
		System.out.println("Quantidade impar = "+ qtdimpar);

	}

}
