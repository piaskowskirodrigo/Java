package HerançaPolimorfismoExercicios;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito realizado com sucesso!");
		
	}
	public boolean sacar(long valor) {
			
			if((saldo-valor)>=0) {
				 saldo -= valor;
				return true;
			}
			return false;
		}
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
	

}
