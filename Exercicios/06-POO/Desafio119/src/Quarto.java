public class Quarto {

    private int numeroQuarto;
    private int capacidade;
    private double preco;
    private boolean ocupado;

    public Quarto(int numeroQuarto, int capacidade, double preco) {
        liberarQuarto();
        setNumeroQuarto(numeroQuarto);
        setCapacidade(capacidade);
        setPreco(preco);
    }

    public void ocuparQuarto() {
        this.ocupado = true;
    }

    public void liberarQuarto() {
        this.ocupado = false;
    }

    public int getNumeroQuarto() {
        return this.numeroQuarto;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public boolean getOcupado() {
        return this.ocupado;
    }

    private void setNumeroQuarto(int numero) { // Criei o setter para verificar o número, mas deixei ele privado!
        if (numero <= 0) {
            System.out.println("número do quarto inválido!!");
        } else {
            this.numeroQuarto = numero;
        }
    }

    private void setCapacidade(int capacidade) { // Criei o setter para verificar a capacidade, mas deixei ele privado!
        if (capacidade <= 0) {
            System.out.println("A capacidade do quarto deve ser maior que zero!");
        } else {
            this.capacidade = capacidade;
        }
    }

    private void setPreco(double preco) { // Criei o setter para verificar o preço, mas deixei ele privado!
        if (preco < 0) { // Eu poderia colocar para ser menor ou igual a zero, mas como o exercício não pediu, deixei assim mesmo.
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
    }


}
