package exer_tem_mtos;

public class Teste {

	public static void main(String[] args) {
		
		/*Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Warlley");
		
		System.out.println(aluno.getNome());*/
		
		
		// so senho acesso as informações da classe pessoa 
		Pessoa aluno = new Aluno();
		 //Pessoa pessoa = new Pessoa(); nao pode ser instanciada por causa do abstract
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Quadra 208 sul");
		aluno.setEndereco("rua 1, num1");
		professor.setEndereco("rua 2, num 2");
		
		//System.out.println(pessoa.obterEndereco());
		//System.out.println(professor.obterEndereco());
		//System.out.println(aluno.obterEndereco());
		
		aluno.imprimirEndereco();
		
		System.out.println("\n");
		
		professor.imprimirEndereco();
		
		System.out.println(Constantes.URL_BLOG);
		
		//impossivel pq eh final
		//Constantes.URL_BLOG = "ahbcauibc"; 

		
		
		

	}

}
