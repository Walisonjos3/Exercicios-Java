public class Carro {

    public String modelo;
    public String cor;
    protected boolean ligado;

    public void mostrarCarro(){
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Está ligado ? %b%n", this.ligado);
    }

    protected void ligar(){
        this.ligado = true;
    }

    protected void desligar(){
        this.ligado = false;
    }

    protected void acelerar(){
        if (this.ligado){
            System.out.println("Acelerando...");
        } else {
            System.out.println("Não posso acelerar, o carro está desligado.");
        }
    }

}
