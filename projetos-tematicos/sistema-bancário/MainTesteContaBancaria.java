package orientacao;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente cont = new ContaCorrente();
		cont.setSaldo(10000); 
		cont.setLimite(0);
		cont.setVerificador("9");
		cont.setNumero("12345678");
		cont.setEspecial(false);
		
		cont.consultarSaldo();
		System.out.println(cont.getVerificador());
		
	}

}
