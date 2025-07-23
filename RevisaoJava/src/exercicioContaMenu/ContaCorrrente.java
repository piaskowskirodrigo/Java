package exercicioContaMenu;

import java.util.Scanner;

public class ContaCorrrente {
    private String nome;
    private String sobreNome;
    private String numeroConta;
    private double saldo;

    public ContaCorrrente() {
    }

    public ContaCorrrente(String nome, String sobreNome, String numeroConta, double saldo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double consultaSaldo(){

        return saldo;
    }

    public void reaalizDeposito(double valor){
        saldo += valor;
    }



    public void realizaSaque(double valor){
        if(valor> saldo){
            System.out.println("Saldo insuficiente para saque");

        }else{
            System.out.println("Saque de "+valor+" realizado com sucesso");
            saldo -= valor;
        }
    }
    @Override
    public String toString() {
        return "ContaCorrrente{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void menu(){
        Scanner scan = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("--------- MENU---------");
        System.out.println("Opção 1: consultar saldo ");
        System.out.println("Opção 2: realizar deposito ");
        System.out.println("Opção 3: relizar saque ");
        System.out.println("Opção 4: sair");
        opcao= scan.nextInt();

        switch (opcao){
            case 1: System.out.println("Saldo: "+consultaSaldo());
            break;
            case 2: System.out.println("Digite o valor do deposito: ");
            double deposito = scan.nextDouble();
            reaalizDeposito(deposito);
            break;
            case 3: System.out.println("Digite o valor do saque: ");
            double saque = scan.nextDouble();
            realizaSaque(saque);
            break;
            case 4: System.out.println("Menu encerrado pelo usuario");

        }
        }while(opcao != 4);


    }

}
