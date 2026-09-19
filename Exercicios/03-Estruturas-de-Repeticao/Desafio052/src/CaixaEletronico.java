// Criar um caixa eletrônico.
// Menu: 1 - Consultar saldo, 2 - Depositar, 3 - Sacar e 4 - Sair
// Enquanto o usuário não escolher Sair, o menu continua aparecendo.

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int escolha = 1;
        double saldo = 0;

        while (escolha != 4) {
            System.out.print("""
                    <<<  CAIXA ELETRÔNICO  >>>
                    1 - Cunsultar saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Sair
                    
                    """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n\n", saldo);
                    break;
                case 2:
                    System.out.print("Quanto deseja depositar ? R$ ");
                    saldo = input.nextDouble();
                    System.out.print("Deposito realizado com sucesso!\n\n");
                    break;
                case 3:
                    System.out.print("Qual o valor do saque ? R$ ");
                    double saque = input.nextDouble();
                    saldo -= saque;
                    System.out.print("Saque realizado com sucesso!\n\n");
                    break;
                case 4:
                    System.out.print("Saindo... ");
                    break;
                default:
                    System.out.print("ERRO: OPCÃO INVÁLIDA!");
            }
        }
        System.out.print("Volte sempre!!");
        input.close();
    }
}
