package calculate;

import java.util.Scanner; 

public class Calculate {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1, num2, soma, subtracao, divisao, multi;
		
		System.out.println("Insira o primeiro numero: ");
		num1 = scanner.nextDouble();
		
		System.out.println("Insira o segundo numero: ");
		num2 = scanner.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		subtracao = num1 - num2;
		System.out.println("O resultado da subtracao é: " + subtracao);
		divisao = num1 / num2;
		System.out.println("O resultado da divisao é: " + divisao);
		multi = num1 * num2;
		System.out.println("O resultado da multiplicação é: " + multi);
	
		scanner.close();
		
	
		
		
		
		
		
	
	}
}



