package calculate;

public class Break3 {
	public static void main(String [] args) {
		
		LabelForI: for(int i = 0; i<10; i++) {
				
			for(int j =0; j<10; j++) {
				
			System.out.println("O valor de I é: "+i+ " e o J é: "+j);
				if(j==6 && i==0)
					break LabelForI;
			
			}
			}
		
		
		
		
	}
}
