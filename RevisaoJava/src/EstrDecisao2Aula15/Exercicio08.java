/*Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/
package EstrDecisao2Aula15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o preço dos 3 produtos: ");
		double preco1 = scan.nextDouble();
		double preco2 = scan.nextDouble();
		double preco3 = scan.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("O produto com o menor preço é o produto de valor: "+ preco1);
		}else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("O produto com o menor preço é o produto de valor: "+ preco2);
		}else {
			System.out.println("O produto com o menor preço é o produto de valor: "+ preco3);
		}scan.close();
	}

}
