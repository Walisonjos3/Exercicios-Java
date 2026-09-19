import java.util.Scanner;

public class Calculadora {

    static double somar(Scanner input){
        System.out.print("Quantos números quer somar ? ");
        int quantidade = input.nextInt();
        int soma = 0;

        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite um número: ");
            soma += input.nextDouble();
        }

        return soma;
    }

    static double subtracao(Scanner input){
        System.out.print("Quantos números quer subtrair ? ");
        int quantidade = input.nextInt();

        System.out.print("Digite um número: ");
        double subtrair = input.nextDouble();

        for (int i = 0; i < quantidade - 1; i++){
            System.out.print("Digite um número: ");
            subtrair -= input.nextDouble();
        }

        return subtrair;
    }

    static double multiplicacao(Scanner input){
        System.out.print("Quantos números quer multiplicar ? ");
        int quantidade = input.nextInt();
        double multiplica = 1;

        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite um número: ");
            multiplica *= input.nextDouble();
        }

        return multiplica;
    }

    static double divisao(Scanner input){
        System.out.print("Quantos números quer dividir ? ");
        int quantidade = input.nextInt();

        System.out.print("Digite um número: ");
        double dividir = input.nextDouble();

        for (int i = 0; i < quantidade - 1; i++){
            System.out.print("Digite um número: ");
            dividir /= input.nextDouble();
        }

        return dividir;
    }

    static double potenciacao(Scanner input){
        System.out.print("Quantas potência quer calcular ? ");
        int quantidade = input.nextInt();
        double potencia = 0;

        for (int i = 0; i < quantidade; i++){
            System.out.print("\nDigite a base: ");
            int base = input.nextInt();
            System.out.print("Digite o expoente: ");
            double expoente = input.nextDouble();
            potencia += Math.pow(base, expoente);
        }

        return potencia;
    }
}
