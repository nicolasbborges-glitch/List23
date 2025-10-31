package firstProject;

public class MainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setNome("Mouse");
        p1.setPreco(59.90);
        p1.setEstoque(15);

        p2.setNome("Teclado");
        p2.setPreco(99.90);
        p2.setEstoque(8);

        System.out.println(p1.getNome() + " - Preço: " + p1.getPreco() + " - Estoque: " + p1.getEstoque());
        System.out.println(p2.getNome() + " - Preço: " + p2.getPreco() + " - Estoque: " + p2.getEstoque());
    }
}
