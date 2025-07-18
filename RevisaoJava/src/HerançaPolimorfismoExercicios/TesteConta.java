package HerançaPolimorfismoExercicios;

public class TesteConta {
	public static void main(String[] args) {
		System.out.println("TESTE CONTA SIMPLES");
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Rodrigo");
		contaSimples.setNumConta("78789");
		
		contaSimples.depositar(1000);
		System.out.println(contaSimples);

		realizarSaque(contaSimples, 100);	
		
		
		System.out.println();
		System.out.println("TESTE CONTA POUPANCA");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Rodrigo");
		contaPoupanca.setNumConta("9999");
		contaPoupanca.setDiaRendimento(5);
		contaPoupanca.setTaxaRendimento(0.05);
		contaPoupanca.setSaldo(contaSimples.getSaldo());
		
		System.out.println(contaPoupanca);
		
		System.out.println();
		System.out.println("TESTE CONTA ESPECIAL");
		ContaEspecial contsEspecial = new ContaEspecial();
		contsEspecial.setNomeCliente("Rodrigo");
		contsEspecial.setNumConta("9999");
		contsEspecial.setLimite(17000);
		
		contsEspecial.depositar(100);
		System.out.println(contsEspecial);
		realizarSaque(contsEspecial, 10);
		
		
	}
	
	
		
	private static void realizarSaque(ContaBancaria conta, long valor){
	    if (conta.sacar(valor)){
	        System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
	    } else {
	        System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
	    }	
		

	}
}

