package OopRelacionamentoClasses;

import java.util.Scanner;
import java.util.Set;

public class TesteAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		System.out.println("Insira o nome da agenda: ");
		agenda.setNome(scan.next());
		
		
		Contato[] contatos = new Contato[2];
		for (int i = 0; i < contatos.length; i++) {
			Contato a = new Contato();
			System.out.println("Insira o nome do contato: " +(i+1));
			String nome = scan.next();
			a.setNome(nome);
			System.out.println("Insira o telefone do contato: "+(i+1));
			String telefone = scan.next();
			a.setTelefone(telefone);
			System.out.println("Insira o email do contato: "+(i+1));
			String email = scan.next();
			a.setEmail(email);
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);
			contatos[i]=a;
			
		}
		agenda.setContatos(contatos);
		System.out.println(agenda.obterInfo());
		

	}

}
