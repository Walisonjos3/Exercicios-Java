// Criar um método que receba um número e retorne seu quadrado.

import java.util.Scanner;

public class MetodoQuadradoNumero {

    static int quadrado(int numero){
        int resultado = numero * numero;
        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int resultado = quadrado(numero);

        System.out.printf("\nO quadrado de %d é %d", numero, resultado);

        input.close();
    }
}
