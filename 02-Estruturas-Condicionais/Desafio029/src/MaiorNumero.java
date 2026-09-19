// Ler três números e mostre qual é o maior deles.

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = input.nextInt();
        System.out.print("Digite outro número: ");
        int n3 = input.nextInt();

        int maior = n1;

        if (n2 > maior){
            maior = n2;
        }if (n3 > maior){
            maior = n3;
        }
        System.out.printf("O maior número digitado foi %d", maior);
    }
}
