// Mostrar um Menu. Ler um número e mostrar essa opção.

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Novo jogo\n" +
                "2 - Continuar\n" +
                "3 - Configurações\n" +
                "4 - sair");

        System.out.print("\nDigite aqui: ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.print("A opção escolhida foi Novo jogo!");
                break;
            case 2:
                System.out.print("A opção escolhida foi Continuar!");
                break;
            case 3:
                System.out.print("A opção escolhida foi Configurações!");
                break;
            case 4:
                System.out.println("A opção escolhida foi Sair!");
                System.out.print("Saindo...");
                break;
            default:
                System.out.printf("A opção escolhida está inválida!");
        }

        input.close();
    }
}
