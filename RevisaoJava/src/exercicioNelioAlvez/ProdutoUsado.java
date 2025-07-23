package exercicioNelioAlvez;

public class ProdutoUsado extends Produto{
    private float data;

    public ProdutoUsado(String nome, double preco, float data) {
        super(nome, preco);
        this.data = data;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    @Override
    public String listaPreco(){
        String s = "Nome: "+getNome()+"Preco: "+getPreco()+"Data: "+data;
        return s;
    }

}
