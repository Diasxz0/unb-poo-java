package calculate;

import java.util.Scanner;


public class Boletim {
	public static void main (String[] args) {
		
		double mat, port, geo, hist, cien, media;
		String resultado;
		
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual foi a sua nota em matematica?");
		mat = scanner.nextDouble();
		
		System.out.println("Qual foi a sua nota em portugues?");
		port = scanner.nextDouble();
		
		System.out.println("Qual foi a sua nota em geografia?");
		geo = scanner.nextDouble();
		
		System.out.println("Qual foi a sua nota em historia?");
		hist = scanner.nextDouble();
		
		System.out.println("Qual foi a sua nota em ciências?");
		cien = scanner.nextDouble();
		
		
		media = (cien + hist + mat + geo + port)/ 5;
		
		resultado = (media>=6) ? "Parabéns, você foi aprovado! Sua media foi "+media : "Infelizmente, você reprovou pq sua media foi "+media;
		
		System.out.println(resultado);
		
		scanner.close();
	}
}
