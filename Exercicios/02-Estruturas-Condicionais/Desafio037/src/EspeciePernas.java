// Ler um número. 1, 2, 4, 6 ou 8.
// Mostre: Monópode, Bípede, Quadrúpede, Inseto ou Aranha.
// Caso contrário: Desconhecido.

import java.util.Scanner;

public class EspeciePernas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("VER ESPÉCIE DE ACORDO COM A QUANTIDADE DE PERNAS!");

        System.out.print("\nDigite quantas pernas tem ? ");
        int pernas = input.nextInt();

        switch (pernas){
            case 1:
                System.out.print("Espécie é Monópode.");
                break;
            case 2:
                System.out.print("Espécie é Bípede.");
                break;
            case 4:
                System.out.print("Espécie é Quadrúpede.");
                break;
            case 6:
                System.out.print("Espécie é Inseto.");
                break;
            case 8:
                System.out.print("Espécie é Aranha.");
                break;
            default:
                System.out.print("Desconhecido!");
        }

        input.close();
    }
}
