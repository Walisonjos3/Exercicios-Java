// Ler um número e mostrar se ele é positivo ou negativo usando o operador ternário.

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero =  input.nextInt();

        String resultado =
                numero == 0 ? "ele é igual a zero":
                        numero > 0 ? "ele está positivo": "ele está negativo";

        System.out.printf("O número digitado foi %d e %s", numero, resultado);
    }
}
