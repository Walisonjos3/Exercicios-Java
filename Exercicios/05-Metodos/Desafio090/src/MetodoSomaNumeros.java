// Criar um método que receba dois números e imprima a soma (void).

import java.util.Scanner;

public class MetodoSomaNumeros {

    static void soma(int a, int b){
        int soma = a + b;
        System.out.printf("A soma entre %d e %d é %d", a, b, soma);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = input.nextInt();
        soma(numero1, numero2);

        input.close();
    }
}
