public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        setIdade(idade);
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.idade += 1;
    }

    public String getNome() {
        return this.nome;
    }

    private void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }
}
