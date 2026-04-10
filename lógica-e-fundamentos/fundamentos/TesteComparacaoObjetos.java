package exer_tem_mtos;

public class Teste2 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		
		aluno.setCurso("Ciencia da computação");
		
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciencia da computação");
		
		double[] notas2 = {10,9,8,7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2)); //mexi na classe Alunos e no equals dela
		


	}

}
