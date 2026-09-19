// Faça um programa que leia: Nome, altura e peso. Depois mostrar tudo.

import java.util.Scanner;

public class Cadastrar {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Digite sua altura: ");
        float altura = input.nextFloat();
        System.out.print("Digite seu peso: ");
        float peso = input.nextFloat();

        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("Idade: %s anos\n", idade);
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f Kg\n", peso);
    }
}
