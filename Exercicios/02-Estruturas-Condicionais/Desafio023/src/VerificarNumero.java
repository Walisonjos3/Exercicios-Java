// Programa para ler um número inteiro e informe se ele é positivo, negativo ou igual a zero.

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero > 0){
            System.out.printf("O número digitado foi %d e ele é positivo.", numero);
        } else if (numero < 0) {
            System.out.printf("O número digitado foi %d e ele é negativo.", numero);
        }
        else {
            System.out.println("O número digitado é 0");
        }
    }
}
