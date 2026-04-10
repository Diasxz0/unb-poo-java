package calculate;

import java.util.Scanner;

public class Newcalculator {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		int x;
		double num1, num2;
		
		
		System.out.println("1) Soma");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicação");
		System.out.println("4) Divisão");
		System.out.println("0) Sair");
		System.out.println("escolha o número da operação:");
		
		x = scanner.nextInt();
		
		if (x!=0) {
			 
			System.out.println("Digite o primeiro número: ");
			num1 = scanner.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			num2 = scanner.nextDouble();
			
			if(x==1) {
				System.out.println("O resultado é: " + (num1 + num2));
			}else {
				if (x==2) {
					System.out.println("O resultado é: " + (num1 - num2));
				}else {
					if (x==3) {
						System.out.println("O resultado é: " + (num1 * num2));
					}else {
						System.out.println("O resultado é: " + (num1 / num2));
					}
				} 
					
				}
				
			}else {
				System.out.println("O programa foi encerrado.");
			
		}
		
	scanner.close();	
		
	}
}
