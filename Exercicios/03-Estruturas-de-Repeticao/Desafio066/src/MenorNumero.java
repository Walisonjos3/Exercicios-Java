// Ler 10 números e mostrar o menor.

import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int menor = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (i == 1){
                menor = numero;
            }else {

                if (numero < menor){
                    menor = numero;
                }
            }
        }

        System.out.printf("O menor número digitado foi: %d", menor);
    }
}
