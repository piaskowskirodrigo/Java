/*Faça um programa que leia 5 números e informe a soma e a média
dos números.*/
package EstrRepeticao2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int media = 0;
		/*criar uma variavel para o numero de repeticoes*/
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero: ");
			int num = scan.nextInt();
			soma = soma + num;
			media = soma /5;
			
		}
		System.out.println("A soma dos numeros é: "+ soma);
		System.out.println("A media dos numeros é: "+ media);

	}

}
