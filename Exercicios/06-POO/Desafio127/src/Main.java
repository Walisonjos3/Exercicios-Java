/*
  Desafio — Sistema de uma Faculdade

Criar classes: Pessoa, Aluno, Professor e Curso.


Objetivo: Práticar herança e classe abstrata!
 */

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Walison", 19, "Masculino", 1235, "ADS");

        Professor professor1 = new Professor("José", 34, "Masculino", "Lógica para Programação", 5000.00);

        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas", 2400, professor1);

        curso1.abrirCurso();

        curso1.adicionarAluno(aluno1);

        curso1.mostrarCurso();

        curso1.removerAluno(0);

        curso1.mostrarCurso();

    }
}
