// Ler 12 números e adicionar em um vetor. Por fim, informe quantos são ímpares.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosImparesVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 12; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }
        int quantidadeImpares = 0;

        for (int valor: vetor){
            if (valor % 2 != 0){
                quantidadeImpares++;
            }
        }

        input.close();

        System.out.printf("Total de ímpares digitados: %d", quantidadeImpares);
    }
}
