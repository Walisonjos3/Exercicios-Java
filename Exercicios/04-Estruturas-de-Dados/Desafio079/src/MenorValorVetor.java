// Ler 10 números e adicionar em um vetor. Por fim, informe qual é o menor.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenorValorVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }
        int menor = 0;
        int contador = 0;

        for (int valor: vetor){
            if (contador == 0){
                menor = valor;
            }else {

                if (valor < menor){
                    menor = valor;
                }
            }

            contador++;
        }

        System.out.printf("\nO menor número digitado foi: %d", menor);
    }
}
