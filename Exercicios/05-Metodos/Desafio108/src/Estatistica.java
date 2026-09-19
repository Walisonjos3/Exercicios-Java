import java.util.List;

public class Estatistica {

    static int maiorNumero(List<Integer> vetor){
        int maior = vetor.get(0);

        for (int valor: vetor){
            if (valor > maior){
                maior = valor;
            }
        }

        return maior;
    }

    static int menorNumero(List<Integer> vetor){
        int menor = vetor.get(0);

        for (int valor: vetor){
            if (valor < menor){
                menor = menor;
            }
        }

        return menor;
    }

    static double mediaVetor(List<Integer> vetor){
        int soma = 0;

        for (double valor: vetor){
            soma += valor;
        }

        double media = (double) soma / vetor.toArray().length;
        return media;
    }

    static int quantidadePares(List<Integer> vetor){
        int pares = 0;

        for (int valor: vetor){
            if (valor % 2 == 0){
                pares++;
            }
        }

        return pares;
    }

    static int quantidadeImpares(List<Integer> vetor){
        int impares = 0;

        for (int valor: vetor){
            if (valor % 2 != 0){
                impares++;
            }
        }

        return impares;
    }

    static int somaNumeros(List<Integer> vetor){
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }

        return soma;
    }
}
