public class Hospede {

    private String nome;
    private int idade;
    private String documento;

    public Hospede(String nome, int idade, String documento) {
        this.nome = nome;
        setIdade(idade);

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) { // Criei o setIdade() porque achei que ficaria mais organizado, para não encher o método construtor com verificação de idade.
        if (idade < 0){                // E claro, deixei o setter privado!
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }
}
