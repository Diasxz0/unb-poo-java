package dimensoes;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {

	public Figura3D(String nome, String cor) {
		super(nome, cor);
	}
	
	@Override
	public String toString() {
		String s = "\nNome: " + super.nome;
		s += "\nCor: " + super.cor;
		return s;
	}
	

}
