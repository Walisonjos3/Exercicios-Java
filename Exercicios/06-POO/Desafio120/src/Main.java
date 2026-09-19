/*
EXERCÍCIO PARA PRÁTICA DE RELACIONAMENTO ENTRE CLASSES E OBJETOS COMPOSTOS

  <<<  DESAFIO — Consulta Médica  >>>

   < Classe Paciente >
Atributos: nome, idade e documento.

Regras:
Nome, idade e documento devem ser informados no construtor.
A idade não pode ser negativa.

   < Classe Medico >
Atributos: nome, especialidade, crm e disponivel.

Regras:
Nome, especialidade e CRM são informados no construtor.
O médico começa disponível.
Criar métodos para controlar o estado.

   < Classe Consulta >
Atributos: Paciente, Medico, duracaoMinutos e consultaAtiva.

Regras:

Uma consulta só pode ser criada quando:
1. O médico estiver disponível.
2. A duração for maior que 0.
3. Quando a consulta for criada, o médico deverá ficar indisponível.
4. A consulta começa ativa.
5. Quando a consulta for encerrada: a consulta deixa de estar ativa e o médico volta a ficar disponível.
 */

public class Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Walison", 19, "7894-0");
        Paciente paciente2 = new Paciente("Rafael", 20, "9832-0");

        Medico medico1 = new Medico("Doutor", "Cirurgião", 123456);

        Consulta consulta1 = new Consulta(paciente1, medico1, 40);

        consulta1.mostarConsulta();
        consulta1.encerrarConsulta();

        Consulta consulta2 = new Consulta(paciente2, medico1, 60);

        consulta2.mostarConsulta();
    }
}