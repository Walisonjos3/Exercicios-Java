// Programa para converter reais em dóllar.

import java.util.Scanner;

public class ConverterDinheiro {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CONVERSOR DE DINHEIRO");

        System.out.print("Quantos reais: ");
        float reais = input.nextFloat();

        double dolar = (double) reais / 5.42;

        System.out.printf("\nCom %.2f reais podemos comprar %.2f dólares.", reais, dolar);
    }
}
