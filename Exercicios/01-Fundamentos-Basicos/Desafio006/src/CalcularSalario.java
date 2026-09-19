// Programa para calcular salário de um funcionário. Ler nome, valor da hora e a quantidade de horas trabalhadas.

import java.util.Scanner;

public class CalcularSalario {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULANDO SALÁRIO");

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Valor da hora: ");
        float valor_hora = input.nextFloat();
        System.out.print("Horas trabalhadas: ");
        int quantidade_horas = input.nextInt();
        float salario = valor_hora * quantidade_horas;

        System.out.printf("\nFuncionário: %s\n", nome);
        System.out.printf("\nSalário: R$ %.2f", salario);
    }
}