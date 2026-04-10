package Guanabara;

import java.util.Scanner;


public class Exeercicio_2 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("\tSeu nome: ");
		String nome = scanner.nextLine();
		System.out.printf("\tSua nota: ");
		float nota = scanner.nextFloat();
		System.out.printf("\n\t%s, sua nota eh: %.2f", nome, nota);
		
		int idade = Integer.parseInt(nome); // passa de string para int 
		System.out.printf("\n\t%d", idade);
		
		nome = Float.toString(nota); //passa de float para string
		System.out.printf("\n\t%s", nome);	
	}
}
