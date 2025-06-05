/*Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira 3 numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            // num1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);
            
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            //num1 é menor
            //num2 é maior
            // num1 < num3 < num2
            System.out.println(num2 + " - " + num3 + " - " + num1);
            
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            //num2 é menor
            //num3 é maior
            // num2 < num1 < num3
            System.out.println(num3 + " - " + num1 + " - " + num2);
            
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            //num2 é menor
            //num1 é maior
            // num2 < num3 < num1
            System.out.println(num1 + " - " + num3 + " - " + num2);
            
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            //num3 é menor
            //num2 é maior
            // num3 < num1 < num2
            System.out.println(num2 + " - " + num1 + " - " + num3);
            
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            //num3 é menor
            //num1 é maior
            // num3 < num2 < num1
            System.out.println(num1 + " - " + num2 + " - " + num3);
		}scan.close();
	}

}
