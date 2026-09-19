// Criar um método que receba três números e retorne o maior deles.

import java.util.Scanner;

public class MetodoMaiorNumero {

    static int numeromaior(int n1, int n2, int n3){
        int maior = n1;

        if (n2 > maior){
            maior = n2;
        }if (n3 > maior){
            maior = n3;
        }

        return maior;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = input.nextInt();
        System.out.print("Digite mais um número: ");
        int numero3 = input.nextInt();

        int resultado = numeromaior(numero1, numero2, numero3);

        System.out.printf("\nO maior número digitado foi %d", resultado);

        input.close();

    }
}
