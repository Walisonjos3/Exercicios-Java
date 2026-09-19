public class Ventilador {

    public boolean ligada;
    public String modelo;
    public int potencia;
    public boolean fixar;

    public void status(){
        if (this.ligada){
            System.out.println("Estou ligado...");
        } else {
            System.out.println("Estou desligado!");
        }
    }

    public void girar(){
        if (this.ligada){
            this.fixar = false;
            System.out.println("Estou girando...");
        } else {
            System.out.println("Estou desligado para girar!");
        }
    }

    public void fixar(){
        this.fixar = true;
    }

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void verificarPotencia(){
        if(this.potencia >= 1 && this.potencia <= 3){
            System.out.printf("Estou na potência %d%n", this.potencia);
        }else{
            System.out.println("Potência inválida.");
        }
    }
}
