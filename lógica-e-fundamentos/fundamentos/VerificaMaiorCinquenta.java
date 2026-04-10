package calculate;

import java.util.Scanner;

public class Aleatorio {
	public static void main (String [] args) {
		
		double num1;
		String num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha um numero.");
		num1 = scanner.nextDouble();
		
		num2 = (num1>50) ? "o número é maior que 50" : "o número é menor que 50";
		System.out.println(num2);
	}
}
