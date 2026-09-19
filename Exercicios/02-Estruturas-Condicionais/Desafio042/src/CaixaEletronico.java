// Fazer um pequeno caixa eletrônico. Utilizar switch.

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=== CAIXA ELETRÔNICO ===");

        System.out.print("""
                1 - Consultar saldo
                2 - Sacar
                3 - Depositar
                4 - Sair
                """);

        System.out.print("Digite aqui: ");
        int escolha = input.nextInt();
        double saldo = 0;

        switch (escolha){
            case 1:
                System.out.print("Consultando saldo...\n");
                System.out.printf("Saldo atual: %.2f", saldo);
                break;
            case 2:
                System.out.print("Quantia do saque: R$ ");
                saldo = input.nextDouble();
                System.out.printf("Saque de R$ %.2f realizado com sucesso!", saldo);
                break;
            case 3:
                System.out.print("Quantia do deposito: R$ ");
                saldo = input.nextDouble();
                System.out.printf("Deposito de R$ %.2f realizado com sucesso!", saldo);
                break;
            case 4:
                System.out.print("Saindo...");
                break;
            default:
                System.out.print("ERRO: OPÇÃO INVÁLIDA!!");
        }
    }
}
