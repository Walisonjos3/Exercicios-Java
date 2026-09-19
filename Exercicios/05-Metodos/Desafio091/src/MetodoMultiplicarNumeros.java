// Criar um método que receba dois números e retorne a multiplicação (return).

import java.util.Scanner;

public class MetodoMultiplicarNumeros {

    static int multiplicar(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite um número: ");
        int numero2 = input.nextInt();
        int resultado = multiplicar(numero1, numero2);

        System.out.printf("\nA multiplicação entre %d e %d é %d", numero1, numero2, resultado);
        input.close();
    }
}
