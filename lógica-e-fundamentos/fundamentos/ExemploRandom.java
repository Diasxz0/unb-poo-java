package calculate;
	
import java.util.Random;


public class Numeros_aleatorios {
	public static void main(String [] args) {
		
		
		
		Random num = new Random ();
		
		for (int i = 0; i<20; i++)
		
			System.out.println(num.nextInt(6)+1); // numero aleatorio de 0..5 e depois soma 1
			System.out.println(num.nextDouble()); // numero aleatorio de 0..0.99
		
		
	}
}
