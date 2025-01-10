//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
package EstruturaDecisao;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o sexo");
		char sexo = scan.next().charAt(0);
		
		if (sexo == 'f') {
			System.out.println("Sexo feminino");
		}else if(sexo == 'm'){
			System.out.println("Sexo masculino");
		}else {
			System.out.println("Sexo invalido");
		}scan.close();
	}

}
