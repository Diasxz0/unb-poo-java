package exer_animais;

public class Urso extends Mamifero{

	public Urso() {
		super();
		this.patas = 4;
		this.ambiente = "terra";
	}

	public Urso(String nome, double comprimento, String cor, double velocidade, String alimento) {
		super(nome, 4, comprimento, cor, "Terra", velocidade);
		this.alimento = alimento;
		}
	
	
	
}
