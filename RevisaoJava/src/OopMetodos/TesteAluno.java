package OopMetodos;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Informe o seu nome: ");
		aluno.nome = scan.next();
		System.out.println("Informe a matricula: ");
		aluno.matricula = scan.next();
		System.out.println("Informe o nome do seu curso: ");
		aluno.nomeCurso = scan.next();
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Informe o nome da disciplina " + (i+1));
			aluno.disciplinas[i]= scan.next();
		}
		
		for (int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Coletando notas da disciplina: " +aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notas[i].length; j++) {
				System.out.println("Informe a nota: " + (j+1));
				aluno.notas[i][j] = scan.nextDouble();
			}
		}
		aluno.mostrarInfo();
		aluno.calculaMedia();
	}

}
