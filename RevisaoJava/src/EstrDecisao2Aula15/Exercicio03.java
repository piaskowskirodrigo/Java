/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira F para feminino e M para masculino");
		char letra = scan.next().charAt(0);
		
		
		if (letra == 'F') {
			System.out.println("Sexo é feminino");
			
		}else if (letra == 'M') {
			System.out.println("Sexo masculino");
		}else{
			System.out.println("Sexo invalido");
		}scan.close();
	}
}
