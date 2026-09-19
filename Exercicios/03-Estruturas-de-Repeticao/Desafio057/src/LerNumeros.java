// Ler números. Enquanto o usuário responder S, continue.
// Ao final mostre: Maior número e o menor número.

import java.util.Scanner;

public class LerNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String resposta;
        int numero;
        int maior = 0;
        int menor = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (contador == 0){
                maior = numero;
                menor = numero;
            }else {

                if (numero > maior){
                    maior = numero;
                }if (numero <  menor){
                    menor = numero;
                }
            }
            contador++;

            System.out.print("\nQuer continuar ? [S/N]: ");
            resposta = input.next().toUpperCase();
        }while (!resposta.equals("N"));

        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Menor número: %d", menor);
    }
}
