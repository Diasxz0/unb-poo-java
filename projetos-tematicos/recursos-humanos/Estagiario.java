package folha_Pagamento;

public class Estagiario extends Funcionario{

	public Estagiario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estagiario(String nome, int id, double salarioBase) {
		super(nome, id, salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		return super.getSalarioBase() * 0.8;
	}

	
}
