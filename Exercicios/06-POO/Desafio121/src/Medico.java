public class Medico {

    private String nome;
    private String especialidade;
    private int crm;
    private boolean disponivel;

    public Medico(String nome, String especialidade, int crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.disponivel = true;
    }

    public void disponibilizar() {
        this.disponivel = true;
    }

    public void indisponibilizar() {
        this.disponivel = false;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

}
