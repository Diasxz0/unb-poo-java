package calculadora2;

import java.util.Scanner;


public class Calculadora2 {
		public static void main(String[] args ) {
			
			Scanner scanner = new Scanner(System.in);
			
			int i = scanner.nextInt();
			
			
			System.out.println("digite 1 para somar.");
			System.out.println("digite 2 para subtrair.");
			System.out.println("digite 3 para multiplicar.");
			System.out.println("digite 4 para dividir.");
			
			System.out.println("Digite o primeiro numero");
			double num1 = scanner.nextDouble();
			
			System.out.println("Digite o segundo numero");
			double num2 = scanner.nextDouble();
			
			if (i==1) {
				System.out.println(num1 + num2);
			}
			if (i==2) {
				System.out.println(num1 - num2);
			}
			if (i==3) {
				System.out.println(num1 * num2);
			}
			if (i==4) {
				System.out.println(num1 / num2);
				scanner.close();
			}
			
			    
	}
}	
				


