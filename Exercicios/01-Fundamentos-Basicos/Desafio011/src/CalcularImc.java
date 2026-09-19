// Programa para calcular IMC de uma pessoa. Ler nome, altura e o peso.

import java.util.Scanner;

public class CalcularImc {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULAR IMC");

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua altura: ");
        float altura = input.nextFloat();
        System.out.print("Digite seu peso: ");
        float peso = input.nextFloat();
        float imc = peso / (altura * altura);

        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("IMC: %.2f", imc);
    }
}
