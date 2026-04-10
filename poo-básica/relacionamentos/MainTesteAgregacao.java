package orientacao;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		Endereco endereco = new Endereco();
		
		Telefone telefone = new Telefone();
		telefone.setDdd("061");
		telefone.setNumero("9804-8153");
		telefone.setTipo("Celular");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd("011");
		telefone2.setNumero("1234-5678");
		telefone2.setTipo("Fixo");
		
		Telefone  telefones[] = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		endereco.setNomeRua("Pau Brasil");
		endereco.setCep("71926-500");
		endereco.setComplemento("bloco B ed ALL");
		endereco.setEstado("DF");
		endereco.setNumero("1705");
		
		contato.setEndereco(endereco);
		
		contato.setNome("Warlley");
		
		// contato.setEndereco("Quadra 208 sul");
		//contato.setTelefone("61 9 9804-8153");
		
		System.out.println(contato.getNome());
		
		//System.out.println(contato.getTelefone());
		
		
		
		//contato.setTelefone(telefone);
		
		//verificação p ver se nem o tipo contato nem o get endereco eh nulo
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCep());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getNumero());
		}*/
		
		
		if( contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		
	}

}
