package chamando;

import java.util.Scanner;



public class Chamando {
	public static void main(String[] args) {
		
		System.out.println("Informe a idade do seu cachorro:");
		
		Scanner scanner = new Scanner(System.in);
		
		int dog_age = scanner.nextInt();
		dog_age = dog_age * 7; 
		
		System.out.println("A idade do seu chacorro é: " +dog_age+ " Anos");
		
		
	}
}
