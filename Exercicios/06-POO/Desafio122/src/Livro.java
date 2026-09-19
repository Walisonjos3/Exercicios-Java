public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean livroAberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.livroAberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public void detalhesLivro() {
        System.out.println("----------------------------------");
        System.out.printf("Titulo: %s%n", this.titulo);
        System.out.printf("Autor: %s%n", this.autor);
        System.out.printf("Total de páginas: %d%n", this.totalPaginas);
        System.out.printf("Página atual: %d%n", this.paginaAtual);
        System.out.printf("O livro está aberto ? %b%n", this.livroAberto);
        System.out.printf("Leitor: %s%n", leitor.getNome());
    }

    @Override
    public void abrir() {
        this.livroAberto = true;
    }

    @Override
    public void fechar() {
        this.livroAberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina <= 0) {
            System.out.println("Página inválida!");
        } else if (pagina > this.totalPaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = pagina;
        }
    }

    @Override
    public void avancarPagina() {
        if (this.paginaAtual >= totalPaginas){
            System.out.println("O livro não tem mais páginas para avançar!");
        } else {
            this.paginaAtual++;
        }
    }

    @Override
    public void voltarPagina() {
        if (paginaAtual <= 0){
            System.out.println("O livro não pode voltar mais página, pois não tem páginas anteriores!");
        } else {
            this.paginaAtual--;
        }
    }
}
