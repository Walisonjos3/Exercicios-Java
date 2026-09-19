public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Walison", 19, 'M', 1234, "ADS");
        Professor professor1 = new Professor("José", 34, 'M', "Matemática", 1620.00);

        aluno1.mostrarDados();
        aluno1.fazerAniversario();
        aluno1.mostrarDados();

        professor1.mostrarDados();
        professor1.fazerAniversario();
        professor1.mostrarDados();
    }
}