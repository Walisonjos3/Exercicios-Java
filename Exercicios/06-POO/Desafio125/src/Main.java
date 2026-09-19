/*
Exercício para prática de herança e classes abstratas.

O objetivo aqui é perceber: Aluno é uma Pessoa. Professor é uma Pessoa.

Mas: Curso tem um Professor.
 */
public class Main {

    public static void main(String[] args) {
        Professor p1 = new Professor("José", 34, "Português");

        Aluno l1 = new Aluno("Walison", 29, 12345, "ads");

        Curso c1 = new Curso(p1, "ads", 500);

        c1.mostrarCurso();

        l1.mostrarPessoa();

        p1.mostrarPessoa();
    }
}
