package Guanabara;

import java.util.Scanner;
import java.util.Date;


public class exercicio_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Date relogio = new Date();
		
		System.out.println("A hora do sistema eh: ");
		System.out.println(relogio.toString());
		
		scanner.close();
	}
}
