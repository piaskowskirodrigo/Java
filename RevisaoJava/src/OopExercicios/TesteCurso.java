package OopExercicios;

import java.util.Scanner;


public class TesteCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//info curso
		Curso curso = new Curso();
		System.out.println("Informe o nome do curso");
		curso.setNomeCurso(scan.next());
		System.out.println("Informe o horario do curso: "+curso.getNomeCurso());
		curso.setHorarioCurso(scan.next());
		
		//info professor
		Professor professor = new Professor();
		System.out.println("Insira o nome do professor:  ");
		professor.setNomeProfessor(scan.next());
		System.out.println("Insira o departamento: ");
		professor.setDepartamento(scan.next());
		System.out.println("Insira o email: ");
		professor.setEmail(scan.next());
		
		//info aluno
		
		Aluno[] alunos = new Aluno[2];
		for (int i = 0; i < alunos.length; i++) {
			Aluno a = new Aluno();//cria um aluno para pegar as info
			System.out.println("Inform o nome do aluno "+(i+1));
			String nome = scan.next();
			a.setNomeAluno(nome);
			System.out.println("Informe a matricula do aluno "+(i+1));
			String matricula = scan.next();
			a.setMatricula(matricula);
			
			double[] notas = new double[4]; 
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Insira a nota "+(j+1));
				notas[j] = scan.nextDouble();
			}
			Aluno aluno = new Aluno();//cria mais um aluno para guardar as info acima
			aluno.setNomeAluno(nome);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			alunos[i] = aluno; //pega os dados do aluno e joga para um aluno so para repetir o processo
		}
		scan.close();
		curso.setAlunos(alunos);
		System.out.println(curso.obterInfo());
	}

}
