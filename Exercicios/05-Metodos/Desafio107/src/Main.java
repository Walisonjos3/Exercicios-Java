/*
Sistema Bancário
Criar métodos para: depositar, sacar e consultar saldo.
Utilize um menu com do-while.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha;
        double saldo = 0;

        do {
            System.out.print("""
                    
                    <<<   SISTEMA BANCÁRIO   >>>
                    
                    1 -> Depositar
                    2 -> Sacar
                    3 -> Consultar saldo
                    4 -> Sair
                    
                    """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    saldo = Sistema.depositar(input);
                    break;

                case 2:
                    double saque = Sistema.sacar(input);
                    saldo -= saque;
                    break;

                case 3:
                    String consulta = Sistema.mostrarSaldo(saldo);
                    System.out.print(consulta + "\n");
                    break;

                case 4:
                    System.out.print("  <<< Saindo  >>>");
                    break;

                default:
                    System.out.print("\nERRO: OPÇÃO INVÁLIDA\n");

            }

        }while (escolha != 4);
    }
}
