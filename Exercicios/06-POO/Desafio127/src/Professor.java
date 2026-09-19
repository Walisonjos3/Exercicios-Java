public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(double salario) {
        if (salario < 0) {
            System.out.println("Salário inválido!");
        } else {
            this.salario += salario;
            System.out.printf("Eu Pf. %s recebi um aumento de R$ %.2f%n", this.getNome(), this.getSalario());
        }
    }

    public void mostrarProfessor() {
        System.out.println("   <<<  PROFESSOR  >>>");
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Idade: %d%n", this.getIdade());
        System.out.printf("Sexo: %s%n", this.getSexo());
        System.out.printf("Especialidade: %s%n", this.getEspecialidade());
        System.out.printf("Salário: R$ %.2f%n", this.getSalario());
    }

    public double getSalario() {
        return this.salario;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
}
