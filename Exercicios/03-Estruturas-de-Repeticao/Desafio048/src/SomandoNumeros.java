// Ler vários números. O programa termina quando o usuário digitar 0.
// Ao final, mostrar a soma dos números.

import java.util.Scanner;

public class SomandoNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int soma = numero;

        while (numero != 0){
            System.out.print("Digite outro número [ 0 ] para sair: ");
            numero = input.nextInt();
            soma += numero;
        }
        System.out.printf("A soma dos números foi: %d", soma);
        input.close();
    }
}
