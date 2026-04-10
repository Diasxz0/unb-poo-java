package calculate;

import java.util.Scanner;

public class Calculadoraf {
	
	static void sum(double a, double b){
		System.out.println(a+b);	
	}
	
	static void mult (double a, double b) {
		System.out.println(a*b);
	}
	static void div (double a, double b) {
		System.out.println(a / b);
	}
	static void sub(double a, double b) {
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String op;
		Double a, b;
		
		
		System.out.println("Qual operação você deseja fazer?");
		System.out.println("As opções são: soma, subtração, divisão e multiplicação");
		op = scanner.next();
		System.out.println("Qual o primeiro numero?");
		a = scanner.nextDouble();
		System.out.println("Qual o segundo numero?");
		b = scanner.nextDouble();
		if (op.equalsIgnoreCase("soma")) {
			sum(a,b);
		}else if (op.equalsIgnoreCase("subtração")) {
			sub(a,b);
		}else if (op.equalsIgnoreCase("divisão")) {
			div(a,b);
		}else if(op.equalsIgnoreCase("multiplicação")) {
			mult(a,b);
		}
		
	}
}
