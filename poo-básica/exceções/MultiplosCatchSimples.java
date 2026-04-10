package excecao;

public class Multiploscatch {

	public static void main(String[] args) {
		
		int[] numeros = {4,8,16,32,64, 128};
		
		int[] denominadores = {2,4,0,8,0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				
				System.out.println(numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
				
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Erro!");
				
			} //catch (ArrayIndexOutOfBoundsException exc) {
				
				//System.out.println("Posição Inválida!");
				
			//catch(Throwable exc) { //classe mae de todos os erros e exceções. algo generico.
				//System.out.println("Ocorreu um erro!");
			//}
			
			
		}

	}

}
