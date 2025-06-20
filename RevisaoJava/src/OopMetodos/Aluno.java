/*Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características 
 * de um Aluno, como nome, matrícula, curso que está matriculado, nome de 3 disciplinas que está cursando
 * e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado 
 *(nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, 
 * que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as 
 * notas e mostra se o aluno foi aprovado ou não.*/
package OopMetodos;

public class Aluno {
	String nome;
	String matricula;
	String nomeCurso;
	String[] disciplinas =  new String[3];
	Double[][] notas = new Double[3][4];
	
	
	void mostrarInfo() {
		System.out.println("Nome: "+ nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("Nome do curso: "+nomeCurso);
		
		System.out.println("Disciplinas: ");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print(disciplinas[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Notas da disciplina: "+disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(" "+notas[i][j]);
			}
			System.out.println();
		}
		
	}
	void calculaMedia() {
		Double soma = 0.0;
		Double media = 0.0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma = soma + notas[i][j];
				media = soma/4;
			}
			
			System.out.println("A media da discíplina "+disciplinas[i]+ " é: " +media);
			if(media >7 ) {
				System.out.println("Aluno aprovado na disciplina "+ disciplinas[i]);
				
			}else {
				System.out.println("Aluno reprovado na disciplina "+ disciplinas[i]);
			}
			soma = 0.0;
			media = 0.0;
			
		}
		
		
		 
	}

}
