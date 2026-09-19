// Ler um número inteiro. Informe se ele é: Par e positivo, Par e negativo, Ímpar e positivo ou Ímpar e negativo.

import java.util.Scanner;

public class ParImparPositivoNegativo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 2 == 0 && numero > 0){
            System.out.print("O número é par e positivo!");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.print("O número é par e negativo!");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.print("O número é ímpar e positivo!");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.print("O número é ímpar e negativo!");
        }else {
            System.out.print("O número é igual a zero!");
        }
    }
}
