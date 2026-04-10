package decisao;

import java.util.Scanner;

public class Decisao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		System.out.println("Qual foi a sua nota 1?");
		nota1 = scanner.nextDouble();
		System.out.println("Qual foia  sua nota 2?");
		nota2 = scanner.nextDouble();
		System.out.println("Qual foi a sua nota 3?");
		nota3 = scanner.nextDouble();
		System.out.println("Qual foi a sua nota 4?");
		nota4 = scanner.nextDouble();
		
		double media;
		media = (nota1 + nota2 + nota3 + nota4);
		media = media / 4;
		System.out.println("A sua media de notas: " +media);
		if (media >=5) {
			System.out.println("Parabéns, você passou!");
		}else {
			System.out.println("Infelizmente, voce reprovou!");
		}
		
		scanner.close();
	}
}
