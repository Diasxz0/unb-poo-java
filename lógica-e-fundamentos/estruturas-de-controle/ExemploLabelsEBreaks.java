package iniciante;

public class Label {
	public static void main(String [] args ) {
		
		label1:{
			labelIF: if(true) {
				System.out.println("instrução if");
				
				break labelIF;
			}
			System.out.println("label1 ini");
			label2:{
				System.out.println("label2 ini");
				label3:{
					System.out.println("label3 ini");
					if(true)
						break label2;
					}
				System.out.println("label2 fim");
			}
		   System.out.println("label 1 fim");	
		}
	}
}
