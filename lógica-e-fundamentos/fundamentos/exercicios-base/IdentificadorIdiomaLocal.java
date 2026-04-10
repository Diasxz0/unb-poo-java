package Guanabara;

import java.util.Locale;


public class Idioma_sistema {
	public static void main (String [] args) {
		Locale local = Locale.getDefault();
		
		System.out.println("O Idioma do sistema é: " + local.getDisplayLanguage());
		System.out.println("A sua silga é: " + local.getLanguage());
	}	
}
