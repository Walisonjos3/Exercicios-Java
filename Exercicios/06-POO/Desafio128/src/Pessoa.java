public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        setIdade(idade);
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void mostrarPessoa() {
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Idade: %d%n", this.getIdade());
        System.out.printf("Sexo: %s%n", this.getSexo());
        System.out.printf("Experiência: %.1f%n", this.getExperiencia());
    }

    protected void ganharExp() {
        this.experiencia += 0.1;
        System.out.println("Ganhando experiência!!");
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

    public String getSexo() {
        return this.sexo;
    }

    public double getExperiencia() {
        return this.experiencia;
    }
}
