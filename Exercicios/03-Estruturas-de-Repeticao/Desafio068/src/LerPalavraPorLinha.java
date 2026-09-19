// Ler uma palavra e mostrar uma letra por linha.

import java.util.Scanner;

public class LerPalavraPorLinha {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.next();

        for (int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }
}
