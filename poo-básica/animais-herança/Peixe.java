package exer_animais;

public class Peixe extends Animais{
	private String caracteristicas;

	public Peixe() {
		super();
		this.ambiente = "Mar";
		this.patas = 0;
		
	}

	public Peixe(String nome, double comprimento, String cor, double velocidade, String caracteristicas) {
		super(nome, 0, comprimento, cor, "Mar", velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Caracteristica: " + this.caracteristicas + "\n";
		return s;
	}

	
	
	
	
	
	
	
	
	
}
