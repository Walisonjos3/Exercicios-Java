public class Livro {

    private Aluno leitor;
    private String titulo;
    private String autor;
    private int paginas;
    private boolean livroAberto;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.leitor = null;
    }

    public void abrirLivro() {
        this.livroAberto = true;
        System.out.println("Livro aberto!");
    }

    public void fecharLivro() {
        this.livroAberto = false;
        System.out.println("Livro fechado!");
    }

    public void emprestarLivro(Aluno aluno) {
        if (!this.isLivroAberto()) {
            if (this.leitor != null) {
                System.out.println("Livro já está emprestado!");
            } else {
                this.leitor = aluno;
                System.out.println("Livro emprestado!");
            }
        } else {
            System.out.println("Impossível emprestar o livro estando aberto!");
        }
    }

    public void devolver() {
        if (!this.isLivroAberto()) {
            if (this.leitor == null) {
                System.out.println("O livro já foi devolvido!");
            } else {
                this.leitor = null;
                System.out.println("A devolução foi um sucesso!");
            }
        } else {
            System.out.println("Impossível devolver o livro estando aberto!");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("   <<<  LIVRO  >>>");
        System.out.printf("Titulo: %s%n", this.getTitulo());
        System.out.printf("Autor: %s%n", this.getAutor());
        System.out.printf("Total de páginas: %d%n", this.getPaginas());
        System.out.printf("Livro aberto ? %b%n", this.isLivroAberto());
        System.out.printf("Tem leitor ? %b%n", this.leitor != null);
        if (null == this.leitor) {
            System.out.println("Leitor: Nenhum");
        } else {
            System.out.printf("Leitor: %s%n", this.getLeitor().getNome());
        }
    }

    public Aluno getLeitor() {
        return this.leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public boolean isLivroAberto() {
        return this.livroAberto;
    }

}
