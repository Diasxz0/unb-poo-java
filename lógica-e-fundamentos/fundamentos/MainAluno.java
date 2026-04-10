package orientacao;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.println("Nome do Aluno: ");
		aluno.setNome(scan.nextLine());
		scan.close();
	}

}
