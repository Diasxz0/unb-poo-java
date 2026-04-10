package dimensoes;

import java.lang.Math;

public class Cubo extends Figura3D{

	private double aresta;

	
	public Cubo(String nome, String cor, double aresta) {
		super(nome, cor);
		this.aresta = aresta;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularArea() {
		return 6 * (this.aresta * this.aresta);
	}

	@Override
	public double calcularVolume() {
		
		return Math.pow(this.aresta, 3);
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAresta: " + this.aresta;
		s += "\nArea: " + calcularArea();
		s += "\nVolume: " + calcularVolume();
		return s;
	}
	
}
