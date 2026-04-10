package iniciante;

import java.util.Scanner;

public class programa1 {
	public static void main (String[] agrs) {
	
		Scanner scanner = new Scanner(System.in);
		int  num1;
		System.out.println("Qual o numero?");
		num1 = scanner.nextInt();
		
		if (num1 == 10 ) {
			System.out.print("O numero é igual a 10");
		 }if (num1 > 10) {
			System.out.println("O numero é maior que 10");
		}if (num1 < 10) {
				System.out.println("O numero é menor que 10");
				
				}
		
		scanner.close();
			}
}


