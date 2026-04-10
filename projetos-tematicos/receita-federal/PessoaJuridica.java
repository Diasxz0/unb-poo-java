package exer_Receita;

public class PessoaJuridica extends Contribuinte{
	
	
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double renda) {
		super(nome, renda);
	}

	public double deduzirImposto() {
		return super.renda*0.1;
	}
}
