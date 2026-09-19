public class Curso {

    private String nomeCurso;
    private int cargaHoraria;
    private Professor professor;
    private Aluno[] alunos;
    private boolean cursoAberto;
    private int contadorAlunos;

    public Curso(String nomeCurso, int cargaHoraria, Professor professor) {
        if (cargaHoraria <= 0) {
            System.out.println("Carga horária inválida!!");
        } else {
            this.cargaHoraria = cargaHoraria;
        }
        this.nomeCurso = nomeCurso;
        this.professor = professor;
        this.alunos = new Aluno[10]; // Defini 10 espaços na lista para testar o programa!
        this.cursoAberto = false;
    }

    public void abrirCurso() {
        this.cursoAberto = true;
    }

    public void fecharCurso() {
        this.cursoAberto = false;
    }

    public void adicionarAluno(Aluno aluno) {
        if (this.isCursoAberto()) {
            this.alunos[contadorAlunos] = aluno;
            contadorAlunos++;
            System.out.printf("O aluno %s foi adicionado ao curso com sucesso!%n", aluno.getNome());
        } else {
            System.out.println("Impossível adicionar: O CURSO ESTÁ FECHADO!");
        }
    }

    public void removerAluno(int indice) {
        if (this.isCursoAberto()) {
            if (indice < 0) {
                System.out.println("Aluno não encontrado!");
            } else if (this.alunos[indice] == null) {
                System.out.printf("O aluno da posição %d já foi removido!%n", indice);
            } else {
                System.out.printf("O aluno %s foi removido!%n", this.alunos[indice].getNome());
                this.alunos[indice] = null;
            }
        } else {
            System.out.println("Impossível remover: O CURSO ESTÁ FECHADO!");
        }
    }

    public void mostrarCurso() {
        if (this.isCursoAberto()) {
            System.out.println("===============================================");

            System.out.printf("Curso: %s%n", this.getNomeCurso());
            System.out.printf("Carga horária: %d horas%n%n", this.getCargaHoraria());

            System.out.println("Professor: ");
            System.out.printf("Nome: %s%n", this.getProfessor().getNome());
            System.out.printf("Especialidade: %s%n%n", this.getProfessor().getEspecialidade());

            if (null == this.alunos) {
                System.out.println("O curso ainda não tem alunos!");
            } else {
                System.out.println("Alunos: ");
                int i = 1;
                for (Aluno pessoa : alunos) {
                    if (null == pessoa) {
                        continue;
                    } else {
                        System.out.println(i + " - " + pessoa.getNome());
                        i++;
                    }
                }
                System.out.println("===============================================");
            }
        } else {
            System.out.println("Impossível mostrar: O CURSO ESTÁ FECHADO!");
        }
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public boolean isCursoAberto() {
        return this.cursoAberto;
    }

}
