/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações*/
package EstrRepeticao2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean validaUsu = false;
		while(!validaUsu) {
			System.out.println("Insira seu usuario");
			float usuario = scan.nextFloat();
			System.out.println("Insira sua senha ");
			float senha = scan.nextFloat();
			
			if(usuario == senha) {
				System.out.println("Usuario nao pode ser igual a senha, tente novamente ");
			}else {
				System.out.println("Usuario e senha OK");
				validaUsu = true;
			}
		}scan.close();

	}

}
