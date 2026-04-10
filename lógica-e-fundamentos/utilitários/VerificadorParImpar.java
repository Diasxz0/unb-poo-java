package calculadora2;

import java.util.Scanner;

public class Resto {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double number;
		System.out.println("Qual o Numero?");
		number = scanner.nextDouble();
		
		if (number % 2.0 == 0) {
			System.out.println("O numero  " +number+ " é par");
		}else {
			
			System.out.println("O numero "+number+" é impar");
			
		}
		
		scanner.close();
		
	}
}
