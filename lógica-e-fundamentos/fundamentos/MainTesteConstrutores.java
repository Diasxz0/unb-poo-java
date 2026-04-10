package orientacao;

public class TesteCarro {
	public static void main(String [] args) {
		
		Carro_2 van = new Carro_2("Fiat", "Ducato", 10, 100, 0.2);
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
		
		System.out.println("\n");
		
		Carro_2 uno = new Carro_2("Fiat", "Uno");
		
		System.out.println(uno.numPassageiros);
		System.out.println(uno.consumoCombustivel);
		
		/*Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("a autonomia do carro eh: "+ autonomia);
		
		double gasto = van.calcularCombustivel(10);
		
		System.out.println("o gasto eh: " + gasto);*/
	}
}
