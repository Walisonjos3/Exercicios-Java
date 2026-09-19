public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String name, double preco, int quantidade){
        setNome(name);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void mostrarProduto(){
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Preço: R$ %.2f%n", getPreco());
        System.out.printf("Quantidade: %d%n%n", getQuantidade());
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double valor){
        if (valor >= 0){
            this.preco = valor;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    private void setQuantidade(int totalQuantidade){
        if (totalQuantidade >= 0){
            this.quantidade = totalQuantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public void vender(int unidades){
        if (unidades <= 0){
            System.out.println("Quantidades inválidas!");
        } else if (unidades > this.quantidade){
            System.out.println("Não temos esse total de unidades no estoque!");
        } else {
            this.quantidade -= unidades;
            System.out.printf("Total da compra: R$ %.2f%n", getPreco() * unidades);
            System.out.println("Obrigado! Volte sempre.\n");
        }
    }

    public void comprar(int unidades){
        if (unidades <= 0){
            System.out.println("Compra inválida!");
        } else {
            this.quantidade += unidades;
            System.out.println("Compra realizada com sucesso!\n");
        }
    }

}
