package iniciante;

import java.util.Scanner;

public class Caracteres {
	public static void main(String[] args) {
		String word;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha uma palavra");
		word = scanner.next();
		
		var letter = word.length();
		System.out.print("A palavra "+word+ " tem " +letter+ " letras.");
		
		
			scanner.close();
		}
		
	}

