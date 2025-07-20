package HerançaPolimorfismoNelioAlves;

public class FuncionarioTerceirizado extends Funcionario{
	private double adicional;
	
	public FuncionarioTerceirizado() {
		// TODO Auto-generated constructor stub
	}
	
	
	public FuncionarioTerceirizado(String nome, int horas, double valorHora,double adicional) {
		super(nome, horas, valorHora);
		this.adicional = adicional;
		// TODO Auto-generated constructor stub
	}




	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento()+adicional*1.1;
	}
	

}
