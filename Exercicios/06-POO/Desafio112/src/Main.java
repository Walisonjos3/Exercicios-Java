/*
Crie uma classe Carro.
Atributos:
modelo
cor
ligado

Métodos:
ligar()
desligar()
acelerar()
 */

public class Main {

    public static void main(String[] args){
        Carro car = new Carro();

        car.modelo = "Fiat";
        car.cor = "Preto";
        car.mostrarCarro();
        car.acelerar();
    }
}
