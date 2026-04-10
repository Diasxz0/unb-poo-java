package calculadora2;

import java.util.Scanner;

public class Distancia {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double dis = 0, speed = 0, time = 0;
		String ask1, ask2;
		
		System.out.println("Qual variavel você deseja achar? ");
		System.out.println("Responda com V para velocidade"); 
		System.out.println("Responda com D para distancia");
		System.out.println("Responda com T para tempo");
		ask1 = scanner.nextLine();
		
		if (ask1.equalsIgnoreCase("V")) {
		
			System.out.println("Voce deseja calcular em m/s ou em km/h?");
			ask2 = scanner.next();
			
			if (ask2.equalsIgnoreCase("km/h")) {
				
				System.out.println("Qual a distancia percoorida? (em km)");
				dis = scanner.nextDouble();
				
				System.out.println("Qual o tempo no qual o trajeto é percorrido? (em hora)");
				time = scanner.nextDouble();
				if (time == 0) {
					System.out.println("O tempo não pode ser 0!");
				}
				if (dis == 0) {
					System.out.println("o objeto nao se moveu, ja que sua distancia é igual a 0!");
				}
				speed = dis/ time;
				System.out.println("A velocidade do objeto é: "+speed+" km/h!");
				
			}
			
			if (ask2.equalsIgnoreCase("m/s")) {
			System.out.println("Qual a distancia percoorida? (em m)");
			dis = scanner.nextDouble();
			
			System.out.println("Qual o tempo no qual o trajeto é percorrido? (em s)");
			time = scanner.nextDouble();
			if (time == 0) {
				System.out.println("O tempo não pode ser 0!");
			}
			if (dis == 0) {
				System.out.println("o objeto nao se moveu, ja que sua distancia é igual a 0!");
			}
			speed = dis/ time;
			System.out.println("A velocidade do objeto é: "+speed+" m/s!");
			}
			
			
		}else if (ask1.equalsIgnoreCase("D")){
			
			System.out.println("Voce deseja calcular em m/s ou em km/h?");
			ask2 = scanner.next();
			
			if (ask2.equalsIgnoreCase("km/h")) {
				System.out.println("Qual a velocidade do objeto? (em km/hr) ");
				speed = scanner.nextDouble();
				
				System.out.println("Qual o tempo no qual o trajeto é percorrido? (em hora)");
				time = scanner.nextDouble();
				if (time == 0)  {
					System.out.println("O tempo não pode ser 0!");
				}
				if (speed==0) {
					System.out.println("O objeto, por ter velocidade igual a 0, não se move!");
				}
				
				dis = speed * time;
				System.out.println("A distancia do trajeto é: "+dis+" km!");	
				
			}
			
			if (ask2.equalsIgnoreCase("m/s")) {
			System.out.println("Qual a velocidade do objeto? (em m/s) ");
			speed = scanner.nextDouble();
			
			System.out.println("Qual o tempo no qual o trajeto é percorrido? (em s)");
			time = scanner.nextDouble();
			if (time == 0)  {
				System.out.println("O tempo não pode ser 0!");
			}
			if (speed==0) {
				System.out.println("O objeto, por ter velocidade igual a 0, não se move!");
			}
			
			dis = speed * time;
			System.out.println("A distancia do trajeto é: "+dis+" metros!");
			}
			
		}else if (ask1.equalsIgnoreCase("T")) {
			
			System.out.println("Voce deseja calcular em m/s ou em km/h?");
			ask2 = scanner.next();
			
			if (ask2.equalsIgnoreCase("km/h")) {
				System.out.println("Qual a distancia percorrida? (em km)");
				dis = scanner.nextDouble();
				
				System.out.println("Qual a velocidade do objeto? (em km/h)");
				speed = scanner.nextDouble();
				
				if (dis==0) {
					System.out.println("o carro nao se moveu, ja que sua distancia é igual a 0!");
				}
				if (speed==0) {
					System.out.println("O carro, por ter velocidade igual a 0, não se move!");
				}
				
				time = dis / speed;
				System.out.println("O tempo gasto foi de: " +time+ " hora(s)");
				
			}
			
			if (ask2.equalsIgnoreCase("m/s")) {
			System.out.println("Qual a distancia percorrida? (em m)");
			dis = scanner.nextDouble();
			
			System.out.println("Qual a velocidade do objeto? (em m/s)");
			speed = scanner.nextDouble();
			
			if (dis==0) {
				System.out.println("o carro nao se moveu, ja que sua distancia é igual a 0!");
			}
			if (speed==0) {
				System.out.println("O carro, por ter velocidade igual a 0, não se move!");
			}
			
			time = dis / speed;
			System.out.println("O tempo gasto foi de: " +time+ " segundos");
			}
		}
		
		scanner.close();
		
	}
}
