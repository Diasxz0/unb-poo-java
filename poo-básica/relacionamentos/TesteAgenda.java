package exer_tem_mtos;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		//System.out.println(agenda);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome da Agenda: ");
		
		agenda.setNome(scan.nextLine());
		
		System.out.println("Contatos na agenda: ");
	
		int num = scan.nextInt();
		scan.nextLine();
		
		Contato lista_de_contatos[] = new Contato[num];
		
		
		for(int i = 0; i < num; i++) {
			
			lista_de_contatos[i] = new Contato();
			
			System.out.println("\n---Contato " + (i+1) + " ----");
			
			System.out.println("Nome: ");
			lista_de_contatos[i].setNome(scan.nextLine());
			
			System.out.println("Telefone: ");
			lista_de_contatos[i].setTelefone(scan.nextLine());
			
			System.out.println("Email: ");
			lista_de_contatos[i].setEmail(scan.nextLine());
			
		}
		
		scan.close();
		
		agenda.setContatos(lista_de_contatos);

		System.out.println("Imprimindo informações na agenda....");
		
		agenda.exibirAgenda();


	}
	
	public void imprimir_tudo(String info) {
		System.out.println(info);
	}

}
