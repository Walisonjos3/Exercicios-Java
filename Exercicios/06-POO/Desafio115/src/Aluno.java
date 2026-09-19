public class Aluno {

    private String nome;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String name, int idadeAnos, double nota1, double nota2){
        this.nome = name;
        this.idade = idadeAnos;

        setNota1(nota1);
        setNota2(nota2);
    }

    public void mostrarAluno(){
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Idade: %d%n", getIdade());
        System.out.printf("Nota 1: %.2f%n", getNota1());
        System.out.printf("Nota 2: %.2f%n", getNota2());
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.printf("Situação: %s%n", situacaoAluno());
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getNota1(){
        return this.nota1;
    }

    public void setNota1(double nota){
        if(nota >= 0 && nota <= 10){
            this.nota1 = nota;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public double getNota2(){
        return this.nota2;
    }

    public void setNota2(double nota){
        if(nota >= 0 && nota <= 10){
            this.nota2 = nota;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public String situacaoAluno(){
        double media = calcularMedia();
        String situacao = "";

        if (media < 5){
            situacao = "Reprovado";
        } else if (media < 7) {
            situacao = "Recuperação";
        } else {
            situacao = "Aprovado";
        }

        return situacao;
    }

}
