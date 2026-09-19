public class Video implements AcoesVideo {

    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private int quantidadeAvaliacoes;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void mostrarVideo() {
        System.out.printf("   <<<  %s  >>>%n", this.getTitulo());
        System.out.printf("Avaliações: %.1f%n", this.getAvaliacao());
        System.out.printf("Views: %d%n", this.getViews());
        System.out.printf("Curtidas: %d%n", this.getCurtidas());
        System.out.printf("Está reproduzindo ? %b%n", this.isReproduzindo());
    }


    @Override
    public void play() {
        if (this.reproduzindo) {
            System.out.println("O vídeo já está sendo reproduzindo!");
        } else {
            this.reproduzindo = true;
            System.out.println("Reproduzindo...");
        }
    }

    @Override
    public void pause() {
        if (this.reproduzindo) {
            this.reproduzindo = false;
            System.out.println("Vídeo pausado!");
        } else {
            System.out.println("O vídeo já está pausado!");
        }

    }

    @Override
    public void like() {
        this.curtidas++;
        System.out.println("Obrigado pelo like!");
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getAvaliacao() {
        return this.avaliacao;
    }

    protected void setAvaliacao(double avaliacao) {
        if (avaliacao <= 0 || avaliacao > 10) {
            System.out.println("Avaliação inválida!");
        } else {
            this.avaliacao = ((this.avaliacao * this.quantidadeAvaliacoes) + avaliacao) / (this.quantidadeAvaliacoes + 1);
            this.quantidadeAvaliacoes++;
        }
    }

    public int getViews() {
        return this.views;
    }

    protected void setViews(int views) {
        if (views < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.views = views;
        }
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }
}
