package exercicioContaMenu;

import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrrente conta = new ContaCorrrente();
        System.out.println("Insira seu nome");
        conta.setNome(scan.next());
        System.out.println("Insira seu sobre nome");
        conta.setSobreNome(scan.next());
        System.out.println("Insira o numero da conta");
        conta.setNumeroConta(scan.next());

        System.out.println(conta);
        conta.menu();

    }
}
