//Faça um Programa que peça dois números e imprima o maior deles
package EstruturaDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira dois numeros" );
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O numero maior e "+ numero1);
		}else {
			System.out.println("O numero maior e "+ numero2);
		}
		
		scan.close();

	}

}
