/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações..*/

package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		boolean valida = false;
		while(!valida) {
			System.out.println("Informe o nome de usuario");
			String usuario = scan.next();
			System.out.println("Informe a senha");
			String senha = scan.next();
			if(usuario.equals(senha)) {
				System.out.println("A senha precisa ser diferente do usuario, tente novamente");
			}else {
				System.out.println("Logado com sucesso");
				valida = true;
			}
		}scan.close();

	}

}
