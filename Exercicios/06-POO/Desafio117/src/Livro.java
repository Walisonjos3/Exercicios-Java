public class Livro {

    private String titulo;
    private String autor;
    private int quantidadeDisponivel;
    private int quantidadeEmprestados;

    public Livro(String nomeTitulo, String nomeAutor) {
        this.titulo = nomeTitulo;
        this.autor = nomeAutor;
        this.quantidadeDisponivel = 0;
        this.quantidadeEmprestados = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getQuantidadeDisponivel() {
        return this.quantidadeDisponivel;
    }

    public int getQuantidadeEmprestados() {
        return this.quantidadeEmprestados;
    }

    public void emprestar(int quantidade){
        if (quantidade > 0) {
            if (this.quantidadeDisponivel >= quantidade) {
                this.quantidadeDisponivel -= quantidade;
                this.quantidadeEmprestados += quantidade;
                System.out.println(quantidade + " exemplares emprestados!");
            } else {
                System.out.println("Não há exemplares suficientes!");
            }
        } else {
            System.out.println("Impossível empréstar quantidade negativa ou igual a zero!");
        }
    }

    public void mostrarLivro() {
        System.out.println("  <<<  MENU  >>>");
        System.out.printf("Titulo: %s%n", getTitulo());
        System.out.printf("Autor: %s%n", getAutor());
        System.out.printf("Disponíveis: %d%n", getQuantidadeDisponivel());
        System.out.printf("Emprestados: %d%n%n", getQuantidadeEmprestados());
    }

    public void devolver(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEmprestados < quantidade) {
                System.out.println("Devolução inválida!");
            } else {
                this.quantidadeEmprestados -= quantidade;
                this.quantidadeDisponivel += quantidade;
                System.out.println("Devolução realizada com sucesso!");
            }
        } else {
            System.out.println("Impossível devolver quantidade negativa ou igual a zero!");
        }
    }

    public void adicionarExemplares(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Impossível adicionar valores negativos ou igual a zero!");
        } else {
            this.quantidadeDisponivel += quantidade;
        }
    }


}
