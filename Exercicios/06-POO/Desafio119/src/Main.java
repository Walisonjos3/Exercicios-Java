/*
EXERCÍCIO PARA PRÁTICA DE RELACIONAMENTO ENTRE CLASSES E OBJETOS COMPOSTOS.

  <<< DESAFIO — Sistema de Hotel  >>>

Criar Classe Hospede que possui: nome, idade e documento.
Regras da classe Hospede:
idade não pode ser negativa;
não deve existir set público para o documento;
pense se realmente precisa de setters para os outros atributos.

Criar outra Classe chamada Quarto, que possui: número, capacidade, preço da diária e ocupado.
Regras da classe Quarto:
capacidade deve ser maior que 0;
preço não pode ser negativo;
o quarto começa desocupado.

Criar mais uma classe chamada Reserva, que possui: um Hospede, um Quarto e quantidade de dias.
Regras da reserva:

Uma reserva só pode ser criada se:
1. O quarto estiver disponível.
2. A quantidade de dias for maior que zero.
3. O quarto deve ficar ocupado quando a reserva for criada.
4. Quando a reserva for encerrada: o quarto deve ficar livre e a reserva deixa de estar ativa.
 */

public class Main {

    public static void main(String[] args) {
        Hospede pessoa1 = new Hospede("Walison", 19, "5734-0");
        Hospede pessoa2 = new Hospede("Jarismar", 20, "7897-0");

        Quarto quarto1 = new Quarto(1, 3, 100);
        Quarto quarto2 = new Quarto(2, 4, 150);

        Reserva reserva1 = new Reserva(pessoa1, quarto1, 2);
        reserva1.mostrarReserva();

        Reserva reserva2 = new Reserva(pessoa2, quarto1, 3);
        reserva2.mostrarReserva();



    }
}
