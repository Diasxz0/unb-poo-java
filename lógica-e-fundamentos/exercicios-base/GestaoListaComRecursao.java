package Guanabara;


import java.util.ArrayList;
import java.util.Scanner;


public class Ultimo {
	public static void main(String[] agrs) {
		int numero, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<>(); // lista de numero
		
		int c = 0;
		
		for(; c < 5; c++) {
			System.out.printf("\tQual Adicionar: ");
			numero = scanner.nextInt();
			lista.add(numero);
		}
		
		System.out.printf("\n--- listagem da posicao ----");
		
		for(int i = 0; i <lista.size(); i++) {
			System.out.printf("\n\tPosicao %d, Valor %d", i , lista.get(i)); //pega o numero na posicao indicada
		}
		
		System.out.printf("\n\tNumero do fatorial: ");
		num2 = scanner.nextInt();
		
		int num = Recursao.fatorial(num2); // importa o codigo de outro .java
		
		System.out.printf("\t%d", num);
		
		scanner.close();
		
	}
}
