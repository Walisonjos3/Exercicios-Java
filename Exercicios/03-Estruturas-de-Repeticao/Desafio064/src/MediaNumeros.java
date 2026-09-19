// Ler 4 notas e mostrar a média.

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        double nota;

        for (int i = 1; i <= 4; i++){
            System.out.print("Digite um número: ");
            nota = input.nextDouble();
            soma += nota;
            contador++;
        }
        double media = (double) soma / contador;
        System.out.printf("A média das notas digitadas é %.1f", media);
    }
}
