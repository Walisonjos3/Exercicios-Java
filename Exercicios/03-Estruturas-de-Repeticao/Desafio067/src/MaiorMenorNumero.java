// Ler 10 números e mostrar o maior e menor.

import java.util.Scanner;

public class MaiorMenorNumero {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int numero;

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (i == 1){
                maior = numero;
                menor = numero;
            }else {

                if (numero > maior){
                    maior = numero;
                }if (numero < menor){
                    menor = numero;
                }
            }
        }
        System.out.printf("O maior número digitado foi %d\n", maior);
        System.out.printf("O menor número digitado foi %d", menor);
    }
}
