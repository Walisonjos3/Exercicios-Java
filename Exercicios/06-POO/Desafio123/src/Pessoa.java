public abstract class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void mostrarDados() {
        System.out.println("  <<<  DADOS  >>>");
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Idade: %d%n", this.getIdade());
        System.out.printf("Sexo: %c%n", this.getSexo());
    }

    public void fazerAniversario() {
        this.idade += 1;
        System.out.println("Feliz aniversário para mim!!");
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }
}