/*Faça um programa para jogar o jogo da velha. O programa deve
permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai
alternadamente informando a posição onde deseja colocar a sua
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
deve atualizar a situação do tabuleiro na tela.*/
package Matrizes2;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char jogodaVelha[][] = new char[3][3];
		Scanner scan = new Scanner(System.in);
		boolean ganhou = false;
		char sinal;
		int jogadas = 1;
		int linha = 0, coluna = 0;
		
		System.out.println("Jogo da velha");
		System.out.println("Jogador 1 == X ");
		System.out.println("Jogador 2 == O ");
		
		//valida ganhador, define quem joga 1, valida linha, valida jogada, imprime tabuleiro, valida ganhador
		while(!ganhou) {
			//define que jogador comeca
			if (jogadas%2==1) {
				System.out.println("Vez do jogador 1");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2");
				sinal = 'O';
			}
			
			//validaLinha
			boolean validaLinha = false;
			while(!validaLinha) {
				System.out.println("Informe a linha 1, 2 ou 3");
				linha = scan.nextInt();
				if (linha > 0 || linha < 3) {
					validaLinha = true;
				}else {
					System.out.println("Linha invalida, tente novamente");
				}
			}
			//validaColuna
			boolean validaColuna = false;
			while(!validaColuna) {
				System.out.println("Informe a linha 1, 2 ou 3");
				coluna = scan.nextInt();
				if (coluna > 0 || linha < 3) {
					validaColuna = true;
				}else {
					System.out.println("Coluna invalida, tente novamente");
				}
			}
			//diminui 1 para dar certo no tabuleiro
			linha --;
			coluna--;
			
			//valida jogada repitida
			if (jogodaVelha[linha][coluna] == 'X' || jogodaVelha[linha][coluna] == 'O') {
				System.out.println("Jogada invalida, tente outra posicao ");
			} else {
				jogodaVelha[linha][coluna] = sinal;
				jogadas++;
			}
			
			//imprime o tabuleiro
			for (int i = 0; i < jogodaVelha.length; i++) {
				for (int j = 0; j < jogodaVelha[i].length; j++) {
					System.out.print(jogodaVelha[i][j]+ " | ");
				}
				System.out.println();
			}
			
			//valida se jogador 1 ganhou
			if ((jogodaVelha[0][0] == 'X' && jogodaVelha[0][1] == 'X' && jogodaVelha[0][2] == 'X') ||     //linha 1
                    (jogodaVelha[1][0] == 'X' && jogodaVelha[1][1] == 'X' && jogodaVelha[1][2] == 'X') || //linha 2
                    (jogodaVelha[2][0] == 'X' && jogodaVelha[2][1] == 'X' && jogodaVelha[2][2] == 'X') || //linha 3
                    (jogodaVelha[0][0] == 'X' && jogodaVelha[1][0] == 'X' && jogodaVelha[2][0] == 'X') || //coluna 1
                    (jogodaVelha[0][1] == 'X' && jogodaVelha[1][1] == 'X' && jogodaVelha[2][1] == 'X') || //coluna 2
                    (jogodaVelha[0][2] == 'X' && jogodaVelha[1][2] == 'X' && jogodaVelha[2][2] == 'X') || //coluna 3
                    (jogodaVelha[0][0] == 'X' && jogodaVelha[1][1] == 'X' && jogodaVelha[2][2] == 'X') || //diagonal
                    (jogodaVelha[0][2] == 'X' && jogodaVelha[1][1] == 'X' && jogodaVelha[2][0] == 'X')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jogodaVelha[0][0] == 'O' && jogodaVelha[0][1] == 'O' && jogodaVelha[0][2] == 'O') ||     //linha 1
                    (jogodaVelha[1][0] == 'O' && jogodaVelha[1][1] == 'O' && jogodaVelha[1][2] == 'O') || //linha 2
                    (jogodaVelha[2][0] == 'O' && jogodaVelha[2][1] == 'O' && jogodaVelha[2][2] == 'O') || //linha 3
                    (jogodaVelha[0][0] == 'O' && jogodaVelha[1][0] == 'O' && jogodaVelha[2][0] == 'O') || //coluna 1
                    (jogodaVelha[0][1] == 'O' && jogodaVelha[1][1] == 'O' && jogodaVelha[2][1] == 'O') || //coluna 2
                    (jogodaVelha[0][2] == 'O' && jogodaVelha[1][2] == 'O' && jogodaVelha[2][2] == 'O') || //coluna 3
                    (jogodaVelha[0][0] == 'O' && jogodaVelha[1][1] == 'O' && jogodaVelha[2][2] == 'O') || //diagonal
                    (jogodaVelha[0][2] == 'O' && jogodaVelha[1][1] == 'O' && jogodaVelha[2][0] == 'O')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            }else if (jogadas > 9){
                ganhou = true;
                System.out.println("Ninguem ganhou essa partida.");
			}
			
		}
	}

}
