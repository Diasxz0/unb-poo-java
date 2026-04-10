package orientacao;

public class Carro {
		String marca;
		String modelo;
		int numPassageiros; //numero de passageiros
		double capCombustivel; //capacidade de L
		double consumoCombustivel; // qnto gasta por km
	
		double obterAutonomia() {
			return capCombustivel * consumoCombustivel;
		}
		
		double calcularCombustivel(double km) {
			double qtdCombustivel = km / consumoCombustivel;
			
			return qtdCombustivel;
		}
}
