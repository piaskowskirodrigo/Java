package exercicioNelioAlvez;

public class ProdutoImportado extends Produto{
    private double taxaAlfandega;


    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega/100;

    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }


    public double precoFinal(){

        return getPreco()*taxaAlfandega;
    }

    @Override
    public String listaPreco(){
        String s = "Nome: "+getNome()+("Preco: "+getPreco()+precoFinal()+"Taxa: "+precoFinal());
        return s;
    }
}
