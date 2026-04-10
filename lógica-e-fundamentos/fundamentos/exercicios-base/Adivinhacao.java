package calculate;

import java.util.Random;
import java.util.Scanner;


public class Adivinhacao {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random num = new Random();
		
		int number = num.nextInt(101);
		int tentativas = 0;
		System.out.println("Qual o seu palpite: ");
		int palpite = scanner.nextInt();
		
		while (palpite != number) {
				
			tentativas++;
			
				if( palpite > number) {
				
					System.out.println("Você está mais alto que o numero");
			
				}else if (palpite < number) {
				
					System.out.println("Você está mais baixo que o numero ");
			}
			
				 palpite = scanner.nextInt();
		}
		
		System.out.println("Parabéns, você acertou!!");
		System.out.println("Seu número de tantivas foi: "+tentativas);
		scanner.close();	
	}
}
