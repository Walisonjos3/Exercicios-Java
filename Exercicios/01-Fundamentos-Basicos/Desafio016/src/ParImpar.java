// Ler um número e utilizar o operador ternário para descobrir se é par ou ímpar.

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero =  input.nextInt();

        String resultado = numero % 2 == 0 ? "Par" : "Impar";

        System.out.printf("O número digitado foi %d e ele é %s.", numero, resultado);
    }
}
