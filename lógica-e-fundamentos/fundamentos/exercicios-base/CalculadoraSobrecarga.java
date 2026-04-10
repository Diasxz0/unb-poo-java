package orientacao;
//overload de metodos
public class MinhaCalculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public int soma(int[] vetorInteiros) {
		
		int total = 0;
		
		for(int i = 0; i < vetorInteiros.length; i++) {
			total +=vetorInteiros[i];
		}
		
		return total;
	}
	
	public static int subtracao(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divisao(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int potencia(int num1, int num2) {
		int total = 1;
		for(int i = 1; i<=num2; i++) {
			total *= num1;
		}
		return total;
	}
	
	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num-1);
	}
}
