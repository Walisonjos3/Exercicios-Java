// Criar um método que receba um número e retorne se ele é par.

import java.util.Scanner;

public class MetodoNumeroPar {

    static int NumeroPar(int numero){
        int resultado = 0;

        if (numero % 2 == 0){
            resultado = 1;
        }
        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int resultado = NumeroPar(numero);

        if (resultado == 1){
            System.out.printf("\nO número %d é par", numero);
        }else {
            System.out.printf("\nO número %d é ímpar", numero);
        }

        input.close();
    }
}
