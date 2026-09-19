/* Programa que mistura todos os exercícios anteriores.
   Ler nome, idade, altura, peso, salário e a quantidade de horas trabalhadas.
   Por fim, calcular e mostrar o IMC, o valor da hora trabalhada e a idade convertida em meses e dias.
 */

import java.util.Scanner;

public class MisturaTudo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println(" RELATÓRIO DO FUNCIONÁRIO");
        System.out.println("============================\n");

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Altura: ");
        float altura = input.nextFloat();
        System.out.print("Peso: ");
        float peso = input.nextFloat();
        System.out.print("Salário: ");
        float salario = input.nextFloat();
        System.out.print("Horas trabalhadas: ");
        int horas_trabalhadas = input.nextInt();
        float imc = peso / (altura * altura);

        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nIdade: %d", idade);
        System.out.printf("\nAltura: %.2f", altura);
        System.out.printf("\nPeso: %.2f", peso);
        System.out.printf("\nIMC: %.2f\n", imc);

        System.out.printf("\nSalário: %.2f", salario);
        float valor_hora = salario / horas_trabalhadas;
        System.out.printf("\nValor da hora: %.2f\n", valor_hora);

        int idade_meses = idade * 12;
        int idade_dias = idade * 365;
        System.out.printf("\nIdade em meses: %d", idade_meses);
        System.out.printf("\nIdade em dias: %d", idade_dias);
    }
}
