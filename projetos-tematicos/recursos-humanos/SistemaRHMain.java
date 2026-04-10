package folha_Pagamento;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    FolhaPagamento folha = new FolhaPagamento();
	    boolean continuar = true;

	    while (continuar) {
	        System.out.println("\n1 - Adicionar \n2 - Listar \n0 - Sair");
	        int escolha = scan.nextInt();
	        scan.nextLine(); 

	        switch (escolha) {
	            case 1:
	                try {
	                    System.out.print("Nome: ");
	                    String nome = scan.nextLine();

	                    System.out.print("Salário: ");
	                    double salario = scan.nextDouble();
	                    if (salario < 0) throw new SalarioInvalido();

	                    System.out.print("ID: ");
	                    int id = scan.nextInt();

	                    System.out.println("\n1 - Desenvolvedor \n2 - Gerente \n3 - Estagiario");
	                    int tipo = scan.nextInt();
	                    scan.nextLine(); 

	                    if (tipo == 1) {
	                        System.out.print("Linguagem: ");
	                        String linguagem = scan.nextLine();
	                        folha.adicionarFuncionario(new Desenvolvedor(nome, id, salario, linguagem));
	                    } else if (tipo == 2) {
	                        System.out.print("Bonificação Anual: ");
	                        double bonus = scan.nextDouble();
	                        folha.adicionarFuncionario(new Gerente(nome, id, salario, bonus));
	                    } else if (tipo == 3) {
	                        folha.adicionarFuncionario(new Estagiario(nome, id, salario));
	                    }
	                    
	                    System.out.println("Cadastrado com sucesso!");

	                } catch (SalarioInvalido e) {
	                    System.err.println(e.getMessage());
	                } catch (Exception e) {
	                    System.err.println("Erro na entrada de dados.");
	                    scan.nextLine(); 
	                }
	                break; 

	            case 2:
	                folha.listarRelatorio();
	                System.out.println("Total da Folha: R$ " + folha.calcularTotalFolha());
	                break;

	            case 0:
	                continuar = false;
	                break;
	        }
	    }
	    scan.close();
	}
}
