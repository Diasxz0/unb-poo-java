package projeto;

public class Agenda {

	private Contato[] contatos;
	

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public Agenda() {
		super();
	}
	
	public Agenda(int tamanho) {
		this.contatos = new Contato[tamanho];
	}

	public Agenda(Contato[] contatos) {
		super();
		this.contatos = contatos;
	}
	
	public void adicionarContato(Contato novo) throws AgendaCheia{
		boolean adicionou = false;
		
		for(int i = 0; i < contatos.length; i++) {
			
			if(contatos[i] == null) {
				contatos[i] = novo;
				adicionou = true;
				break;

			}
		}
		if(!adicionou)
			throw new AgendaCheia();
	}
	
	public Contato consultarContato(String nomeBusca) throws ContatoNaoExiste{
		
		for(int i = 0; i < contatos.length; i++) {
			
			if(contatos[i] != null) {
				
				if(contatos[i].getNome().equals(nomeBusca)) {
					return contatos[i];
				}
			}
			
		}
		
		throw new ContatoNaoExiste();
		
	}
	
}
