public class Paciente {

    private String nome;
    private int idade;
    private String documento;

    public Paciente(String nome, int idade, String documento) {
        this.nome = nome;
        setIdade(idade);
        this.documento = documento;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }
}
