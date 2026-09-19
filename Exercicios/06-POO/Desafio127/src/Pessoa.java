public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        setIdade(idade);
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.idade += 1;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }
}
