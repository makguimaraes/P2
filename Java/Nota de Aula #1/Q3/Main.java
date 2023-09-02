import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("\nSISTEMA DE CONTROLE DE ESTOQUE\n");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.print("\nQual o nome do produto que deseja adicionar ao estoque? ");
        String nome_prod = sc.nextLine();

        System.out.print("Quantas unidades deseja adicionar ao estoque? ");
        int estoque_prod = sc.nextInt();

        System.out.printf("Qual o preço de %s? R$ ", nome_prod);
        double preco_prod = sc.nextDouble();

        sc.nextLine();

        System.out.print("\nDeseja exibir o estoque? (S/N): ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("S")) {
            System.out.println(prod.ExibirEstoque(estoque_prod, nome_prod, preco_prod));
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.printf("\nQuantas unidades de %s deseja vender? ", nome_prod);
        int prod_vendidos = sc.nextInt();
        estoque_prod = estoque_prod - prod_vendidos;
        System.out.printf("A venda de %d unidades de %s totalizou R$ %.2f.\n", prod_vendidos, nome_prod, prod_vendidos * preco_prod);

        sc.nextLine();

        System.out.print("\nDeseja exibir o estoque? (S/N): ");
        opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("S")) {
            System.out.println(prod.ExibirEstoque(estoque_prod, nome_prod, preco_prod));
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }

}
