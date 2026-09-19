// Ler 10 números e calcule a média.
// Depois mostre apenas os números maiores que ela.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcularMediaVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }
        int soma = 0;
        for (int valor: vetor){
            soma += valor;
        }

        double media = (double) soma / 10;

        System.out.println("\nOs números maiores que a média é: ");

        for (int valor: vetor){
            if (valor > media){
                System.out.print(valor + " ");
            }
        }

        input.close();
    }
}
