/*
    Ultimo exercício do curso de POO em Java do Gustavo Guanabara.

    Fiz esse exercício juntando todos os conceitos e conteúdos vistos no curso.
 */

public class Main {

    public static void main(String[] args) {

        Video videos[] = new Video[3];

        videos[0] = new Video("Exercício final do curso de POO");

        videos[1] = new Video("Primeira aula de Java");

        videos[2] = new Video("Aula sobre métodos em Java");

        Gafanhoto gafanhoto = new Gafanhoto("Walison", 19, "Masculino", "walison123");

        Visualizacao visualizacao1 = new Visualizacao(videos[0], gafanhoto);

        visualizacao1.mostrarVisualizacao();

        visualizacao1.avaliar();

        videos[0].mostrarVideo();

    }
}
