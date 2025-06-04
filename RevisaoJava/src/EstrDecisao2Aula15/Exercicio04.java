/*Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		char letra = scan.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra é uma vogal");
		}else {
			System.out.println("A letra é uma consoante");
		}

	}

}
