// Ler um ano e ver se ele é bissexto.

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("VERIFICAR ANO BISSEXTO!!");

        System.out.print("\nDigite um ano: ");
        int ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.printf("O ano %d é bissexto!", ano);
        }else {
            System.out.printf("O ano %d não é bissexto!", ano);
        }
    }
}
