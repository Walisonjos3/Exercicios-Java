// Ler 12 números e adicionar em um vetor. Por fim, informe quantos são pares.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParesEmVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 12; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }
        int quantidadePares = 0;
        for (int valor: vetor){
            if (valor % 2 == 0){
                quantidadePares++;
            }
        }

        input.close();

        System.out.printf("Total de pares digitados: %d", quantidadePares);

    }
}
