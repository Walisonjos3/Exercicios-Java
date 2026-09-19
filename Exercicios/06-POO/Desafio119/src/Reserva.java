public class Reserva {

    private Hospede cliente;
    private Quarto quarto;
    private int quantidadeDias;
    private boolean reservaAtiva;

    public Reserva(Hospede cliente, Quarto quarto, int quantidadeDias) {
        if (quarto.getOcupado()){
            System.out.println("O quarto já está ocupado!");
        } else if (quantidadeDias <= 0) {
            System.out.println("Quantidade de dias inválidos!");
        }  else {
            this.cliente = cliente;
            this.quarto = quarto;
            this.quantidadeDias = quantidadeDias;
            this.reservaAtiva = true;
            quarto.ocuparQuarto();
        }
    }

    public void mostrarReserva() {
        if (this.reservaAtiva) {
            System.out.println("--------------------------------------------------");
            System.out.printf(" <<< Reservado de %s >>>%n", cliente.getNome());
            System.out.printf("Número do quarto: %d%n", this.quarto.getNumeroQuarto());
            System.out.printf("Capacidade: %d%n", this.quarto.getCapacidade());
            System.out.printf("Diária: R$ %.2f%n", this.quarto.getPreco());
            System.out.printf("Dias ocupados: %d%n", this.getQuantidadeDias());
            System.out.printf("Valor total: R$ %.2f%n", this.quarto.getPreco() * getQuantidadeDias());
        } else {
            System.out.println("Quarto não reservado!");
        }
    }

    public void encerrarReserva() {
        if (this.reservaAtiva) {
            this.quarto.liberarQuarto();
            this.reservaAtiva = false;
            System.out.println("Quarto liberado!");
        } else {
            System.out.println("A reserva já foi encerrada!");
        }
    }

    public Hospede getCliente() {
        return this.cliente;
    }
    public boolean getReservaAtiva() {
        return this.reservaAtiva;
    }

    public int getQuantidadeDias() {
        return this.quantidadeDias;
    }
}

