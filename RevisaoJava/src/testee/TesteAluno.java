package testee;


import java.util.Scanner;


public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Informe o nome do aluno: ");
		aluno.nome=scan.next();
		System.out.println("Informe a matricula do aluno: ");
		aluno.matricula=scan.next();
		System.out.println("Informe o curdo matriculado: ");
		aluno.cursoMatriculado=scan.next();
		
	
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("informe a disciplina "+(i+1)+" do aluno");
			aluno.disciplinas[i] = scan.next();
		}
		
		for (int i = 0; i < aluno.notas.length; i++) {
			System.out.println("coletando as notas da disciplina " +aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notas[i].length; j++) {
				System.out.println("Insira a nota " +(i+1)+" da disciplina " +aluno.disciplinas[i]);
				aluno.notas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo();

	}

}
