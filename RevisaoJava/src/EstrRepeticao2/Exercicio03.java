/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

package EstrRepeticao2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		boolean validaNome = false;
		while(!validaNome) {
			System.out.println("Insira um nome: ");
			String nome = scan.next();
			int tamanho = nome.length();
			if (tamanho < 3) {
				System.out.println("O nome precisa ter mais que 3 caracteres. ");
			}else {
				validaNome = true; 
			}
		}
		
		boolean validaIdade = false;
		while(!validaIdade) {
			System.out.println("Insira a idade: ");
			int idade = scan.nextInt();
			if(idade < 0 || idade > 150) {
				System.out.println("Idade precisa ser entre 0 e 150 ");
			}else {
				validaIdade = true;
			}
		}
		
		boolean validaSalario = false;
		while(!validaSalario) {
			System.out.println("Insira o salario: ");
			double salario = scan.nextDouble();
			if(salario <= 0) {
				System.out.println("Salario precisa ser maior que 0. ");
			}else {
				validaSalario = true;
			}
		}
		
		boolean validaSexo = false;
		while(!validaSexo) {
			System.out.println("Informe o sexo");
			char sexo = scan.next().charAt(0);
			if(sexo == 'f' || sexo == 'm') {
				validaSexo = true;
			}else {
				System.out.println("Sexo invalido, tente *m* para masculino e *f* para feminino");
				
			}
			
		}scan.close();
		System.out.println("Informações coletadas. Obrigado!");
		

	}

}
