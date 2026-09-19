import java.util.ArrayList;

public class Clinica {

    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Consulta> consultas = new ArrayList<>();

    private boolean clinicaAberta;

    public Clinica() {
        this.clinicaAberta = false;
    }

    public void abrirClinica() {
        if (this.clinicaAberta) {
            System.out.println("A clinica já está aberta!");
        } else {
            this.clinicaAberta = true;
            System.out.println("Clinica aberta!");
        }
    }

    public void fecharClinica() {
        if (this.clinicaAberta){
            this.clinicaAberta = false;
            System.out.println("Clinica fechada!");
        } else {
            System.out.println("A clinica já está fechada!");
        }
    }

    public void cadastrarPaciente(Paciente paciente) {
        if (this.clinicaAberta) {
            pacientes.add(paciente);
        } else {
            System.out.println("Impossível cadastrar: Clinica fechada!");
        }
    }

    public void cadastrarMedico(Medico medico) {
        if (this.clinicaAberta) {
            medicos.add(medico);
        } else {
            System.out.println("Impossível cadastrar: Clinica fechada!");
        }
    }

    public Consulta criarConsulta(Paciente paciente, Medico medico, int duracao) {
        if (this.clinicaAberta) {
            Consulta consulta1 = new Consulta(paciente, medico, duracao);

            if (consulta1.isConsultaAtiva()) {
                consultas.add(consulta1);
                System.out.println("Consulta agendada com sucesso!");
                return consulta1;
            } else {
                System.out.println("Consulta inválida!");
                return null;
            }
        }else {
            System.out.println("Impossível criar consulta: Clinica fechada!");
            return null;
        }
    }

    public void mostrarPacientes() {
        if (this.clinicaAberta) {
            System.out.println("\n  =====  PACIENTES  =====\n");
            for (Paciente paciente : pacientes) {
                System.out.printf("Nome: %s%n", paciente.getNome());
                System.out.printf("Idade: %d%n%n", paciente.getIdade());
            }
        } else {
            System.out.println("Impossível listar pacientes: Clinica fechada!");
        }
    }

    public void mostrarMedicos() {
        if (this.clinicaAberta) {
            System.out.println("\n  =====  MÉDICOS  =====\n");
            for (Medico medico : medicos) {
                System.out.printf("Nome: Dr. %s%n", medico.getNome());
                System.out.printf("Especialidade: %s%n", medico.getEspecialidade());
                System.out.printf("Disponível: %b%n%n", medico.isDisponivel());
            }
        } else {
            System.out.println("Impossível listar médicos: Clinica fechada!");
        }
    }

    public void listarConsultas() {
        if (this.clinicaAberta) {
            for (Consulta consulta : consultas) {
                consulta.mostrarConsulta();
                System.out.println();
            }
        } else {
            System.out.println("Impossível listar consultas: Clinica fechada!");
        }
    }
}
