public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void mostrarPessoa() {
        System.out.println("   <<<  ALUNO  >>>");
        super.mostrarPessoa();
        System.out.printf("Matrícula: %d%n", this.getMatricula());
        System.out.printf("Curso: %s%n", this.getCurso().toUpperCase());
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }
}
