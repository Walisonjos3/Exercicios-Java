// Ler um vetor de 10 posições. Depois leia outro número.
// Por fim, informar se esse número existe no vetor.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcurandoNumeroVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }

        System.out.print("\nQual número deseja procurar ? ");
        int numeroEscolhido = input.nextInt();

        if (vetor.contains(numeroEscolhido)){
            System.out.printf("\nO número %d está no vetor!!", numeroEscolhido);
        }else {
            System.out.printf("\nO número %d não está no vetor!!", numeroEscolhido);
        }

        input.close();

    }
}
