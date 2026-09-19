/*
Criar classe secundária Produtos.

Atributos: nome, preço e quantidade.
Utilizar o método construtor.

Regras:
preço não pode ser negativo;
quantidade não pode ser negativa;
não pode vender mais produtos do que existem no estoque;
comprar aumenta o estoque;
vender diminui o estoque.
 */

public class Main {

    public static void main(String[] args){
        Produto caneca = new Produto("CursoEmVideo", 15.50, 5);

        caneca.mostrarProduto();
        caneca.vender(3);
        caneca.mostrarProduto();
        caneca.comprar(9);
        caneca.mostrarProduto();

    }
}
