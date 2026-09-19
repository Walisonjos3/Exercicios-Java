// Ler um número de 1 a 12 e mostre o mês correspondente. Utilizar Switch.

import java.util.Scanner;

public class MesCorrespondente {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("MÊS DO ANO");

        System.out.print("\nDigite um número: ");
        int numero = input.nextInt();

        switch (numero){
            case 1:
                System.out.print("O número digitado corresponde a Janeiro!");
                break;
            case 2:
                System.out.print("O número digitado corresponde a Fevereiro!");
                break;
            case 3:
                System.out.print("O número digitado corresponde a Março!");
                break;
            case 4:
                System.out.print("O número digitado corresponde a Abril!");
                break;
            case 5:
                System.out.print("O número digitado corresponde a Maio!");
                break;
            case 6:
                System.out.print("O número digitado corresponde a Junho!");
                break;
            case 7:
                System.out.print("O número digitado corresponde a Julho!");
                break;
            case 8:
                System.out.print("O número digitado corresponde a Agosto!");
                break;
            case 9:
                System.out.print("O número digitado corresponde a Setembro!");
                break;
            case 10:
                System.out.print("O número digitado corresponde a Outubro!");
                break;
            case 11:
                System.out.print("O número digitado corresponde a Novembro!");
                break;
            case 12:
                System.out.print("O número digitado corresponde a Dezembro!");
                break;
            default:
                System.out.print("O número digitado não corresponde a nenhum mês do ano!");
        }
    }
}
