// Criar um método que receba um vetor e retorne sua soma.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodoSomaVetor {

    static int somandoVetor(List<Integer> vetor){
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }

        return soma;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);

            System.out.print("\nQuer continuar ? [S/N]: ");
            resposta = input.next().toUpperCase();
        }while (!resposta.equals("N"));

        int resultado = somandoVetor(vetor);

        System.out.printf("\nA soma dos números digitados foi %d", resultado);

        input.close();
    }
}
