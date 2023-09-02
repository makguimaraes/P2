public class Produto {

    String nome;
    double preco, vlr_estoque;
    int qtd_estoque;

    public String AdicionarEstoque(int unidades) {
        qtd_estoque = qtd_estoque + unidades;
        return "Foram adicionadas " + unidades + ", e agora há " + qtd_estoque + "unidades.";
    }

    public String VenderProdutos(int unidades, double preco) {
        qtd_estoque = qtd_estoque - unidades;
        return "Foram vendidas " + unidades + ", por R$" + unidades * preco + "e resta um estoque de " + qtd_estoque + "unidades.";
     }

    public String ExibirEstoque(int qtd_estoque, String nome, double preco) {
        return String.format("Há %d unidades de %s no estoque, totalizando um valor de R$ %.2f.", qtd_estoque, nome, qtd_estoque * preco);
    }

}
