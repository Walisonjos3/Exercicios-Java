/*
Ler 20 números e utilizar métodos para mostrar:
maior;
menor;
média;
quantidade de pares;
quantidade de ímpares;
soma.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetorNumeros = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            System.out.print("Digite um número: ");
            vetorNumeros.add(input.nextInt());
        }

        int maiorNumero = Estatistica.maiorNumero(vetorNumeros);
        System.out.printf("O maior número digitado foi: %d%n", maiorNumero);

        int menorNumero = Estatistica.menorNumero(vetorNumeros);
        System.out.printf("O menor número digitado foi: %d%n", menorNumero);

        double mediaNumeros = Estatistica.mediaVetor(vetorNumeros);
        System.out.printf("A média dos números digitados foi: %.2f%n", mediaNumeros);

        int quantidadePares = Estatistica.quantidadePares(vetorNumeros);
        System.out.printf("Total de pares digitados: %d%n", quantidadePares);

        int quantidadeImpares = Estatistica.quantidadeImpares(vetorNumeros);
        System.out.printf("Total de ímpares digitados: %d%n", quantidadeImpares);

        input.close();

    }
}
