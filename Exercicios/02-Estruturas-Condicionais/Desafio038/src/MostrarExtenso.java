// Ler uma nota de 0 a 10 (inteira) e mostre por extenso usando switch.

import java.util.Scanner;

public class MostrarExtenso {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("MOSTRANDO POR EXTENSO!");

        System.out.print("\nDigite um número: ");
        int numero = input.nextInt();

        switch (numero){
            case 0:
                System.out.printf("%d -> Zero", numero);
                break;
            case 1:
                System.out.printf("%d -> Um", numero);
                break;
            case 2:
                System.out.printf("%d -> Dois", numero);
                break;
            case 3:
                System.out.printf("%d -> Três", numero);
                break;
            case 4:
                System.out.printf("%d -> Quatro", numero);
                break;
            case 5:
                System.out.printf("%d -> Cinco", numero);
                break;
            case 6:
                System.out.printf("%d -> Seis", numero);
                break;
            case 7:
                System.out.printf("%d -> Sete", numero);
                break;
            case 8:
                System.out.printf("%d -> Oito", numero);
                break;
            case 9:
                System.out.printf("%d -> Nove", numero);
                break;
            case 10:
                System.out.printf("%d -> Dez", numero);
                break;
            default:
                System.out.printf("%d -> Nota inválida!", numero);
        }

        input.close();
    }
}
