// Programa para ler quatro nota e fazer a média.

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULANDO A MÉDIA");

        System.out.print("Digite a nota 1: ");
        float n1 = input.nextFloat();
        System.out.print("Digite a nota 2: ");
        float n2 = input.nextFloat();
        System.out.print("Digite a nota 3: ");
        float n3 = input.nextFloat();
        System.out.print("Digite a nota 4: ");
        float n4 = input.nextFloat();
        float media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("\nMédia: %.2f", media);
    }
}
