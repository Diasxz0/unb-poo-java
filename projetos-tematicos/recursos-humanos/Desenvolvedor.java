package folha_Pagamento;

public class Desenvolvedor extends Funcionario{

	private String linguagemPrincipal;

	public Desenvolvedor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Desenvolvedor(String nome, int id, double salarioBase, String linguagemPrincipal) {
		super(nome, id, salarioBase);
		this.linguagemPrincipal = linguagemPrincipal;
	}
	
	public String getLingaugemPrincipal() {
		return linguagemPrincipal;
	}


	public void setLingaugemPrincipal(String lingaugemPrincipal) {
		this.linguagemPrincipal = lingaugemPrincipal;
	}


	@Override
	public double calcularSalario() {
		return super.getSalarioBase() * 1.15;
	}
	
	
}
