package exer_animais;

public abstract class Mamifero extends Animais {
	
	protected String alimento;

	public Mamifero() {
		super();
	}

	public Mamifero(String nome, int patas, double comprimento, String cor, String ambiente, double velocidade) {
		super(nome, patas, comprimento, cor, ambiente, velocidade);
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Alimento: " + this.alimento + "\n";
		return s;
	}
	
	
}
