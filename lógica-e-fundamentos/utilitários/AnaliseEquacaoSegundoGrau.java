package calculat;

import java.util.Scanner;

public class SomaEProduto {
    public static void main(String[] args) {

        double a, b, c, soma, produto;
        String mensagem;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor de a na expressão?");
        a = scanner.nextDouble();

        System.out.println("Qual o valor de b da expressão?");
        b = scanner.nextDouble();

        System.out.println("Qual o valor de c na expressão?");
        c = scanner.nextDouble();

        soma = -1 * b / a;
        produto = c / a;

        mensagem = (soma > 1 && produto > 1) ? 
            "Os dois valores de x têm o mesmo sinal" : 
            "Os valores de x têm sinais diferentes";

        System.out.println(mensagem);

        scanner.close(); 
    }
}
