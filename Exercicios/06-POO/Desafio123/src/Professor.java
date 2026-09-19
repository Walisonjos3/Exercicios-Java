public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public void fazerAniversario() {
        super.fazerAniversario();
        System.out.printf("Aniversário do Pf. %s%n", this.getNome());
    }

    public void receberAumento(double novoSalario) {
        this.salario += novoSalario;
    }
}
