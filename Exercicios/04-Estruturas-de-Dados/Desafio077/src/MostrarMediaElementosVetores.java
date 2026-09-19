// Ler 6 números, armazene-os em um vetor e mostre a média.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostrarMediaElementosVetores {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 6; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            numeros.add(numero);
        }

        for (int valor: numeros){
            soma += valor;
        }
        double media = (double) soma / 6;
        System.out.printf("Média dos números digitados: %.1f", media);
    }
}
