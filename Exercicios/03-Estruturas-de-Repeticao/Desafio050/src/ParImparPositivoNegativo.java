// Ler vários números e parar quando o usuário digitar 0.
// Mostrar quantos números positivos, quantos negativos, quantos pares e quantos ímpares.

import java.util.Scanner;

public class ParImparPositivoNegativo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int positivo = 0;
        int negativo = 0;
        int pares = 0;
        int impares = 0;

        while (numero != 0){

            if (numero > 0){
                positivo++;
            } else if (numero < 0) {
                negativo++;
            }if (numero % 2 == 0){
                pares++;
            } else if (numero % 2 != 0) {
                impares++;
            }

            System.out.print("Digite outro número [ 0 ] para sair:  ");
            numero = input.nextInt();
        }
        System.out.printf("Total positivos: %d\n", positivo);
        System.out.printf("Total negativo: %d\n", negativo);
        System.out.printf("Total pares: %d\n", pares);
        System.out.printf("Total ímpares: %d\n", impares);
        input.close();
    }
}
