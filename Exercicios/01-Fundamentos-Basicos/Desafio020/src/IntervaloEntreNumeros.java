// Ler um número e verifique se ele está entre 100 e 200. Utilizar &&.

import java.util.Scanner;

public class IntervaloEntreNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        String verifica = numero > 100 && numero < 200 ? "está dentro do intervalo": "está fora do intervalo";

        System.out.printf("O número digitado foi %d e ele %s.", numero, verifica);
    }
}

