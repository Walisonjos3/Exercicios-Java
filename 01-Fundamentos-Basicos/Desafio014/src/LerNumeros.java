// Ler dois números e utilize o operador ternário para descobrir qual é o maior.

import java.util.Scanner;

public class LerNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = input.nextInt();
        int maior = n1 > n2? n1: n2;

        System.out.printf("O maior número entre %d e %d é % d", n1, n2, maior);

    }
}
