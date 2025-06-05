/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
package EstrRepeticao2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		boolean validaNum = false;
		while(!validaNum) {
			System.out.println("Digite um numero de 0 a 10");
			int num = scan.nextInt();
			if(num < 0 || num > 10) {
				System.out.println("Numero invalido, tente novamente");
			}else {
				validaNum = true;
			}
		} scan.close();

	}

}
