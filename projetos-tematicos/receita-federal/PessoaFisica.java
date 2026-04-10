package exer_Receita;

public class PessoaFisica extends Contribuinte{

	
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double renda) {
		super(nome, renda);
	}

	public double deduzirImposto() {
		double r = super.renda;
		
		if(r>=3600) return (r*0.3) - 700;
		
		if(r>=2800) return (r*0.25) - 500;
		
		if(r>=2100) return (r*0.15) - 270;
		
		if(r>=1400) return (r*0.1) - 100;
		
		return 0;
		
	}
}
