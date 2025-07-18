package HerançaPolimorfismoExercicios;

public class ContaPoupanca extends ContaBancaria{
	
	double diaRendimento;
	double taxaRendimento;
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	public double getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public double calcularNovoSaldo(double taxaRendimento) {
		double atualizaSaldo = getSaldo() + (taxaRendimento * getSaldo());
		return atualizaSaldo;
	}
	@Override
	public String toString() {
		return 	"Conta Poupanca"+"\n"+"Nome Cliente=" + getNomeCliente() +"\n"+ "NumConta=" + getNumConta() +"\n"+
				"Dias Rendidos=" + diaRendimento+"\n"+
				"Saldo atualizado com rendimentos= " + calcularNovoSaldo(getTaxaRendimento());
	}
	
	
}
