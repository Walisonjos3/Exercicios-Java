public class Curso {

    private Professor professor;
    private String nomeCurso;
    private int duracao;

    public Curso(Professor professor, String nomeCurso, int duracao) {
        this.professor = professor;
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
    }

    public void mostrarCurso() {
        System.out.printf("   <<<  CURSO %s    >>>%n", this.getNomeCurso().toUpperCase());
        System.out.printf("Duração: %dh%n", this.getDuracao());
        System.out.printf("Professor: %s%n", this.professor.getNome());
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public int getDuracao() {
        return this.duracao;
    }

}
