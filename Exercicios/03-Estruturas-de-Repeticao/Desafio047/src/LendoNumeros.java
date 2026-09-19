// Ler vários números. O programa termina quando o usuário digitar 0.
// Ao final, mostrar quantos números foram digitados (não conte o zero).

import java.util.Scanner;

public class LendoNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int contador = 0;
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        contador++;

        while (numero != 0){
            System.out.print("Digite um número, [ 0 ] para sair: ");
            numero = input.nextInt();
            contador++;
        }
        contador -= 1;
        System.out.printf("Total de números digitados: %d", contador);
        input.close();
    }
}
