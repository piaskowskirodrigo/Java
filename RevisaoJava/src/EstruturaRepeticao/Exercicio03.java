/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean validaNome = false;
		while(!validaNome) {
		System.out.println("Informe um nome: ");
		String nome = scan.next();
		if(nome.length() < 3) {
			System.out.println("O nome precisa ter mais que 3 caracteres, tente novamente");
		}else {
			validaNome = true;
		}
		
		}
		boolean validaIdade = false;
		while(!validaIdade) {
		System.out.println("Informe a idade:");
		int idade = scan.nextInt();
		if (idade < 0 || idade >150) {
			System.out.println("Idade precisa ser de 0 a 150, tente novamente");
		}else {
			validaIdade = true;
		}
		}
		boolean validaSalario = false;
		while(!validaSalario) {
		System.out.println("Informe seu salario");
		double salario = scan.nextDouble();
		if (salario < 0) {
			System.out.println("Salario precisa ser maior que 0, tente novamente ");
		}else {
			validaSalario = true;
		}
		
		}
		boolean validaSexo = false;
		while(!validaSexo) {
		System.out.println("Informe o sexo: ");
		char sexo = scan.next().charAt(0);
		if (sexo == 'f' || sexo == 'm') {
			validaSexo = true;
		}else {
			System.out.println("Sexo somente f para feminino ou m para masculino, tente novamente");
		}
		}
		boolean validaEstado = false;
		while(!validaEstado) {
		System.out.println("Informe o estado civil: ");
		char estadoCivil = scan.next().charAt(0);
		if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
			validaEstado = true;
		}else {
			System.out.println("Estado civil invalido, s para solteiro, c para casado, v para viuvo e d para divorciado, tente novamente");
		}
		}
		
		System.out.println("Informacoes coletadas com sucesso!!! ");
		

	}

}
