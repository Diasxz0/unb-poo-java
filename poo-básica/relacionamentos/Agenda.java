package exer_tem_mtos;



public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	
	
	public Agenda() {
	}
	
	
	public Agenda(String nome, Contato[] contatos) {
		this.nome = nome;
		this.contatos = contatos;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public void exibirAgenda() {
		System.out.println("----- " + this.nome.toUpperCase() + "------");
		
		if( this.contatos != null) {
			int count = 1;
			for(Contato c : this.contatos) {
				System.out.println("Contato "+ count);
				System.out.println("Nome: " + c.getNome());
				System.out.println("telefone: " + c.getTelefone());
				System.out.println("Email: " + c.getEmail());
				System.out.println("--------------------");
				count++;
			}
		} else {
			System.out.println("Sua lista não possui contatos");
		}
	}


	
	public String toString() {
		return "Agenda de Contatos";
	}
	
	
}
