package orientacao;

import java.util.Scanner;

public class TesteVelha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Jogo_da_velha jogodaVelha = new Jogo_da_velha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		
		char sinal;
		
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if (jogodaVelha.vezJogador01()) {
				System.out.println("Vez do jogador 1. Escolha uma linha e uma coluna (1 a 3)");
				sinal = 'X';
			} else {
				System.out.println("Vez do Jogador 2. Escolha uma linha e uma coluna (1 a 3)");
				sinal = 'O';
			}
	
		}
		

	}

}
