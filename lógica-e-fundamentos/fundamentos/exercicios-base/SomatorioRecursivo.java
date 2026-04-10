package orientacao;

public class Somatorio {

	public static int soma(int num) {
		if (num == 1) {
			return 1;
		}
		
		return num + soma(num-1);
	}
	
	public static void main(String[] args) {
		
		int res1 = soma(10);
		
		System.out.println(res1);

	}

}
