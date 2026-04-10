 package orientacao;

public class ContaCorrente {

	private double saldo;
	private String numero;
	private String verificador;
	private boolean especial;
	private double limite;
	
	public ContaCorrente() {}

	public ContaCorrente(double saldo, String numero, String verificador, boolean especial, double limite) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.verificador = verificador;
		this.especial = especial;
		this.limite = limite;
	}


	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getVerificador() {
		return verificador;
	}
	public void setVerificador(String verificador) {
		this.verificador = verificador;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean realizarSaque(double quantiaASacar) {
		
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		}
		
		return false;
	}
	
	public boolean realizarDeposito(double quantiaADepositar) {
		saldo += quantiaADepositar;
		return true;
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo é: " + this.saldo + " reais");
		return;
	}
	
}
