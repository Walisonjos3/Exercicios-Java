// Ler 10 números e mostrar o maior.

import java.util.Scanner;

public class Ler10numeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int numero;

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (i == 0){
                maior = numero;
            }else{

                if (numero > maior){
                    maior = numero;
                }
            }
        }

        System.out.printf("O maior número digitado foi: %d", maior);
    }
}
