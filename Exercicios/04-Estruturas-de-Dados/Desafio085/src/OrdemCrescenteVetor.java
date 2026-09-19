// Ler 10 números e adicionar em um vetor. Por fim, utilizar Arrays.sort() para colocá-los em ordem crescente.

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescenteVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i + 1) + " número: ");
             vetor[i] = input.nextInt();
        }
        Arrays.sort(vetor);

        for (int valor: vetor){
            System.out.print(valor + " ");
        }

        input.close();
    }
}
