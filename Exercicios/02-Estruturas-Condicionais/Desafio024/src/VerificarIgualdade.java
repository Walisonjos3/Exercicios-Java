// Ler dois números inteiros e informe qual deles é o maior. Caso sejam iguais, mostrar: Os números são iguais.

import java.util.Scanner;

public class VerificarIgualdade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = input.nextInt();

        if (n1 > n2){
            System.out.printf("o maior número é %d", n1);
        } else if (n2 > n1) {
            System.out.printf("O maior número é %d", n2);
        }else {
            System.out.print("Os número são iguais!");
        }
    }
}
