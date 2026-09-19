// Ler 5 números e mostre a soma.

import java.util.Scanner;

public class Lendo5Numeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            soma += numero;
        }
        System.out.printf("A soma dos número digitados é %d", soma);
    }
}
