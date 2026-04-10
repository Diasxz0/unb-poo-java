package calculadora2;

import java.util.Scanner;

public class Idades {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	
		int age;
		
		// && = E
		//|| = OU
		//!= NÃO
		
		System.out.println("Qual a idade da pessoa?");
		age = scanner.nextInt();
		if ((age>=18) && (age<60)){
			System.out.println("A pessoa em questão é obrigada a votar!");
		}else if((age>=16)&&(age<18) || (age>=60)) {
			System.out.println("A pessoa pode ou não votar!");
		}else {
			System.out.println("A pessoa não pode votar!");
			
		}
		
		scanner.close();
	}
}
