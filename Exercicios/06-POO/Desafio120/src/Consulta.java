public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private int duracaoMinutos;
    private boolean consultaAtiva;

    public Consulta(Paciente paciente, Medico medico, int duracao) {
        if (!medico.getMedicoDisponivel()) {
            System.out.println("O médico está indisponível!");
        } else if (duracao <= 0) {
            System.out.println("Tempo de consulta inválido!");
        } else {
            this.paciente = paciente;
            this.medico = medico;
            this.duracaoMinutos = duracao;
            this.consultaAtiva = true;
            this.medico.indisponibilizar();
        }
    }

    public void mostarConsulta() {
        if (this.consultaAtiva) {
            System.out.println("---------------------------------");
            System.out.printf("Paciente: %s%n", getPaciente().getNome());
            System.out.printf("Médico: %s%n", getMedico().getNomeMedico());
            System.out.printf("Duração: %d min%n", this.duracaoMinutos);
            System.out.println("Consulta iniciada!");
        } else {
            System.out.println("Não tem consulta agendada!");
        }
    }

    public void encerrarConsulta() {
        if (this.consultaAtiva) {
            this.consultaAtiva = false;
            medico.disponibilizar();
            System.out.println("Consulta encerrada!");
        } else {
            System.out.println("A consulta já foi encerrada!");
        }
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public Medico getMedico() {
        return this.medico;
    }

}
