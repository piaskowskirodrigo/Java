package OopMetodos;

public class ContaCorrente {
	String numeroConta;
	Double saldo;
	boolean status;
	Double limite;
	
	
	void realizaSaque(Double valor) {	
			if(saldo < valor) {
			System.out.println("Saldo insuficiente para saque");
			}else {
			System.out.println("Saque de "+ valor + "realizado com sucesso!");
			saldo = saldo -valor;
			}
	}
	void realizarDeposito(Double valor) {
		System.out.println("Deposito realizado com sucesso");
		saldo = saldo + valor;
	}
	
	void consultaSaldo() {
		System.out.println("Seu saldo é de: "+ saldo);
	}
	
	void verificaStatus() {
		if (saldo < 0) {
			status = true;
			System.out.println("Voce esta utilizando seu cheque especial");
		}else {
			status = false;
			System.out.println("Voce nao esta utilizando o cheque especial");
		}
	}
}
