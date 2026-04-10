package exer_Receita;

public class TesteReceita {

	public static void main(String[] args) {
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		
		contribuintes[0] = new PessoaFisica("Brunno", 10000);
		
		contribuintes[1] = new PessoaFisica("Dudu", 13000);
		
		contribuintes[2] = new PessoaFisica("Matheus", 11000);
		
		contribuintes[3] = new PessoaJuridica("Master", 50000);
		
		contribuintes[4] = new PessoaJuridica("Uber", 1300);
		
		contribuintes[5] = new PessoaJuridica("Rota de casa", 12400);
		
		
		for(Contribuinte c : contribuintes) {
			System.out.printf("\n\t-------------------------\n");
			System.out.printf("\tNome: %s", c.getNome());
			System.out.printf("\n\tImposto a Pagar: %.2f", c.deduzirImposto());
		}
	}

}
