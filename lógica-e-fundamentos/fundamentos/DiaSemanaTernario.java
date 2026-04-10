package calculate;

import java.util.Scanner;

public class descrito {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Considerando 1 para domingo e 7 para sabado");
		System.out.println("Digite o numero favorito da semana");
		int dia = scanner.nextInt();
		
		String escolha = (dia==1) ? "domingo" :
						 (dia==2) ? "segunda" :
					     (dia==3) ? "terça" :
					     (dia==4) ? "quarta" :
					     (dia==5) ? "quinta" :
					     (dia==6) ? "sexta" :
						 (dia==7) ? "sabado":
							 		"dia inávlido";
		
		System.out.println(escolha);
		
		scanner.close();
	}
}
