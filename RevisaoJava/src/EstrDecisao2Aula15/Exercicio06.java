/*Faça um Programa que leia três números e mostre o maior deles.*/
package EstrDecisao2Aula15;

import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira 3 numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1> num3) {
			System.out.println("O numero maior é o: " +num1);
		} else if (num2>num1 && num2> num3) {
			System.out.println("O numero maior é o: " +num2);
		}else {
			System.out.println("O maior numero é o: " +num3);
		}scan.close();

/*teste*/


	}

}
