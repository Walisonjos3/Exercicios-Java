// Criar uma calculadora.
// 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão e 5 - Sair
// Enquanto o usuário não escolher 5, a calculadora continua funcionando.

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int escolha = 1;

        while (escolha != 5) {
            System.out.print("""
                    <<<  CALCULADORA  >>>
                    
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    5 - Sair
                    
                    """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.print("Digite um número: ");
                    int n1 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int n2 = input.nextInt();

                    int soma = n1 + n2;
                    System.out.printf("Somando %d com %d, temos: %d\n\n", n1, n2, soma);;
                    break;
                case 2:
                    System.out.print("Digite um número: ");
                    int n3 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int n4 = input.nextInt();

                    int subtracao = n3 - n4;
                    System.out.printf("Subtraindo %d de %d, temos: %d\n\n", n3, n4, subtracao);
                    break;
                case 3:
                    System.out.print("Digite um número: ");
                    int n5 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int n6 = input.nextInt();

                    int multiplicacao = n5 * n6;
                    System.out.printf("Multiplicando %d por %d, temos: %d\n\n", n5, n6, multiplicacao);
                    break;
                case 4:
                    System.out.print("Digite um número: ");
                    int n7 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int n8 = input.nextInt();

                    double divisao = (double) n7 / n8;
                    System.out.printf("Dividindo %d por %d, temos: %.1f\n\n", n7, n8, divisao);
                    break;
                case 5:
                    System.out.print("Saindo... ");
                    break;
                default:
                    System.out.print("ERRO: OPÇÃO INVÁLIDA!!\n\n");
            }
        }
    }
}
