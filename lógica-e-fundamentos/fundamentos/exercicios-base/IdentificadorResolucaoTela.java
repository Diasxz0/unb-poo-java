package Guanabara;

import java.awt.Toolkit;
import java.awt.Dimension;


public class Resolucao_sistema {
	public static void main(String [] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		System.out.println("Resolução da tela é: " + d.width + " x " + d.height);
	}
}
