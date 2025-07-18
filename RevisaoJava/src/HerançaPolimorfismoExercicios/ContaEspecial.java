package HerançaPolimorfismoExercicios;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	public ContaEspecial() {
		// TODO Auto-generated constructor stub
	}	

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		/*public boolean sacar(double valorEspecial) {
			
			if((limite-valorEspecial)>=0) {
				limite -= valorEspecial;
				return true;
			}
			return false;
	}
	*/
		@Override
		public String toString() {
			return "Conta Poupanca"+"\n"+"Nome Cliente=" + getNomeCliente() +"\n"+ "NumConta=" + getNumConta() +"\n"+
					"Limite disponiel para saque = "+limite;
		}
		
		public boolean sacar(double valor){
	        
	        double saldoComLimite = this.getSaldo() + limite;
	        
	        if ((saldoComLimite-valor) >=0){
	            this.setSaldo(this.getSaldo()-valor);
	            
	            //super.sacar(valor);
	            return true;
	        }
	        
	        return false;
	    }
	}