/*
Criar uma classe chamada Calculadora. Ela deve possuir métodos para:
somar
subtrair
multiplicar
dividir
potência

Na main(), testar todos os métodos.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha;

        do {
            System.out.print("""
                
                <<< CALCULADORA >>>
                
                1 -> Somar
                2 -> Subtrair
                3 -> Multiplicar
                4 -> Dividir
                5 -> Potência
                6 -> Sair
                
                """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:

                    double resultadoSoma = Calculadora.somar(input);
                    System.out.printf("A soma dos números digitados é %.2f%n", resultadoSoma);
                    break;

                case 2:
                    double resultadoSubtracao = Calculadora.subtracao(input);
                    System.out.printf("A subtração dos números digitados é %.2f%n", resultadoSubtracao);
                    break;

                case 3:
                    double resultadoMultiplicacao = Calculadora.multiplicacao(input);
                    System.out.printf("A multiplicação dos números digitados é %.2f%n", resultadoMultiplicacao);
                    break;

                case 4:
                    double resultadoDivisao = Calculadora.divisao(input);
                    System.out.printf("A divisão dos números digitados é %.2f%n", resultadoDivisao);
                    break;

                case 5:
                    double resultadoPotencia = Calculadora.potenciacao(input);
                    System.out.printf("A potenciação dos números digitados é %.2f%n", resultadoPotencia);
                    break;
                case 6:
                    System.out.print(" < Saindo... > ");
                    break;
                default:
                    System.out.print("ERRO: OPÇÃO INVÁLIDA!\n");
            }
        }while (escolha != 6);

        input.close();
    }
}
