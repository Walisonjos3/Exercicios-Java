// Programa para prática de troca de valores entre variáveis do mesmo tipo.

import java.util.Scanner;

public class TrocandoValores {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("TROCANDO VALORES");

        System.out.print("Digite um valor para A: ");
        int a = input.nextInt();
        System.out.print("Digite um valor para B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;

        System.out.printf("\nA = %d", a);
        System.out.printf("\nB = %d", b);
    }
}
