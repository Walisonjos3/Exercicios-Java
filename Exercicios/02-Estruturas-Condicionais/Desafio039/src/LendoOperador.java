// Ler um operador: +, -, *, ou /.
// Ler dois números e realize a operação escolhida.

import java.util.Scanner;

public class LendoOperador {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nDIGITE UMA OPERAÇÃO");
        System.out.print("""
                1 -> +
                2 -> -
                3 -> *
                4 -> /
                """);
        System.out.print("Digite Aqui: ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.print("Agora digite um número: ");
                int n1 = input.nextInt();
                System.out.print("digite outro número: ");
                int n2 = input.nextInt();

                int soma = n1 + n2;

                System.out.print("A operação escolhida foi + e ");
                System.out.printf("resultado = %d", soma);
                break;
            case 2:
                System.out.print("Agora digite um número: ");
                int n3 = input.nextInt();
                System.out.print("digite outro número: ");
                int n4 = input.nextInt();

                int subtracao = n3 - n4;
                System.out.print("A operação escolhida foi - e ");
                System.out.printf("resultado = %d", subtracao);
                break;
            case 3:
                System.out.print("Agora digite um número: ");
                int n5 = input.nextInt();
                System.out.print("digite outro número: ");
                int n6 = input.nextInt();

                int multiplicacao = n5 * n6;
                System.out.print("A operação escolhida foi * e ");
                System.out.printf("resultado = %d", multiplicacao);
                break;
            case 4:
                System.out.print("Digite um número: ");
                double n7 = input.nextDouble();
                System.out.print("Digite outro número: ");
                double n8 = input.nextDouble();
                double divisao = n7 / n8;

                System.out.print("A operação escolhida foi / e ");
                System.out.printf("resultado = %.1f", divisao);
                break;
            default:
                System.out.print("ERRO: OPERAÇÃO INVÁLIDA!!");
        }
    }
}
