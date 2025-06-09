/*Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50.*/
package EstrRepeticao2;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rep = 50;
		System.out.println("Os numeros impares sao: ");
		for (int i = 0; i < rep; i++) {
			if (i%2==1) {
				System.out.print(i + " , ");
				
			}
		}

	}

}
