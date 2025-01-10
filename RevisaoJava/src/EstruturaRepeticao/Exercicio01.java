/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		boolean validaNota = false;
		while(!validaNota) {
			System.out.println("Informe uma nota de 0 a 10");
			int nota = scan.nextInt();
			if (nota < 0 || nota > 10) {
				System.out.println("Nota invalida tente novamente");
			}else {
				System.out.println("Nota valida");
				validaNota = true;
			}
		}

	}

}
