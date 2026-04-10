package exer_tem_mtos;

public class Teste_instance {
	
	public static void main(String[] args) {
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		if(aluno instanceof Aluno) { //verifica o tipo da variavel
			System.out.println("eh aluno");
		}
		if(professor instanceof Professor) {
			System.out.println("eh professor");
		}
	}
	
}
