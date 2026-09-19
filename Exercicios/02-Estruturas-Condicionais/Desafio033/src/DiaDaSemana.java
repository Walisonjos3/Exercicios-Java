// Ler um número de 1 a 7 e mostre o dia da semana. Utilizar Switch.

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        switch (numero){
            case 1:
                System.out.print("O número digitado corresponde a domingo!");
                break;
            case 2:
                System.out.print("O número digitado corresponde a Segunda-Feira!");
                break;
            case 3:
                System.out.print("O número digitado corresponde a Terça-Feira!");
                break;
            case 4:
                System.out.print("O número digitado corresponde a Quarta-Feira!");
                break;
            case 5:
                System.out.print("O número digitado corresponde a Quinta-Feira!");
                break;
            case 6:
                System.out.print("O número digitado corresponde a Sexta-Feira!");
                break;
            case 7:
                System.out.print("O número digitado corresponde a Sábado!");
                break;
            default:
                System.out.print("O número digitado não corresponde a nenhum dia da semana!");
        }
    }
}
