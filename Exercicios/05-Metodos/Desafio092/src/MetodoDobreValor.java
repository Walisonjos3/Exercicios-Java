// Criar um método que receba um número e retorne seu dobro.

import java.util.Scanner;

public class MetodoDobreValor {

    static int dobro(int numero){
        int resultado = numero * 2;
        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int resultado = dobro(numero);

        System.out.printf("\nO dobro do número %d é %d", numero, resultado);

        input.close();
    }
}
