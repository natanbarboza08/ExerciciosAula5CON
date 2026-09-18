public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Mouse", 200.00, 20);
        Produto produto3 = new Produto("Teclado", 300.00, 15);

        System.out.println("Detalhes dos produtos:");
        produto1.exibirProduto();

        System.out.println("\nDetalhes dos produtos:");
        produto2.exibirProduto();
        
        System.out.println("\nDetalhes dos produtos:");
        produto3.exibirProduto();

    }
}