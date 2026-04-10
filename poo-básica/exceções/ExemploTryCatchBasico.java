package excecao;

public class Teste {

	public static void main(String[] args) {
		 
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exceção");
			
			vetor[4] = 1;
			
			System.out.println("noa sera impresso");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um index que nao existe");
		}
		System.out.println("esse texto sera impresso");
		
	}

}
