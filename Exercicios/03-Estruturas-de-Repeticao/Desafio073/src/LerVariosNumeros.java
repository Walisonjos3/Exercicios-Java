// Ler vários números. Se o usuário digitar um número negativo, ignore-o utilizando continue.
// Quando digitar 0, finalize. Mostre a soma apenas dos números positivos.

import java.util.Scanner;

public class LerVariosNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo [ 0 ] para sair: ");
            numero = input.nextInt();

            if (numero < 0){
                continue;
            }
            soma += numero;
        }while (numero != 0);
        System.out.printf("\nA soma dos números positivos foi %d", soma);
    }
}
