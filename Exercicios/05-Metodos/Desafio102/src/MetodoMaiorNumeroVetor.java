// Criar um método que receba um vetor e retorne o maior valor.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodoMaiorNumeroVetor {

    static int maiorNumeroVetor(List<Integer> vetor){
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

        return maior;
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

        int resultado = maiorNumeroVetor(vetor);

        System.out.printf("\nO maior digitado foi %d", resultado);

        input.close();
    }
}
