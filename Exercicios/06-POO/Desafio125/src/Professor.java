public class Professor extends Pessoa {

    private String especialidade;

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarPessoa() {
        System.out.println("   <<<  PROFESSOR  >>>");
        super.mostrarPessoa();
        System.out.printf("Especialidade: %s%n", this.getEspecialidade());
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
}
