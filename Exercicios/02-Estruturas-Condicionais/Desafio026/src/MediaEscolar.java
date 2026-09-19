// Ler três notas e calcule a média. Mostre: Aprovado (média ≥ 7), Recuperação (5 até 6,9) e Reprovado (menor que 5)

import java.util.Scanner;

public class MediaEscolar {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite sua nota 2: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite sua nota 3: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7 && media <= 10){
            System.out.printf("Sua média foi %.1f e você está aprovado!", media);

        }else if (media >= 5) {
            System.out.printf("Sua média foi %.1f e você está em recuperação!", media);

        }else if (media >= 0){
            System.out.printf("Sua média foi %.1f e você está reprovado!", media);

        }else {
            System.out.print("ERRO!");
        }
    }
}
