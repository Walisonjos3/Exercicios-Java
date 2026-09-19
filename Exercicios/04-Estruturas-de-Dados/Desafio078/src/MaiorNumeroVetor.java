// Ler 10 números e adicionar em um vetor. Por fim, informar qual é o maior.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumeroVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }

        int maior = 0;
        int contador = 0;

        for (int valor: vetor){
            if (contador == 0){
                maior = valor;
            }else {

                if (valor > maior){
                    maior = valor;
                }
            }

            contador++;
        }

        System.out.printf("\nO maior número digitado foi: %d", maior);
    }
}
