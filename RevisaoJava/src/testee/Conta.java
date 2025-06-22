package testee;

public class Conta {
	String numeroConta;
	Double saldoConta;
	boolean stats;
	Double limite;
	
	//saque
	void realizaSaque(Double valor) {
		if(valor > saldoConta) {
			System.out.println("Saldo insuficiente para saque.");
		}else {
			System.out.println("Saque de: "+ valor+" realizado com sucesso!");
			saldoConta -= valor;
		}
	}
	
	void deposita(Double valor) {
		System.out.println("Deposito de "+valor+" realizado com sucesso!");
		saldoConta += valor;
	}
	
	
	void mostrarInfo() {
		System.out.println("Numero da conta: "+ numeroConta);
		System.out.println("limite da conta: "+limite);
		System.out.println("Seu saldo atual é de: "+saldoConta);
		if(stats == true) {
			System.out.println("Voce é cliente especial");
		}else {
			System.out.println("Voce não é cliente especial");
		}
		
		
		
	}
}
