// Ler uma palavra e contar quantas vogais ela possui.

import java.util.Scanner;

public class QuantidadeVogais {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.next().toUpperCase();

        int quantidade_vogal = 0;

        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);

            if (letra == 'A' ||
            letra == 'E' ||
            letra == 'I' ||
            letra == 'O' ||
            letra == 'U'){

                quantidade_vogal++;
            }
        }

        System.out.printf("Total de vogais na palavra %s: %d", palavra, quantidade_vogal);
    }
}
