/*
Criar uma classe chamada Livro.
Ela representa um livro disponível em uma biblioteca.
O livro possui: título, autor, quantidade disponível e quantidade de exemplares emprestados.

Regras
1. O título e o autor devem ser informados quando o objeto for criado.
2. A quantidade disponível começa em 0.
3. Não pode adicionar uma quantidade negativa de livros.
4. A biblioteca pode receber novos exemplares.
 */

public class Main {

    public static void main(String[] args){
        Livro livro = new Livro("Homem Aranha", "Tom");

        livro.adicionarExemplares(5);
        livro.mostrarLivro();
        livro.emprestar(2);
        livro.mostrarLivro();
        livro.devolver(2);
        livro.mostrarLivro();
    }
}
