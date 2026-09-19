public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void fazerAniversario() {
        super.fazerAniversario();
        System.out.printf("Feliz aniversário para mim!! %s%n", this.getNome());
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com sucesso!");
    }
}
