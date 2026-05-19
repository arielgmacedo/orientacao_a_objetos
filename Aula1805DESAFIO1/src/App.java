public class App {
    public static void main(String[] args) throws Exception {

        Produto produto1 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3.500;
        produto1.quantidadeEstoque = 30;

        double precoTotalP1 = produto1.preco * produto1.quantidadeEstoque;
        System.out.println("Valor total em estoque: " + precoTotalP1);

        Produto produto2 = new Produto();

        produto2.nome = "Mouse";
        produto2.preco = 200;
        produto2.quantidadeEstoque = 15;

        double precoTotalP2 = produto2.preco * produto2.quantidadeEstoque;
        System.out.println("Valor total em estoque: " + precoTotalP2);

        produto1.adicionarEstoque(15);
        System.out.println("Quantidade estoque P1: " + produto1.quantidadeEstoque);

        produto2.adicionarEstoque(10);
        System.out.println("Quantidade estoque P2:" + produto2.quantidadeEstoque);

    }
}
