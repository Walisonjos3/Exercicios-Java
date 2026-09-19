// Programa para converter idade de uma pessoa em meses e dias.

import java.util.Scanner;

public class ConverterIdade {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CONVERSOR DE IDADE");
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        int meses = idade * 12;
        int dias = idade * 365;
        System.out.printf("\nEm %d anos temos: %d meses ou %d dias!", idade, meses, dias);

    }
}