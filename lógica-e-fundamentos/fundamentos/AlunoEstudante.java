package orientacao;

public class Aluno {

	private String matricula;
	private String nome;
	private String curso;
	private String disciplia1;
	private String disciplia2;
	private String disciplia3;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno() {

	}

	public Aluno(String matricula, String nome, String curso, String disciplia1, String disciplia2, String disciplia3,
			double nota1, double nota2, double nota3) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.disciplia1 = disciplia1;
		this.disciplia2 = disciplia2;
		this.disciplia3 = disciplia3;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDisciplia1() {
		return disciplia1;
	}

	public void setDisciplia1(String disciplia1) {
		this.disciplia1 = disciplia1;
	}

	public String getDisciplia2() {
		return disciplia2;
	}

	public void setDisciplia2(String disciplia2) {
		this.disciplia2 = disciplia2;
	}

	public String getDisciplia3() {
		return disciplia3;
	}

	public void setDisciplia3(String disciplia3) {
		this.disciplia3 = disciplia3;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void calcularMedia(double nota1, double nota2, double nota3) {
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua media é: " + media);
	}
	
	public void verSePassou(double nota) {
		if (nota >= 7) {
			System.out.println("Passou!");
		} else {
			System.out.println("Reprovou!");
		}
	}

}
