package OopExercicios;

public class ContaCorrente {
	private String numero;
	private Double saldo;
	private boolean status;
	private Double limite;
	
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}


	public ContaCorrente(String numero, Double saldo, boolean status, Double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite *-1;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Double getLimite() {
		return limite;
	}


	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void realizaSaque(Double valor) {
		
	}
	
	

}
