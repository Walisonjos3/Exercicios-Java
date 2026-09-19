public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private int duracaoConsulta;
    private boolean consultaAtiva;

    public Consulta(Paciente paciente, Medico medico, int duracao) {
        if (!medico.isDisponivel()) {
            System.out.println("O médico está indisponível no momento!");
        } else if (duracao <= 0) {
            System.out.println("O tempo da consulta está inválido!");
        } else {
            this.paciente = paciente;
            this.medico = medico;
            this.duracaoConsulta = duracao;
            this.consultaAtiva = true;
            medico.indisponibilizar();
        }
    }

    public void mostrarConsulta() {
        if (this.consultaAtiva) {
            System.out.println("\n------------------------------------");
            System.out.println("  <<<  Consulta em andamento  >>>\n");
            System.out.printf("Paciente: %s%n", this.paciente.getNome());
            System.out.printf("Médico: Dr. %s%n", this.medico.getNome());
            System.out.printf("Duração: %d minutos%n", this.duracaoConsulta);
        } else {
            System.out.println("Consulta não agendada!");
        }
    }

    public void encerrarConsulta() {
        if (this.consultaAtiva){
            this.consultaAtiva = false;
            this.medico.disponibilizar();
            System.out.println("Consulta encerrada!");
        } else {
            System.out.println("A consulta já foi encerrada!");
        }
    }

    public boolean isConsultaAtiva() {
        return this.consultaAtiva;
    }
}
