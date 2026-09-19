// Ler números e adicionar em um vetor.
// Mostrar o maior número e em qual posição ele foi encontrado dentro do vetor.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumeroEmVetorEPosicao {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        System.out.print("Digite um número [ -1 para sair ]: ");
        int numero = input.nextInt();

        while (numero != -1){
            vetor.add(numero);
            System.out.print("Digite um número [ -1 para sair ]: ");
            numero = input.nextInt();
        }

        int contador = 0;
        int maior = 0;
        int posicaoDoMaior = 0;

        for (int valor: vetor){
            if (contador == 0){
                maior = valor;
            }else {

                if (valor > maior){
                    maior = valor;
                    posicaoDoMaior = contador;
                }
            }

            contador++;
        }

        input.close();

        System.out.printf("O maior número digitado foi %d na posição %d", maior, posicaoDoMaior + 1);
    }
}
