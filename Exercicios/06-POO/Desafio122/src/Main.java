
public class Main {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];

        Livro[] livros = new Livro[2];

        pessoas[0] = new Pessoa("Walison", 19, 'M');
        pessoas[1] = new Pessoa("Maria", 34, 'F');

        livros[0] = new Livro("Homen-Aranha", "Carlos", 300, pessoas[0]);
        livros[1] = new Livro("Thor", "José", 350, pessoas[1]);

        livros[0].abrir();
        livros[0].folhear(100);
        livros[0].avancarPagina();
        livros[0].voltarPagina();
        livros[0].detalhesLivro();
        livros[0].fechar();
        livros[0].detalhesLivro();

        livros[1].abrir();
        livros[1].avancarPagina();
        livros[1].detalhesLivro();

    }
}
