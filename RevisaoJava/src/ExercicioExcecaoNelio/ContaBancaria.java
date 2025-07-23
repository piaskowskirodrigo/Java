package ExercicioExcecaoNelio;

public class ContaBancaria {
    private Integer numero;
    private String name;
    private double balance;
    private double withdrawLimit;

    public ContaBancaria(){


    }

    public ContaBancaria(Integer numero, String name, double balance, double withdrawLimit) {
        this.numero = numero;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(double amount){
        checkExeption(amount);
        balance-=amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void checkExeption(double amount) {
    if(amount>getWithdrawLimit()){
        throw new DomainExeption("Erro ao sacar: voce exedeu o limite de saque ");
    }
    if(amount>getBalance()){
        throw new DomainExeption("Erro de saldo: Saldo insuficiente ");
    }

    }

}