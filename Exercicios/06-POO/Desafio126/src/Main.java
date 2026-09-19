/*
  Desafio — Biblioteca 📚

Criar classes: Pessoa, Aluno e Livro. Cada classe deverá ter seus atributos.

Regras:

Um livro só pode ser emprestado se não tiver leitor.

Se já estiver emprestado: "Livro já está emprestado!"

Quando devolver: leitor = null;
 */

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Walison", 19, 1234, "ads");

        Livro livro1 = new Livro("Homem-Aranha", "José", 500);

        livro1.abrirLivro();
        livro1.fecharLivro();
        livro1.emprestarLivro(aluno1);
        livro1.mostrarDetalhes();
        livro1.devolver();
        livro1.mostrarDetalhes();
    }
}
