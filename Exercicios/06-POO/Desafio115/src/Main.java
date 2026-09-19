/*
Criar classe secundária Aluno. Ela deve ter:
Atributos: nome, idade, nota1, nota2.

Método construtor recebe: nome, idade, nota1, nota2.

As notas começam em 0.

Regras:
A nota deve estar entre 0 e 10.
Caso contrário, mostrar: nota inválida.

A média deve ser calculada apenas pelo método calcularMedia().
O método mostrarAluno() deve exibir:
Nome:
Idade:
Nota 1:
Nota 2:
Média:
Situação:

Onde a situação será:
Aprovado (≥ 7)
Recuperação (≥ 5)
Reprovado (< 5)
 */

public class Main {

    public static void main(String[] args){
        Aluno l1 = new Aluno("Walison", 18, 7, 7);

        l1.mostrarAluno();
    }
}
