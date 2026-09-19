// Programa para converter temperatura em celcius para fahrenheit.

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CONVERTENDO TEMPERATURA");

        System.out.print("temperatura: ");
        int celsius = input.nextInt();
        int temperatura_convertida = (celsius * 9 / 5) + 32;

        System.out.printf("\nDe Celsius para Fahrenheit, temos %d", temperatura_convertida);
    }
}
