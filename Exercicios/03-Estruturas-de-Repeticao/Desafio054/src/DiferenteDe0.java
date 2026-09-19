// Faça um programa que peça um número.
// Repita enquanto o número for diferente de 0.

import java.util.Scanner;

public class DiferenteDe0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número [ 0 ] para sair: ");
            numero = input.nextInt();
        } while (numero != 0);

        System.out.print("Saindo...");
    }
}
