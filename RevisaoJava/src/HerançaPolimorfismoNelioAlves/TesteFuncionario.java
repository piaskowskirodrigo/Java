package HerançaPolimorfismoNelioAlves;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		System.out.println("Informe o numero de funcionarios");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados funcionario "+(i+1));
			System.out.println("Funcionario terceirizado? (s/n)");
			char ch = scan.next().charAt(0);
			System.out.println("Informe o nome do funcionario");
			String nome = scan.next();
			System.out.println("Informe a quantidade de horas trabalhadas");
			int horas = scan.nextInt();
			System.out.println("Informe o valor por hora: ");
			double valorHora = scan.nextDouble();
			if(ch == 's') {
				System.out.println("Insira o adicional ");
				double adicional = scan.nextDouble();
				FuncionarioTerceirizado ft = new FuncionarioTerceirizado(nome, horas, valorHora, adicional);
				list.add(ft);
			}else {
				Funcionario ft = new Funcionario(nome, horas, valorHora);
				list.add(ft);
				
			}
			
		}
		System.out.println("Pagamentos: ");
		for(Funcionario fn: list) {
			System.out.println(fn.getNome()+" - $: "+fn.pagamento());
		}
	}

}
