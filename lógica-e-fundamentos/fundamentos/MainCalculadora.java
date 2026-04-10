package orientacao;

public class TesteCalculadora {

	static int res1;
	
	static void imprimir(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		// o static nas funções permite que eu nao declare um objeto
		
		
		//res1 = MinhaCalculadora.soma(1, 2);
		//double res2 = MinhaCalculadora.soma(1.8,4.9);
		
		imprimir(MinhaCalculadora.soma(1,2));
		imprimir(MinhaCalculadora.divisao(4, 2));
		imprimir(MinhaCalculadora.potencia(2,3));
		imprimir(MinhaCalculadora.subtracao(3, 2));
		imprimir(MinhaCalculadora.fatorial(8));
		
		

	}

}
