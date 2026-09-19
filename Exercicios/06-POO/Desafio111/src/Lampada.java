public class Lampada {

    public boolean ligada;
    public String cor;
    private int potencia;

    public void mostrarTodo(){
        System.out.printf("Está ligada ? %b%n", this.ligada);
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Potência: %dw%n", this.potencia); // O correto seria eu deixar a potência pública para poder atribuir um valor a ela? Ou eu poderia colocar manualmente a potÊncia dela? Já que está privada.
    }

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

}
