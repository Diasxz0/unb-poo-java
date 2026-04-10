package exer_tem_mtos;


public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	
	public Aluno(String nome, String endereco, String telefone, String cpf, String curso) {
		super(nome, endereco, telefone, cpf);
		this.curso = curso;
	}
	
	public Aluno() {}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEndereco() {
		String s = "Endereço do aluno: ";
		s += super.getEndereco();
		return s;
	}

	public void imprimirEndereco() {
		System.out.println("Imprimindo endereço do aluno: ");
		System.out.println(this.obterEndereco());
	}
	
	public String toString() {
		String s = this.curso +"\n";
		
		for(double nota: notas) {
			s += nota + " ";
		}
		
		return s;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if( curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return false;
	}
	
	
	
	
}
