/* Criar um menu usando do...while.
 1 - Ver idade
 2 - Ver tabuada
 3 - Verificar par ou ímpar
 4 - Encerrar
 Repita até escolher 4.
 */

import java.util.Scanner;

public class MenuDoWhile {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        String resposta;

        do {
            System.out.print("""
                    
                    <<<  MENU  >>>
                    
                    1 - Ver idade
                    2 - Ver tabuada
                    3 - Verificar par ou ímpar
                    4 - Encerrar
                    
                    """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("<<< VER IDADE  >>>");
                    System.out.print("\nDigite sua idade: ");
                    int idade = input.nextInt();
                    System.out.printf("Você tem %d anos", idade);
                    break;
                case 2:
                    System.out.println("<<<  VER TABUADA  >>>");
                    System.out.print("\nDigite um número: ");
                    int numero = input.nextInt();
                    int contador = 0;

                    while (contador < 11){
                        System.out.printf("%d x %d = %d\n", numero, contador, (numero*contador));
                        contador++;
                    }
                    break;
                case 3:
                    System.out.println("<<<  VERIFICAR PAR OU ÍMPAR  >>>");
                    System.out.print("\nDigite um número: ");
                    int numero_par_impar = input.nextInt();

                    String resultado = numero_par_impar % 2 == 0 ? "O número digitado é par!" : "O número digitado é ímpar!";

                    System.out.print(resultado);
                    break;
                case 4:
                    System.out.print("Saindo...");
                    break;
                default:
                    System.out.print("ERRO: OPÇÃO INVÁLIDA!!");
            }
        }while (escolha != 4);
    }
}
