/*

OBJETIVO: PRÁTICA DE RELACIONAMENTO ENTRE CLASSES E OBJETOS COMPOSTOS.

   DESAFIO — Sistema de Clínica

   Classe Paciente
Atributos: nome, idade e documento.
Regras:
nome, idade e documento no construtor;
idade não pode ser negativa;

   Classe Médico
Atributos: nome, especialidade, CRM e disponível.
Regras:
começa disponível;
possuir métodos para disponibilizar/indisponibilizar;

   Classe Consulta

Atributos: paciente, médico, duração e consulta ativa.
Regras:
Uma consulta só pode ser criada se:
o médico estiver disponível;
a duração for maior que zero;
o médico ficará indisponível;
a consulta ficará ativa.

   Classe Clinica

Ela deve possuir três coleções: Pacientes, Médicos e Consultas.
O que a Classe Clinica deve fazer:
1. Cadastrar paciente;
2. Cadastrar médico;
3. Criar uma consulta;
4. Listar pacientes;
5. Listar médicos;
6. Listar consultas;
 */

public class Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Walison", 19, "8734-0");
        Paciente paciente2 = new Paciente("José", 34, "2314-0");
        Paciente paciente3 = new Paciente("Carlos", 24, "3435-0");

        Medico medico1 = new Medico("Ana", "Geral", 23420);
        Medico medico2 = new Medico("João", "Cirurgião", 21230);

        Clinica clinicaGeral = new Clinica();

        clinicaGeral.abrirClinica();

        clinicaGeral.cadastrarPaciente(paciente1);
        clinicaGeral.cadastrarMedico(medico1);
        clinicaGeral.cadastrarPaciente(paciente2);
        clinicaGeral.cadastrarMedico(medico2);
        clinicaGeral.cadastrarPaciente(paciente3);

        Consulta consulta1 = clinicaGeral.criarConsulta(paciente1, medico1, 60);

        if (consulta1 != null){
            consulta1.encerrarConsulta();
        }

        Consulta consulta2 = clinicaGeral.criarConsulta(paciente2, medico1, 40);

        if (consulta2 != null){
            consulta2.encerrarConsulta();
        }

        Consulta consulta3 = clinicaGeral.criarConsulta(paciente3, medico2, 30);

        if (consulta3 != null){
            consulta3.encerrarConsulta();
        }

        clinicaGeral.mostrarPacientes();
        clinicaGeral.mostrarMedicos();
        clinicaGeral.listarConsultas();


    }
}
