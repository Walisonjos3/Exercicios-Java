public abstract class Pessoa {

    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarPessoa() {
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Idade: %d anos%n", this.getIdade());
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
