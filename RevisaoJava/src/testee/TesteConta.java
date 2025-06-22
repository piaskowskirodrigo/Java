package testee;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.numeroConta = "12121";
		conta.saldoConta = 500.0;
		conta.limite = 1500.0;
		conta.stats = false;
		
		conta.mostrarInfo();
		conta.realizaSaque(300.0);
		conta.deposita(1000.0);
		conta.mostrarInfo();

	}

}
