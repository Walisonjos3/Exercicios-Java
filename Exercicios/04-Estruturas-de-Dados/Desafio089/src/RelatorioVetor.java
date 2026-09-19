// Ler 15 números e adicionar em um vetor.
// Por fim, mostrar: maior número, menor número, soma, média, quantidade de pares e quantidade de ímpares.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelatorioVetor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        for (int i = 1; i <= 15; i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            vetor.add(numero);
        }
        int contador = 0;
        int maiorNumero = 0;
        int menorNumero = 0;
        int soma = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int valor: vetor){
            soma += valor;

            if (contador == 0){
                maiorNumero = valor;
                menorNumero = valor;
            }else {

                if (valor > maiorNumero){
                    maiorNumero = valor;
                }if (valor < menorNumero){
                    menorNumero = valor;
                }
            }

            if (valor % 2 == 0){
                quantidadePares++;
            }else {
                quantidadeImpares++;
            }

            contador++;
        }

        input.close();
        double media = (double) soma / 15;

        System.out.printf("Maior número digitado: %d\n", maiorNumero);
        System.out.printf("Menor número digitado: %d\n", menorNumero);
        System.out.printf("Soma dos valores digitados: %d\n", soma);
        System.out.printf("Média dos valores digitados: %.1f\n", media);
        System.out.printf("Quantidade de pares digitados: %d\n", quantidadePares);
        System.out.printf("Quantidade de ímpares digitados: %d\n", quantidadeImpares);
    }
}
