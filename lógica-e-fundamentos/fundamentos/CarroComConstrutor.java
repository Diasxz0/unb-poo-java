package orientacao;

public class Carro_2 {
	String marca;
	String modelo;
	int numPassageiros; //numero de passageiros
	double capCombustivel; //capacidade de L
	double consumoCombustivel; // qnto gasta por km
	
	
	public Carro_2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel; //usando Source fica top dms
	}
	
	public Carro_2(String marca, String modelo) {
		this(marca, modelo, 5, 200, 0.4); //varia so a marca e modelo, o resto eh fixo
	}
	
	public Carro_2() {} //boa pratica sempre ter um vazio 

	double obterAutonomia() {
		return capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
}
