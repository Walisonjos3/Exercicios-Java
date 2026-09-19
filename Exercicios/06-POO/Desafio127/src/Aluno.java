public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com sucesso!");
    }

    public void cancelarMatricula() {
        this.matricula = 0;
        this.curso = "";
        System.out.println("Matrícula cancelada com sucesso!");
    }

    public void mostrarAluno() {
        System.out.println("   <<<  ALUNO  >>>");
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Idade: %d%n", this.getIdade());
        System.out.printf("Sexo: %s%n", this.getSexo());
        System.out.printf("Matrícula: %d%n", this.getMatricula());
        System.out.printf("Curso: %s%n", this.getCurso());
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

}
