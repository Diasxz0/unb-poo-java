package orientacao;

public class Fibonnaci {
	
	public static int fibo(int posicao) {
		if(posicao == 1) {
			return 0;
		} else if(posicao == 2) {
			return 1;
		}
		return fibo(posicao-1) + fibo(posicao-2);	
	}
	
	public static void imprimir(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		int res1 = fibo(7);
		
		imprimir(res1);
		
	}

}
