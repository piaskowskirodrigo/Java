package exercicioNelioAlvez;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        System.out.println("Insira o numero de produtos");
        int n = scan.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Informações do produto " + (i ));
            System.out.println("Comum, importado ou usado? (c,u,i)");
            char ch = scan.next().charAt(0);
            if (ch == 'c') {

                System.out.println("Insira o nome do produto: ");
                String nome = scan.next();

                System.out.println("Insira o preco do produto: ");
                double preco = scan.nextDouble();
                Produto produto = new Produto(nome, preco);
                list.add(produto);
            }
            if (ch == 'i') {

                System.out.println("Insira o nome do produto: ");
                String nome = scan.next();

                System.out.println("Insira o preco do produto: ");
                double preco = scan.nextDouble();

                System.out.println("Insira a taxa da alfandega");
                double taxaAlfandega = scan.nextDouble();

                ProdutoImportado produto = new ProdutoImportado(nome, preco, taxaAlfandega);
                list.add(produto);

            }
            if (ch == 'u') {

                System.out.println("Insira o nome do produto: ");
                String nome = scan.next();

                System.out.println("Insira o preco do produto: ");
                double preco = scan.nextDouble();

                System.out.println("Insira a data do produto");
                float data = scan.nextFloat();

                ProdutoUsado produto = new ProdutoUsado(nome, preco, data);
                list.add(produto);
            }

        }
        System.out.println("PREÇOSS");
        for(Produto prod: list){
            System.out.println(prod.listaPreco());
        }
    }
}
