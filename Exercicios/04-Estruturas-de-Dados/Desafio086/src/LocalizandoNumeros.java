// Adicionar 10 números em um vetor e colocar em ordem crescente.
// Ler um número ao usuário e utilize Arrays.binarySearch() para localizar esse número.
// Por fim, informe a posição. Caso não exista, informe que não foi encontrado.

import java.util.Arrays;
import java.util.Scanner;

public class LocalizandoNumeros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i + 1) + " número: ");
            vetor[i] = input.nextInt();
        }

        Arrays.sort(vetor);

        System.out.print("\nEscolha um número: ");
        int numeroEscolhido = input.nextInt();
        int analisa = Arrays.binarySearch(vetor, numeroEscolhido);

        if (analisa >= 0){
            System.out.printf("O número %d está na posição %d", numeroEscolhido, analisa);
        }else {
            System.out.printf("O número %d não foi encontrado!", numeroEscolhido);
        }

        input.close();
    }
}
