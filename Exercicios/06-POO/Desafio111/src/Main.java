/*
Crie uma classe chamada Lampada.
Ela deve possuir os seguintes atributos:
ligada (boolean)
cor (String)
potencia (int)

Crie também estes métodos:
ligar()
desligar()
mostrarEstado()
 */

public class Main {

    public static void main(String[] args){
        Lampada l1 = new Lampada();

        l1.cor = "Azul";
        l1.desligar();
        l1.mostrarTodo();
    }
}
