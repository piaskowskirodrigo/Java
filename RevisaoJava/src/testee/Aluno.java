package testee;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Aluno {
	
	String nome;
	String matricula;
	String cursoMatriculado;
	String[] disciplinas = new String[3];
	Double[][] notas = new Double[disciplinas.length][4];
	
	
	void mostrarInfo() {
		System.out.println("Nome do aluno: "+nome);
		System.out.println("Matricula do aluno: "+matricula);
		System.out.println("Curso do aluno: "+cursoMatriculado);
		
		System.out.println("Disciplinas do aluno: ");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print(disciplinas[i]+" ");
			
			
	}
		System.out.println("");
		Double soma = 0.0;
		Double media = 0.0;
		for (int j = 0; j < notas.length; j++) {
			
			System.out.print("Notas da discplina "+disciplinas[j]);
			for (int j2 = 0; j2 < notas[j].length; j2++) {
				System.out.print(" "+notas[j][j2]);
				soma += notas[j][j2];
				
			}
			media = soma/4;
			System.out.println(" ");
			System.out.print("Media da disciplina "+disciplinas[j]+" =");
			System.out.print(media);
			System.out.println(" ");
			if (media > 7) {
				System.out.println("Aluno aprovado na disciplina "+disciplinas[j]);
				
			}else {
				System.out.println("Aluno reprovado na disciplina "+disciplinas[j]);
			}
			
			soma = 0.0;
			media = 0.0;
		}
	}
}
