package ExercicioExcecaoNelio;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Informe o numero da conta: ");
        conta.setNumero(scan.nextInt());
        System.out.println("Informe o nome do usuario: ");
        conta.setName(scan.next());
        System.out.println("Informe o saldo inicial da conta: ");
        conta.setBalance(scan.nextDouble());
        System.out.println("Informe o limite de saque");
        conta.setWithdrawLimit(scan.nextDouble());

        System.out.println("Informe o valor do saque: ");
        double amount = scan.nextDouble();
        try {
            conta.withdraw(amount);
            System.out.println("Seu saldo atualizado é de: "+conta.getBalance());
        }catch (DomainExeption e){
            System.out.println(e.getMessage());
        }

    }

}
