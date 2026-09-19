// Criar classe Ventilador com atributos, métodos e estados.

public class Main {

    public static void main(String[] args){
        Ventilador ventilador = new Ventilador();

        ventilador.ligada = true;
        ventilador.status();
        ventilador.potencia = 1;
        ventilador.verificarPotencia();

    }
}
