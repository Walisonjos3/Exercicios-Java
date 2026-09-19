// Exercício para prática de classe abstratas e entender melhor o conceito de subclasses!

public class Main {

    public static void main(String[] args) {
        Aluno l1 = new Aluno("Walison", 19, 'M', 1234, "ADS");
        Professor p1 = new Professor("José", 34, 'M', "Matemática", 1620.00);

        l1.mostrarDados();

        p1.fazerAniversario();


        l1.fazerAniversario();
    }
}
