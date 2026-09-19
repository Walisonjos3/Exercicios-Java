public class Medico {

    private String nomeMedico;
    private String especialidade;
    private int crm; // Deixei o CRM como int para deixar como um código de identificação.
    private boolean medicoDisponivel;

    public Medico(String nome, String especialidade, int crm) {
        this.nomeMedico = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.medicoDisponivel = true;
    }

    public void disponibilizar() {
        if (this.medicoDisponivel) {
            System.out.println("Médico já disponível!");
        } else {
            this.medicoDisponivel = true;
        }
    }

    public void indisponibilizar() {
        if (!this.medicoDisponivel) {
            System.out.println("Médico já está indisponível!");
        } else {
            this.medicoDisponivel = false;
        }
    }

    public boolean getMedicoDisponivel() {
        return this.medicoDisponivel;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
}
