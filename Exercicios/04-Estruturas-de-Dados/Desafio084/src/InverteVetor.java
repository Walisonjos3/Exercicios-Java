// Ler 10 números e adicionar em um vetor. Por fim, mostrar na ordem inversa.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InverteVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }

        for (int i = vetor.toArray().length - 1; i >= 0; i--){
            System.out.println(vetor.get(i));
        }

    }
}
