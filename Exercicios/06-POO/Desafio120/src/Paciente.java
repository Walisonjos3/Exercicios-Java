public class Paciente {

    private String nome;
    private int idade;
    private String documento;

    public Paciente(String nome, int idade, String documento) {
        if (idade < 0) { // Essa forma pode ser correta ? Pensei que se a idade não fosse válida, os outros atributos não poderia receber essas outras variáveis. O que você acha disso ??
            System.out.println("Idade inválida!");
        } else {
            this.nome = nome;
            this.idade = idade;
            this.documento = documento;
        }
    }

    public String getNome() {
        return this.nome;
    }
}
