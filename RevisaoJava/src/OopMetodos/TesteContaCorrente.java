package OopMetodos;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente();
		conta.numeroConta = "123456";
		conta.saldo = 200.0;
		conta.limite = 1000.0;
		
		conta.realizaSaque(100.0);
		conta.consultaSaldo();
		conta.realizarDeposito(300.0);
		conta.consultaSaldo();
		conta.verificaStatus();
		conta.realizaSaque(500.0);
		conta.consultaSaldo();
		conta.realizaSaque(400.0);
		conta.consultaSaldo();

	}

}
