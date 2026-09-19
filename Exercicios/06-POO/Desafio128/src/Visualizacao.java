public class Visualizacao {

    private Video filme;
    private Gafanhoto espectador;

    public Visualizacao(Video filme, Gafanhoto espectador) {
        this.filme = filme;
        this.espectador = espectador;

        this.espectador.setTotalVideoAssistidos(this.espectador.getTotalVideoAssistidos() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void mostrarVisualizacao() {
        this.getEspectador().mostrarGafanhoto();
        System.out.printf("Assistindo o vídeo: %s%n", this.getFilme().getTitulo());
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcentagem) {

        if (porcentagem < 0 || porcentagem > 100) {
            System.out.println("Porcentagem inválida!");
        } else {
            
            double total;

            if (porcentagem > 0 && porcentagem <= 20) {
                total = 3;
            } else if (porcentagem <= 50) {
                total = 5;
            } else if (porcentagem <= 90) {
                total = 8;
            } else {
                total = 10;
            }

            this.filme.setAvaliacao(total);
        }
    }

    public Video getFilme() {
        return this.filme;
    }

    public Gafanhoto getEspectador() {
        return this.espectador;
    }

}
