// Mesmo exercício anterior.
// Agora mostre também a média dos números.

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int soma = numero;
        int contador = 1;

        while (numero != 0){
            System.out.print("Digite outro número [ 0 ] para sair: ");
            numero = input.nextInt();
            contador++;
            soma += numero;
        }

        contador -= 1;
        double media = soma / contador;
        System.out.printf("A soma dos números foi: %d\n", soma);
        System.out.printf("A média dos números foi: %.1f", media);
        input.close();
    }
}
