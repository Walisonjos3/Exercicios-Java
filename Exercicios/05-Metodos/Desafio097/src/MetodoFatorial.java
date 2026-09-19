// Criar um método que receba um número e retorne seu fatorial.

import java.util.Scanner;

public class MetodoFatorial {

    static int fatorial(int numero){
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int resultado = fatorial(numero);

        System.out.printf("\nO fatorial de %d é %d", numero, resultado);

        input.close();
    }
}
