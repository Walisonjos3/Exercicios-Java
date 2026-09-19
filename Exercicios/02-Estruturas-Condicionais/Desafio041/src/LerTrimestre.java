// Ler o número de um trimestre: 1, 2, 3 ou 4.
//Mostre: Primeiro trimestre, Segundo trimestre, ...

import java.util.Scanner;

public class LerTrimestre {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do trimestre: ");
        int escolha = input.nextInt();

        switch (escolha){
            case 1:
                System.out.print("Primeiro trimestre");
                break;
            case 2:
                System.out.print("Segundo trimestre");
                break;
            case 3:
                System.out.print("Terceiro trimestre");
                break;
            case 4:
                System.out.print("Quarto trimestre");
                break;
            default:
                System.out.print("ERRO: OPÇÃO INVÁLIDA!");
        }
    }
}
