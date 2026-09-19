// Ler uma palavra e Mostrar ela invertida.

import java.util.Scanner;

public class PalavraInvertida {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.next();

        for (int i = palavra.length() - 1; i >= 0; i--){

            System.out.println(palavra.charAt(i));
        }

    }
}
